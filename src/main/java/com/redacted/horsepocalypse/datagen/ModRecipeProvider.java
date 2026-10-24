package com.redacted.horsepocalypse.datagen;

import com.redacted.horsepocalypse.block.ModBlocks;
import com.redacted.horsepocalypse.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        /*ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ISAAC_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ISAACFROMTBOIREPENTANCEPLUS.get())
                .unlockedBy("has isaac", has(ModItems.ISAACFROMTBOIREPENTANCEPLUS)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ISAACFROMTBOIREPENTANCEPLUS.get(), 9)
                .requires(ModBlocks.ISAAC_BLOCK)
                .unlockedBy("has_isaac_block", has(ModBlocks.ISAAC_BLOCK.get())).save(recipeOutput);

         */

    }
}
