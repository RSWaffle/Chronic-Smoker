package com.rswaffle.chronicsmoker.init;

import java.util.ArrayList;
import java.util.List;

import com.rswaffle.chronicsmoker.objects.items.ItemBase;
import com.rswaffle.chronicsmoker.objects.items.ItemTobaccoSeed;
import com.rswaffle.chronicsmoker.objects.items.cigarettes.ItemCigarette;
import com.rswaffle.chronicsmoker.objects.items.food.ItemCustomFood;

import net.minecraft.item.Item;

public class ItemInit
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Items
	public static final Item ITEM_TOBACCO = new ItemCustomFood("item_tobacco", 1, false);
	public static final Item ITEM_PACK_OF_CIGARETTES = new ItemBase("item_pack_of_cigarettes");
	
	//Cigarettes
	public static final Item ITEM_CIGARETTE = new ItemCigarette("item_cigarette");
	
	//Crops
	public static final Item ITEM_SEED_TOBACCO = new ItemTobaccoSeed("item_seed_tobacco");
}
