package net.backporteddiscs.item;

import net.backporteddiscs.BackportedDiscs;
import net.backporteddiscs.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.RecordItem;

public class ModItems {
    public static final Item MUSIC_DISC_CREATOR = registerItem("music_disc_creator",
            new RecordItem(12, ModSounds.CREATOR_RECORD, new FabricItemSettings().stacksTo(1), 176));

    public static final Item MUSIC_DISC_CREATOR_MUSIC_BOX = registerItem("music_disc_creator_music_box",
            new RecordItem(11, ModSounds.CREATOR_MUSIC_BOX_RECORD, new FabricItemSettings().stacksTo(1), 73));

    public static final Item MUSIC_DISC_PRECIPICE = registerItem("music_disc_precipice",
            new RecordItem(13, ModSounds.PRECIPICE_RECORD, new FabricItemSettings().stacksTo(1), 299));

    public static final Item MUSIC_DISC_TEARS = registerItem("music_disc_tears",
            new RecordItem(10, ModSounds.TEARS_RECORD, new FabricItemSettings().stacksTo(1), 175));

    public static final Item MUSIC_DISC_LAVA_CHICKEN = registerItem("music_disc_lava_chicken",
            new RecordItem(9, ModSounds.LAVA_CHICKEN_RECORD, new FabricItemSettings().stacksTo(1), 135));

    private static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(BackportedDiscs.MOD_ID, name), item);
    }

    public static void registerModItems() {
        init();
    }

    public static void init() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(modifier -> {
            modifier.addAfter(Items.MUSIC_DISC_RELIC, MUSIC_DISC_CREATOR, MUSIC_DISC_CREATOR_MUSIC_BOX, MUSIC_DISC_PRECIPICE, MUSIC_DISC_TEARS, MUSIC_DISC_LAVA_CHICKEN);
        });
    }
}
