package com.redacted.horsepocalypse.item;

import com.redacted.horsepocalypse.Horsepocalypse;
import com.redacted.horsepocalypse.item.custom.HorseCleaverItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Horsepocalypse.MODID);

    public static final DeferredItem<Item> HORSE_CLEAVER = ITEMS.register("horse_cleaver",
            () -> new HorseCleaverItem(new Item.Properties()));

    public static final DeferredItem<Item> HORSE_LEG = ITEMS.register("horse_leg",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
