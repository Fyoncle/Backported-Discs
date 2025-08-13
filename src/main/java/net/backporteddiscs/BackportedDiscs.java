package net.backporteddiscs;

import net.backporteddiscs.item.ModItems;
import net.backporteddiscs.loot.LootIntegration;
import net.backporteddiscs.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

public class BackportedDiscs implements ModInitializer {
    public static final String MOD_ID = "backported-discs";

    @Override
    public void onInitialize() {
        ModSounds.registerModSounds();
        ModItems.registerModItems();
        LootIntegration.register();
    }
}