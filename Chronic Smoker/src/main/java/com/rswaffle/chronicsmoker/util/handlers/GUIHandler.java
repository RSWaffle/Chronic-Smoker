package com.rswaffle.chronicsmoker.util.handlers;

import com.rswaffle.chronicsmoker.objects.blocks.machine.rollingmachine.ContainerRollingMachine;
import com.rswaffle.chronicsmoker.objects.blocks.machine.rollingmachine.GUIRollingMachine;
import com.rswaffle.chronicsmoker.objects.blocks.machine.rollingmachine.TileEntityRollingMachine;
import com.rswaffle.chronicsmoker.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GUIHandler implements IGuiHandler
{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_ROLLINGMACHINE) return new ContainerRollingMachine(player.inventory, (TileEntityRollingMachine)world.getTileEntity(new BlockPos(x,y,z)));
		
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_ROLLINGMACHINE) return new GUIRollingMachine(player.inventory, (TileEntityRollingMachine)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

}
