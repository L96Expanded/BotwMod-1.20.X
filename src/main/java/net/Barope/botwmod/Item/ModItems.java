package net.Barope.botwmod.Item;

import org.apache.http.config.Registry;

import net.Barope.botwmod.BotwMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BotwMod.MOD_ID);

    public static final RegistryObject<Item> KOROKSEED = ITEMS.register("korokseed", 
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPIRITORB= ITEMS.register("spiritorb", 
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPIRITBOW= ITEMS.register("spiritbow",
        () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}




