package net.backporteddiscs.loot;

import net.backporteddiscs.item.ModItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.advancements.critereon.DamageSourcePredicate;
import net.minecraft.advancements.critereon.EntityFlagsPredicate;
import net.minecraft.advancements.critereon.EntityPredicate;
import net.minecraft.advancements.critereon.TagPredicate;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.DamageSourceCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemKilledByPlayerCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

public class LootIntegration {

    public static void register() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (id.equals(EntityType.GHAST.getDefaultLootTable())) {
                TagPredicate<DamageType> projectilePredicate = TagPredicate.is(DamageTypeTags.IS_PROJECTILE);

                DamageSourcePredicate.Builder damageBuilder = DamageSourcePredicate.Builder.damageType()
                        .tag(projectilePredicate)
                        .direct(EntityPredicate.Builder.entity().of(EntityType.FIREBALL));

                tableBuilder.withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(ModItems.MUSIC_DISC_TEARS))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))
                        .when(LootItemKilledByPlayerCondition.killedByPlayer())
                        .when(DamageSourceCondition.hasDamageSource(damageBuilder))
                );
            }

            if (id.equals(EntityType.ZOMBIE.getDefaultLootTable())) {
                tableBuilder.withPool(LootPool.lootPool()
                        .add(LootItem.lootTableItem(ModItems.MUSIC_DISC_LAVA_CHICKEN))
                        .when(LootItemKilledByPlayerCondition.killedByPlayer())
                        .when(LootItemEntityPropertyCondition.hasProperties(
                                LootContext.EntityTarget.THIS,
                                EntityPredicate.Builder.entity()
                                        .flags(EntityFlagsPredicate.Builder.flags().setIsBaby(true).build())
                                        .vehicle(EntityPredicate.Builder.entity().of(EntityType.CHICKEN).build())
                        ))
                );
            }
        });
    }
}