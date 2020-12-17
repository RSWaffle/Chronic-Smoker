package com.rswaffle.chronicsmoker.util;

import com.rswaffle.chronicsmoker.ChronicSmoker;
import com.rswaffle.chronicsmoker.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ChronicSmoker.MOD_ID);

    public static void Init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> CIGARETTE = ITEMS.register("cigarette", ItemBase::new);
}
