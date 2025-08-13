package net.backporteddiscs.datagen;

import net.backporteddiscs.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.MUSIC_DISC_CREATOR)
                .add(ModItems.MUSIC_DISC_CREATOR_MUSIC_BOX)
                .add(ModItems.MUSIC_DISC_PRECIPICE)
                .add(ModItems.MUSIC_DISC_TEARS)
                .add(ModItems.MUSIC_DISC_LAVA_CHICKEN);
    }
}