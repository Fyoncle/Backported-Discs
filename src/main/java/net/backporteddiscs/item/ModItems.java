package net.backporteddiscs.item;

import net.backporteddiscs.Backporteddiscs;
import net.backporteddiscs.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MUSIC_DISC_CREATOR = registerItem("music_disc_creator",
            new MusicDiscItem(12, ModSounds.CREATOR_RECORD, new FabricItemSettings().maxCount(1), 176));

    public static final Item MUSIC_DISC_CREATOR_MUSIC_BOX = registerItem("music_disc_creator_music_box",
            new MusicDiscItem(11, ModSounds.CREATOR_MUSIC_BOX_RECORD, new FabricItemSettings().maxCount(1), 73));

    public static final Item MUSIC_DISC_PRECIPICE = registerItem("music_disc_precipice",
            new MusicDiscItem(13, ModSounds.PRECIPICE_RECORD, new FabricItemSettings().maxCount(1), 299));

    public static final Item MUSIC_DISC_TEARS = registerItem("music_disc_tears",
            new MusicDiscItem(10, ModSounds.TEARS_RECORD, new FabricItemSettings().maxCount(1), 175));

    public static final Item MUSIC_DISC_LAVA_CHICKEN = registerItem("music_disc_lava_chicken",
            new MusicDiscItem(9, ModSounds.LAVA_CHICKEN_RECORD, new FabricItemSettings().maxCount(1), 135));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Backporteddiscs.MOD_ID, name), item);
    }

    public static void registerModItems() {
        init();
    }

    public static void init() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(modifier -> {
            modifier.addAfter(Items.MUSIC_DISC_RELIC, MUSIC_DISC_CREATOR, MUSIC_DISC_CREATOR_MUSIC_BOX, MUSIC_DISC_PRECIPICE, MUSIC_DISC_TEARS, MUSIC_DISC_LAVA_CHICKEN);
        });
    }
}
