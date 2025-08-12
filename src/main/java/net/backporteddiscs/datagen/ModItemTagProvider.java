package net.backporteddiscs.datagen;

import net.backporteddiscs.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(ModItems.MUSIC_DISC_CREATOR, ModItems.MUSIC_DISC_CREATOR_MUSIC_BOX, ModItems.MUSIC_DISC_PRECIPICE, ModItems.MUSIC_DISC_TEARS, ModItems.MUSIC_DISC_LAVA_CHICKEN);

        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.MUSIC_DISC_CREATOR, ModItems.MUSIC_DISC_CREATOR_MUSIC_BOX, ModItems.MUSIC_DISC_PRECIPICE, ModItems.MUSIC_DISC_TEARS, ModItems.MUSIC_DISC_LAVA_CHICKEN);
    }
}
