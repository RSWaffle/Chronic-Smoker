package com.rswaffle.chronicsmoker.objects.items.cigarettes;

import com.rswaffle.chronicsmoker.objects.items.ItemBase;

import net.minecraft.client.particle.Particle;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ItemCigarette extends ItemBase 
{

	public ItemCigarette(String name) 
	{
		super(name);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack item = playerIn.getHeldItem(handIn);
		Vec3d aim = playerIn.getLookVec();
		
		
		worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, playerIn.posX + 0 + aim.x,
							  playerIn.posY + 1.5 + aim.y, playerIn.posZ + 0 + aim.z,
							  0, 0, 0);
		
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
	}
	
}
