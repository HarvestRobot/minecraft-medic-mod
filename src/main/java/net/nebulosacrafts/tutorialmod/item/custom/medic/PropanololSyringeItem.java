package net.nebulosacrafts.tutorialmod.item.custom.medic;

import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

/**
 * Drug that helps you to aim better with bows and crossbows
 */
public class PropanololSyringeItem extends UsableSyringe {

    public PropanololSyringeItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void personalAction(Player player, ItemStack stack){
        if(player.isHurt()){
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 1)); // cura 2 corazones

            if (!player.getAbilities().instabuild) {
                stack.shrink(1); // consumir jeringa
            }
        }
    }
}
