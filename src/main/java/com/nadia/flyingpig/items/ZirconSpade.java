package com.nadia.flyingpig.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ZirconSpade extends ItemSpade {

	private final String name = "zircon_spade";
	public ZirconSpade(ToolMaterial material) {
		super(material);
		
    	setUnlocalizedName(name);
    	setCreativeTab(CreativeTabs.tabTools);
    	GameRegistry.registerItem(this, name);
	}
	
	public String getName() {
		return name;
	}

}