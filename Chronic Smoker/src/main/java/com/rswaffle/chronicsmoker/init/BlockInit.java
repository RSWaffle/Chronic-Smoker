package com.rswaffle.chronicsmoker.init;

import java.util.ArrayList;
import java.util.List;

import com.rswaffle.chronicsmoker.objects.blocks.BlockBase;
import com.rswaffle.chronicsmoker.objects.blocks.BlockPackedSmoke;
import com.rswaffle.chronicsmoker.objects.blocks.BlockPlantTobacco;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	
	public static final Block BLOCK_PACKEDSMOKE = new BlockPackedSmoke("block_packedsmoke", Material.CLOTH);
	
	public static final Block PLANT_TOBACCO = new BlockPlantTobacco("plant_tobacco");
}
