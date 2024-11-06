package ru.metla.tatardelight.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import ru.metla.tatardelight.Tatardelight;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Tatardelight.MODID);


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }

    public static final RegistryObject<Item> TATARHAT = ITEMS.register("tatehat",
            ()-> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> POTATOCUBICS = ITEMS.register("potatocubics",
            ()-> new Item(new Item.Properties().stacksTo(64).food(ModFood.POTATOCUBICS)));
    public static final RegistryObject<Item> BEFFCUBICS = ITEMS.register("beffcubics",
            ()-> new Item(new Item.Properties().stacksTo(64).food(ModFood.BEFFCUBICS)));
    public static final RegistryObject<Item> ECHPOCHMAK = ITEMS.register("echpochmak",
            ()-> new Item(new Item.Properties().stacksTo(64).food(ModFood.ECHPOCHMAK)));
    public static final RegistryObject<Item> COOKED_ECHPOCHMAK = ITEMS.register("cooked_echpochmak",
            ()-> new Item(new Item.Properties().stacksTo(64).food(ModFood.COOKED_ECHPOCHMAK)));

}
