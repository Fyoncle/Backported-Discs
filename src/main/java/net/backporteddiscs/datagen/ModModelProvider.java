package net.backporteddiscs.datagen;

import net.backporteddiscs.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(ModItems.MUSIC_DISC_CREATOR, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.MUSIC_DISC_CREATOR_MUSIC_BOX, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.MUSIC_DISC_PRECIPICE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.MUSIC_DISC_TEARS, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.MUSIC_DISC_LAVA_CHICKEN, ModelTemplates.FLAT_ITEM);
    }
}