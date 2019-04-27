package com.rswaffle.chronicsmoker.objects.items;

import com.rswaffle.chronicsmoker.Main;
import com.rswaffle.chronicsmoker.init.ItemInit;
import com.rswaffle.chronicsmoker.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.smokertab);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
}
