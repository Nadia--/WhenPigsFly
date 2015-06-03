package com.nadia.flyingpig.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ZirconItem extends Item {
	private final String name = "Zircon";
	
	public ZirconItem() {
		setUnlocalizedName(name);
		setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(this, name);
	}
	
	public String getName() {
		return name;
	}

}

