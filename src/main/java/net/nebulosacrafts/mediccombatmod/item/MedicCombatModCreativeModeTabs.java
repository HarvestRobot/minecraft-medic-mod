package net.nebulosacrafts.mediccombatmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.nebulosacrafts.mediccombatmod.MedicCombatMod;

public class MedicCombatModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister
                    .create(Registries.CREATIVE_MODE_TAB, MedicCombatMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MEDIC_COMBAT_MOD =
            CREATIVE_MODE_TABS.register("medic_tab",
                    () -> CreativeModeTab.builder().icon(
                    () -> new ItemStack(ModItems.SYRINGE.get()))
                            .title(Component.translatable("creativetab.medic_tab"))
                            .displayItems((pParameters, pOutput) -> {

                                // syringes
                                pOutput.accept(ModItems.HEALING_SYRINGE.get());
                                pOutput.accept(ModItems.STRANGE_SYRINGE.get());
                                pOutput.accept(ModItems.SYRINGE.get());
                                /*
                                Para poner todos los objetos de ModItems en la misma Tab ->
                                .displayItems((pParameters, pOutput) -> {
                                    for(RegistryObject<Item> item : ModItems.ITEMS.getEntries()) {
                                        pOutput.accept(item.get());
                                    }
                                })
                                 */
                            })
                            .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
