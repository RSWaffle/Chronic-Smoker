package com.rswaffle.chronicsmoker.objects.items.cigarettes;

import com.rswaffle.chronicsmoker.Main;
import com.rswaffle.chronicsmoker.init.ItemInit;
import com.rswaffle.chronicsmoker.objects.items.ItemBase;


import com.rswaffle.chronicsmoker.util.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.*;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ItemCigarette extends Item implements IHasModel
{
	EnumParticleTypes type;

	int potionID;
	int duration;
	int amplifier;
	int damage;

	public ItemCigarette(String name)
	{
		init(name);
	}

	public ItemCigarette(String name, int damage, int potionID, int duration, int amplifier, EnumParticleTypes type)
	{
		init(name);
		setDamage(damage);
		setPotion(potionID, duration, amplifier);
		setParticle(type);
	}

	public void init(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.smokertab);

		ItemInit.ITEMS.add(this);

		potionID = 1;
		duration = 100;
		amplifier = 0;
		damage = 1;

		type = EnumParticleTypes.SMOKE_NORMAL;
	}

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");

	}

	public void setPotion(int potionID, int duration, int amplifier)
	{
		this.potionID = potionID;
		this.duration = duration;
		this.amplifier = amplifier;

		type = EnumParticleTypes.SMOKE_NORMAL;
	}

	public void setParticle(EnumParticleTypes type)
	{
		this.type = type;
	}

	public void setDamage(int damage)
	{
		this.damage = damage;
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack item = playerIn.getHeldItem(handIn);
		Vec3d aim = playerIn.getLookVec();

		
		worldIn.spawnParticle(type, playerIn.posX + 0 + aim.x,
							  playerIn.posY + 1.5 + aim.y, playerIn.posZ + 0 + aim.z,
							  0, 0, 0);

		playerIn.attackEntityFrom(DamageSource.GENERIC, damage);
		playerIn.addPotionEffect((new PotionEffect(Potion.getPotionById(potionID),  duration , amplifier)));

		item.shrink(1);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
	}
	
}
