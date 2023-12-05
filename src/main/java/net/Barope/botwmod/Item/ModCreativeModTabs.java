package net.Barope.botwmod.Item;

import net.Barope.botwmod.BotwMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BotwMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> A_WEAPONS = CREATIVE_MODE_TABS.register("a_weapons",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.NETHERITE_SWORD))
                    .title(Component.translatable("creativetab.a_weapons"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.KOROKSEED.get());
                        pOutput.accept(ModItems.SPIRITORB.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> BOWS_AND_ARROWS = CREATIVE_MODE_TABS.register("bows_and_arrows",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.BOW))
                    .title(Component.translatable("creativetab.bows_and_arrows"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.KOROKSEED.get());
                        pOutput.accept(ModItems.SPIRITORB.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> C_SHIELDS = CREATIVE_MODE_TABS.register("c_shields",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.SHIELD))
                    .title(Component.translatable("creativetab.c_shields"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.KOROKSEED.get());
                        pOutput.accept(ModItems.SPIRITORB.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> D_ARMOR = CREATIVE_MODE_TABS.register("d_armor",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.NETHERITE_CHESTPLATE))
                    .title(Component.translatable("creativetab.d_armor"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.KOROKSEED.get());
                        pOutput.accept(ModItems.SPIRITORB.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> E_MATERIALS = CREATIVE_MODE_TABS.register("e_materials",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.APPLE))
                    .title(Component.translatable("creativetab.e_materials"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.KOROKSEED.get());
                        pOutput.accept(ModItems.SPIRITORB.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> FOOD = CREATIVE_MODE_TABS.register("food",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.COOKED_CHICKEN))
                    .title(Component.translatable("creativetab.food"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.KOROKSEED.get());
                        pOutput.accept(ModItems.SPIRITORB.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> G_KEY_ITEMS = CREATIVE_MODE_TABS.register("g_key_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SPIRITORB.get()))
                    .title(Component.translatable("creativetab.g_key_items"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.KOROKSEED.get());
                        pOutput.accept(ModItems.SPIRITORB.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
