package net.backporteddiscs.sound;

import net.backporteddiscs.Backporteddiscs;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent CREATOR_RECORD = registerSoundEvent("creator_record");
    public static final SoundEvent CREATOR_MUSIC_BOX_RECORD = registerSoundEvent("creator_music_box_record");
    public static final SoundEvent PRECIPICE_RECORD = registerSoundEvent("precipice_record");
    public static final SoundEvent TEARS_RECORD = registerSoundEvent("tears_record");
    public static final SoundEvent LAVA_CHICKEN_RECORD = registerSoundEvent("lava_chicken_record");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(Backporteddiscs.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerModSounds() {}
}
