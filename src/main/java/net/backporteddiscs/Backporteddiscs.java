package net.backporteddiscs;

import net.backporteddiscs.item.ModItems;
import net.backporteddiscs.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

public class Backporteddiscs implements ModInitializer {
	public static final String MOD_ID = "backported-discs";

	@Override
	public void onInitialize() {
		ModSounds.registerModSounds();
		ModItems.registerModItems();
	}
}