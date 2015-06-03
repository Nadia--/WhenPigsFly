package com.nadia.flyingpig.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.nadia.flyingpig.FlyingPigItems;
import com.nadia.flyingpig.Reference;

public class ZirconArmor extends ItemArmor {

	public ZirconArmor(ArmorMaterial material, int armorType) {
		super(material, 0, armorType);
		// TODO Auto-generated constructor stub
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		//The leggings are stored on layer_2, the rest are stored on layer_1
		if (stack.getItem() == FlyingPigItems.zirconLeggings) {
			return Reference.MOD_ID + ":models/armor/zircon_layer_2.png";
		} else {
			return Reference.MOD_ID + ":models/armor/zircon_layer_1.png";
		}
	}

}
