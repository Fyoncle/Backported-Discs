package net.backporteddiscs.sound;

import net.backporteddiscs.BackportedDiscs;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class ModSounds {
    public static final SoundEvent CREATOR_RECORD = registerSoundEvent("creator_record");
    public static final SoundEvent CREATOR_MUSIC_BOX_RECORD = registerSoundEvent("creator_music_box_record");
    public static final SoundEvent PRECIPICE_RECORD = registerSoundEvent("precipice_record");
    public static final SoundEvent TEARS_RECORD = registerSoundEvent("tears_record");
    public static final SoundEvent LAVA_CHICKEN_RECORD = registerSoundEvent("lava_chicken_record");

    private static SoundEvent registerSoundEvent(String name) {
        ResourceLocation id = new ResourceLocation(BackportedDiscs.MOD_ID, name);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
    }

    public static void registerModSounds() {
    }
}
