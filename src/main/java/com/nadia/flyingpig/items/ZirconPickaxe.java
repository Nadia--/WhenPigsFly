package com.nadia.flyingpig.items;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ZirconPickaxe extends ItemPickaxe {

	private final String name = "zircon_pickaxe";
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
