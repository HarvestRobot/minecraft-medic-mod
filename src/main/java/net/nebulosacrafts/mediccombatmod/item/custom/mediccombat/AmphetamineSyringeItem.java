package net.nebulosacrafts.mediccombatmod.item.custom.mediccombat;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

/**
 * Drug that makes you wanna move those bones
 */
public class AmphetamineSyringeItem extends UsableSyringe {

    public AmphetamineSyringeItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void personalAction(Player player, ItemStack stack){
        if(player.isHurt()){
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 2)); // movement speed boost

            if (!player.getAbilities().instabuild) {
                stack.shrink(1); // consumir jeringa
            }
        }
    }
}
