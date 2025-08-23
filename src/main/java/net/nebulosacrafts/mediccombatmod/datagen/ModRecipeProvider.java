package net.nebulosacrafts.mediccombatmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.nebulosacrafts.mediccombatmod.item.ModItems;
import net.nebulosacrafts.mediccombatmod.util.ModTags;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

/**
 * Esta clase contiene las recetas.
 */
public class ModRecipeProvider extends RecipeProvider {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> pWriter) {

        // Syringe
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SYRINGE.get())
                .pattern("  N")
                .pattern(" G ")
                .pattern("G  ")
                .define('N', Items.IRON_NUGGET)
                .define('G', Items.GLASS_PANE)
                .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET))
                .save(pWriter);

        // Healing syringe
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.HEALING_SYRINGE.get(), 2)
                .requires(ModItems.SYRINGE.get())
                .requires(Items.GLISTERING_MELON_SLICE)
                .unlockedBy(getHasName(ModItems.SYRINGE.get()), has(ModItems.SYRINGE.get()))
                .save(pWriter);

        // Strange syringe
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STRANGE_SYRINGE.get(), 2)
                .requires(ModItems.SYRINGE.get())
                .requires(ModTags.Items.MUSHROOMS)
                .unlockedBy(getHasName(ModItems.SYRINGE.get()), has(ModItems.SYRINGE.get()))
                .save(pWriter);
    }
}
