package com.rswaffle.chronicsmoker.init;

import java.util.ArrayList;
import java.util.List;

import com.rswaffle.chronicsmoker.objects.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	
	public static final Block BLOCK_PACKEDSMOKE = new BlockBase("block_packedsmoke", Material.CLOTH);
}
