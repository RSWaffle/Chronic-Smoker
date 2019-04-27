package com.rswaffle.chronicsmoker.util;

import com.rswaffle.chronicsmoker.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SmokerTab extends CreativeTabs
{

	public SmokerTab(String label) 
	{
		super("smokertab");
	}

	
	@Override
	public ItemStack getTabIconItem() 
	{	
		return new ItemStack(ItemInit.ITEM_CIGARETTE);
	}

}
