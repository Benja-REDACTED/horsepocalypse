package com.redacted.horsepocalypse.item.custom;

import com.redacted.horsepocalypse.Horsepocalypse;
import com.redacted.horsepocalypse.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;

import java.util.ArrayList;
import java.util.List;

@EventBusSubscriber(modid = "horsepocalypse")
public class HorseCleaverItem extends Item {
    public HorseCleaverItem(Properties properties) {
        super(properties);
    }

    @SubscribeEvent
    public static InteractionResult onPlayerInteractEntityInteract(PlayerInteractEvent.EntityInteract event) {
        Level level = event.getLevel();
        Entity entity = event.getTarget();
        List<ItemStack> horseDrops = new ArrayList<>();
        horseDrops.add(new ItemStack(ModItems.HORSE_LEG.get(), 4));
        Vec3 pos = entity.getPosition(0f);


        if(!level.isClientSide) {
            if(entity.getType() == EntityType.HORSE) {
                entity.hurt(entity.damageSources().generic(), 1000f);
                for (ItemStack horseDrop : horseDrops) {
                    level.addFreshEntity(new ItemEntity(level, pos.x + Math.random(), pos.y + (Math.random() * 6), pos.z  + Math.random(), horseDrop));
                }

                return InteractionResult.SUCCESS;
            }

            return InteractionResult.FAIL;
        };
        return InteractionResult.PASS;
    }

}
