package com.nadia.flyingpig.items;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ZirconAxe extends ItemAxe {

	private final String name = "zircon_axe";
	public ZirconAxe(ToolMaterial material) {
		super(material);
		
    	setUnlocalizedName(name);
    	setCreativeTab(CreativeTabs.tabTools);
    	GameRegistry.registerItem(this, name);
	}
	
	public String getName() {
		return name;
	}

}