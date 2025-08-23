package net.nebulosacrafts.mediccombatmod.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.nebulosacrafts.mediccombatmod.MedicCombatMod;

public class ModTags {

    public static class Blocks{

        private static TagKey<Block> tag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(MedicCombatMod.MOD_ID, name));
        }
    }

    public static class Items {
        private static TagKey<Item> tag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(MedicCombatMod.MOD_ID, name));
        }
        public static final TagKey<Item> MUSHROOMS =
                ItemTags.create(ResourceLocation.fromNamespaceAndPath(MedicCombatMod.MOD_ID, "mushrooms"));
        public static final TagKey<Item> SYRINGES =
                ItemTags.create(ResourceLocation.fromNamespaceAndPath(MedicCombatMod.MOD_ID, "syringes"));
    }
}
