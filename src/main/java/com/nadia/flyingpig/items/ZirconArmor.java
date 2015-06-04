package com.nadia.flyingpig.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.nadia.flyingpig.FlyingPigItems;
import com.nadia.flyingpig.Reference;

public class ZirconArmor extends ItemArmor {
	
	private final String name;
	
	public ZirconArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
		
		name = unlocalizedName;
    	setUnlocalizedName(name);
    	setCreativeTab(CreativeTabs.tabCombat);
    	GameRegistry.registerItem(this, name);
	}
	
    public String getName() {
    	return name;
    }
    	
	/**
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		//The leggings are stored on layer_2, the rest are stored on layer_1
		return Reference.MOD_ID + ":textures/armor/" + textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
		
			//return Reference.MOD_ID + ":models/armor/zircon_layer_2.png";
	}
	**/
}
