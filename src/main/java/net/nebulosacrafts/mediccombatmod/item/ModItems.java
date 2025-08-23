package net.nebulosacrafts.mediccombatmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nebulosacrafts.mediccombatmod.MedicCombatMod;
import net.nebulosacrafts.mediccombatmod.item.custom.mediccombat.*;

public class ModItems {

    // Deferred register es una lista de algo, en este caso Item
    // Cuando añadamos aquí los items se registarán en un momento específico para que Forge los inyecte
    // Al mod
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MedicCombatMod.MOD_ID);
    //syringes
    public static final RegistryObject<Item> HEALING_SYRINGE = ITEMS.register("healing_syringe", () -> new HealingSyringeItem(new Item.Properties().stacksTo(8)));
    public static final RegistryObject<Item> STRANGE_SYRINGE = ITEMS.register("strange_syringe", () -> new StrangeSyringeItem(new Item.Properties().stacksTo(8)));
    public static final RegistryObject<Item> DMT_SYRINGE = ITEMS.register("dmt_syringe", () -> new DMTSyringeItem(new Item.Properties().stacksTo(8)));
    public static final RegistryObject<Item> PROPANOLOL_SYRINGE = ITEMS.register("propanolol_syringe", () -> new PropanololSyringeItem(new Item.Properties().stacksTo(8)));
    public static final RegistryObject<Item> AMPHETAMINE_SYRINGE = ITEMS.register("amphetamine_syringe", () -> new AmphetamineSyringeItem(new Item.Properties().stacksTo(8)));

    public static final RegistryObject<Item> SYRINGE = ITEMS.register("syringe", () -> new SyringeItem(new Item.Properties()));

    // Método estático para poder acceder a registrar los elementos en el eventBus que habrá en la clase main
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
