package com.rswaffle.chronicsmoker.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockPackedSmoke extends BlockBase
{

	public BlockPackedSmoke(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.CLOTH);
		setHardness(0.2f);
		setResistance(0.5f);
		
		//settings to use for other blocks
		//setHarvestLevel("hand", 0);
		//setLightLevel();
		//setUnharvestable();
		
	}
	
}
