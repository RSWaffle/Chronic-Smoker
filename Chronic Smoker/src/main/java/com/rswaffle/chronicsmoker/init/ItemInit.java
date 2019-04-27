package com.rswaffle.chronicsmoker.init;

import java.util.ArrayList;
import java.util.List;

import com.rswaffle.chronicsmoker.objects.items.ItemBase;

import net.minecraft.item.Item;

public class ItemInit
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item ITEM_CIGARETTE = new ItemBase("item_cigarette");
}
