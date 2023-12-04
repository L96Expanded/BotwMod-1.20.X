package net.Barope.botwmod.Item;

import net.Barope.botwmod.BotwMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BotwMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BOTW_TAB = CREATIVE_MODE_TABS.register("botw_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SPIRITORB.get()))
                    .title(Component.translatable("creativetab.botw_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.KOROKSEED.get());
                        pOutput.accept(ModItems.SPIRITORB.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
