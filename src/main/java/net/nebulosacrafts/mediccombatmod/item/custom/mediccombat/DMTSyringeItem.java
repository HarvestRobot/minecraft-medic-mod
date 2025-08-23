package net.nebulosacrafts.mediccombatmod.item.custom.mediccombat;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

/**
 * Psychodelic drug
 */
public class DMTSyringeItem extends UsableSyringe {

    public DMTSyringeItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void personalAction(Player player, ItemStack stack){
        if(player.isHurt()){
            double roll = Math.random();

            if (roll < 0.3f) { //30% probabilidades
                player.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 80));
                player.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 80));
            } else if (roll > 0.3f && roll < 0.6f) { //otro 30%, pero solo entra si no entró en el anterior
                player.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 120));
                player.addEffect(new MobEffectInstance(MobEffects.BAD_OMEN, 120));
            } else if (roll > 0.6f){
                player.addEffect(new MobEffectInstance(MobEffects.GLOWING, 350));
                player.addEffect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 350));
            }

            if (!player.getAbilities().instabuild) {
                stack.shrink(1); // consumir jeringa
            }
        }
    }
}
