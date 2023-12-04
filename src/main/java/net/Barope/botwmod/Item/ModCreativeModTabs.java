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

    public static final RegistryObject<CreativeModeTab> WEAPONS = CREATIVE_MODE_TABS.register("weapons",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.NETHERITE_SWORD))
                    .title(Component.translatable("weapons"))
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

    public static final RegistryObject<CreativeModeTab> SHIELDS = CREATIVE_MODE_TABS.register("shields",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.SHIELD))
                    .title(Component.translatable("creativetab.shields"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.KOROKSEED.get());
                        pOutput.accept(ModItems.SPIRITORB.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> ARMOR = CREATIVE_MODE_TABS.register("armor",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.NETHERITE_CHESTPLATE))
                    .title(Component.translatable("creativetab.armor"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.KOROKSEED.get());
                        pOutput.accept(ModItems.SPIRITORB.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> MATERIALS = CREATIVE_MODE_TABS.register("materials",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.APPLE))
                    .title(Component.translatable("creativetab.materials"))
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

    public static final RegistryObject<CreativeModeTab> KEY_ITEMS = CREATIVE_MODE_TABS.register("key_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SPIRITORB.get()))
                    .title(Component.translatable("creativetab.key_items"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.KOROKSEED.get());
                        pOutput.accept(ModItems.SPIRITORB.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
