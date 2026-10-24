package com.redacted.horsepocalypse.datagen;

import com.redacted.horsepocalypse.Horsepocalypse;
import com.redacted.horsepocalypse.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Horsepocalypse.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.HORSE_LEG.get());
        basicItem(ModItems.HORSE_CLEAVER.get());
    }
}
