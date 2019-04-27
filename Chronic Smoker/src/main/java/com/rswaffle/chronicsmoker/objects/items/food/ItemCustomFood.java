package com.rswaffle.chronicsmoker.objects.items.food;

import com.rswaffle.chronicsmoker.Main;
import com.rswaffle.chronicsmoker.init.ItemInit;
import com.rswaffle.chronicsmoker.util.IHasModel;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemCustomFood extends ItemFood implements IHasModel 
{
	public ItemCustomFood(String name, int amount, boolean isWolfFood)
	{
		super(amount, isWolfFood);
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
