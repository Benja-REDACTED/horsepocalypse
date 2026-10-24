package com.redacted.horsepocalypse.item;

import com.redacted.horsepocalypse.Horsepocalypse;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Horsepocalypse.MODID);

    //public static final DeferredItem<Item> ISAACFROMTBOIREPENTANCEPLUS = ITEMS.register("isaacfromtboirepentanceplus",
    //        () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
