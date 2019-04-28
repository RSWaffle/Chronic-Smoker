package com.rswaffle.chronicsmoker.util.compatibility.jei;

import java.util.IllegalFormatException;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import net.minecraft.util.text.translation.I18n;

@JEIPlugin
public class JEICompatibility implements IModPlugin
{
	@Override
	public void registerCategories(IRecipeCategoryRegistration registry)
	{
		final IJeiHelpers helpers = registry.getJeiHelpers();
		final IGuiHelper gui = helpers.getGuiHelper();
		
		registry.addRecipeCategories(); //when i make a machine make sure to put it into the recipe category and call it from here
	}
	
	@Override
	public void register(IModRegistry registry)
	{
		
	}
	
	public static String translateToLocal(String key)
	{
		if(I18n.canTranslate(key))
		{
			return I18n.translateToLocal(key);
		}
		else
		{
			return I18n.translateToFallback(key);
		}
	}
	
	public static String translateToLocalFormatted(String key, Object ... format)
	{
		String s = translateToLocal(key);
		try
		{
			return String.format(s, format);
		}
		catch(IllegalFormatException e)
		{
			return "Format Error: " + s;
		}
		
	}
}
