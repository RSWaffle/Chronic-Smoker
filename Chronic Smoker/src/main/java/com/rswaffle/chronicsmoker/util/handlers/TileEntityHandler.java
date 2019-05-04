package com.rswaffle.chronicsmoker.util.handlers;

import com.rswaffle.chronicsmoker.objects.blocks.machine.rollingmachine.TileEntityRollingMachine;
import com.rswaffle.chronicsmoker.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityRollingMachine.class, new ResourceLocation(Reference.MODID + ":rolling_machine"));

	}
}
