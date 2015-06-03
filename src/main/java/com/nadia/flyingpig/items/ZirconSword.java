package com.nadia.flyingpig.items;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ZirconSword extends ItemSword {

	private final String name = "zircon_sword";
	public ZirconSword(ToolMaterial material) {
		super(material);
		
    	setUnlocalizedName(name);
    	setCreativeTab(CreativeTabs.tabTools);
    	GameRegistry.registerItem(this, name);
	}
	
	public String getName() {
		return name;
	}

}