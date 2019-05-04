package com.rswaffle.chronicsmoker.objects.blocks.machine.rollingmachine;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.rswaffle.chronicsmoker.init.ItemInit;
 
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class RollingMachineRecipes 
{	
	private static final RollingMachineRecipes INSTANCE = new RollingMachineRecipes();
	private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static RollingMachineRecipes getInstance()
	{
		return INSTANCE;
	}
	
	private RollingMachineRecipes() 
	{
		addRollingMachineRecipe(new ItemStack(ItemInit.ITEM_TOBACCO), new ItemStack(Items.PAPER), new ItemStack(ItemInit.ITEM_CIGARETTE, 4), 5.0F);
	}

	
	public void addRollingMachineRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience) 
	{
		if(getRollingMachineResult(input1, input2) != ItemStack.EMPTY) return;
		this.smeltingList.put(input1, input2, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getRollingMachineResult(ItemStack input1, ItemStack input2) 
	{
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet()) 
		{
			if(this.compareItemStacks(input1, (ItemStack)entry.getKey())) 
			{
				for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) 
				{
					if(this.compareItemStacks(input2, (ItemStack)ent.getKey())) 
					{
						return (ItemStack)ent.getValue();
					}
				}
			}
		}
		return ItemStack.EMPTY;
	}
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
	{
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList() 
	{
		return this.smeltingList;
	}
	
	public float getRollingExperience(ItemStack stack)
	{
		for (Entry<ItemStack, Float> entry : this.experienceList.entrySet()) 
		{
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey())) 
			{
				return ((Float)entry.getValue()).floatValue();
			}
		}
		return 0.0F;
	}
}
