package dev.lieonlion.stam1ocreatetweaks.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.simibubi.create.AllTags;
import com.simibubi.create.compat.jei.StockKeeperTransferHandler;
import com.simibubi.create.content.contraptions.actors.seat.SeatEntity;
import com.simibubi.create.content.logistics.stockTicker.StockKeeperRequestScreen;
import com.simibubi.create.content.logistics.stockTicker.StockTickerBlockEntity;
import com.simibubi.create.infrastructure.ponder.scenes.highLogistics.StockTickerScenes;
import dev.lieonlion.stam1ocreatetweaks.tags.Stam1oTweaksItemTags;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value = LivingEntity.class)
public abstract class LivingEntityMixin {
    @Shadow public abstract ItemStack getItemBySlot(EquipmentSlot equipmentSlot);

    @ModifyExpressionValue(method = "travel", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/LivingEntity;hasEffect(Lnet/minecraft/core/Holder;)Z", ordinal = 2))
    private boolean travel(boolean original) {
        return original && !getItemBySlot(EquipmentSlot.FEET).is(Stam1oTweaksItemTags.PREVENTS_LEVITATION);
    }
}