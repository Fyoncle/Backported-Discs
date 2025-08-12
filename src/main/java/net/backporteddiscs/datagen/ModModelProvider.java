package net.backporteddiscs.datagen;

import net.backporteddiscs.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {}

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.MUSIC_DISC_CREATOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_CREATOR_MUSIC_BOX, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_PRECIPICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_TEARS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_LAVA_CHICKEN, Models.GENERATED);
    }
}
