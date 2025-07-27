package dev.lieonlion.stam1ocreatetweaks.tags;

import dev.lieonlion.stam1ocreatetweaks.Stam1oTweaks;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class Stam1oTweaksItemTags {
    public static final TagKey<Item> PREVENTS_LEVITATION = createTag("prevents/levitation");

    private static TagKey<Item> createTag(String name) {
        return TagKey.create(Registries.ITEM, Stam1oTweaks.asId(name));
    }
}