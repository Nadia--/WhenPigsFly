package com.nadia.flyingpig.items;

import com.nadia.flyingpig.WhenPigsFlyMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ZirconPickaxe extends ItemPickaxe {

	private final String name = "Zircon Pickaxe";
	public ZirconPickaxe(ToolMaterial material) {
		super(material);
		
    	setUnlocalizedName(name);
    	setCreativeTab(CreativeTabs.tabTools);
    	GameRegistry.registerItem(this, name);
	}
	
	public String getName() {
		return name;
	}

}
