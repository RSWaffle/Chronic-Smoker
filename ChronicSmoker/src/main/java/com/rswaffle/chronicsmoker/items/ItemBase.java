package com.rswaffle.chronicsmoker.items;

import com.rswaffle.chronicsmoker.ChronicSmoker;
import net.minecraft.item.Item;

public class ItemBase extends Item
{
    public ItemBase()
    {
        super(new Item.Properties().group(ChronicSmoker.TAB));
    }
}
