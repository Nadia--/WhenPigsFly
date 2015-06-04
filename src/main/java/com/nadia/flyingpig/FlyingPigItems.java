package com.nadia.flyingpig;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.nadia.flyingpig.items.ZirconArmor;
import com.nadia.flyingpig.items.ZirconAxe;
import com.nadia.flyingpig.items.ZirconPickaxe;
import com.nadia.flyingpig.items.ZirconSpade;
import com.nadia.flyingpig.items.ZirconSword;

public class FlyingPigItems {

    //ITEMS
    public static Item zircon; 
    
    //TOOLS
    public static Item zirconPickaxe;
    public static Item zirconAxe;
    public static Item zirconSpade;
    public static Item zirconSword;
    
    //ARMOR
    public static Item zirconHelmet;
    public static Item zirconChestplate;
    public static Item zirconLeggings;
    public static Item zirconBoots;

    //MATERIALS
    
    //static toolMaterial toolMaterial = EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability)
    static ToolMaterial zirconToolMaterial = EnumHelper.addToolMaterial("zirconToolMaterial", 5, 750, 50, 3.0F, 20);
    static ToolMaterial zirconSwordMaterial = EnumHelper.addToolMaterial("zirconSwordMaterial", 5, 750, 50, 8.0F, 20);
    static ToolMaterial zirconBettyMaterial = EnumHelper.addToolMaterial("zirconBettyMaterial", 5, 750, 50, 13.0F, 20);
    
    //static ArmorMaterial armorMaterial = EnumHelper.addArmorMaterial(name, durability, reductionAmounts, enchantability);
    static ArmorMaterial zirconArmorMaterial = EnumHelper.addArmorMaterial("zirconArmorMaterial", Reference.MOD_ID + ":" + "zircon", 760, new int[]{4,10,8,4}, 20);
    
	public static void init() {
		
		zircon = new Item();
		zircon.setUnlocalizedName("zircon");
		zircon.setCreativeTab(CreativeTabs.tabMaterials);
	
		zirconPickaxe = new ZirconPickaxe(zirconToolMaterial);
		zirconSpade = new ZirconSpade(zirconToolMaterial);
		zirconSword = new ZirconSword(zirconSwordMaterial);
		zirconAxe = new ZirconAxe(zirconBettyMaterial);
		
		zirconHelmet = new ZirconArmor("zircon_helmet", zirconArmorMaterial, 1, 0);
    	zirconChestplate = new ZirconArmor("zircon_chestplate", zirconArmorMaterial, 1, 1);
    	zirconLeggings = new ZirconArmor("zircon_leggings", zirconArmorMaterial, 2, 2);
    	zirconBoots = new ZirconArmor("zircon_boots", zirconArmorMaterial, 1, 3);
		
	}
	
	public static void register() {
		GameRegistry.registerItem(zircon, zircon.getUnlocalizedName().substring(5));
	}
	
	public static void registerRecipes() {
		
    	GameRegistry.addShapedRecipe(new ItemStack(zirconPickaxe), new Object[] {
    		"ZZZ",
    		" I ",
    		" I ", 'I', Items.iron_ingot, 'Z', zircon
    	});
    	
    	GameRegistry.addShapedRecipe(new ItemStack(zirconSpade), new Object[] {
    		"Z",
    		"I",
    		"I", 'I', Items.iron_ingot, 'Z', zircon
    	});
    	
    	GameRegistry.addShapedRecipe(new ItemStack(zirconSword), new Object[] {
    		"Z",
    		"Z",
    		"I", 'I', Items.iron_ingot, 'Z', zircon
    	});
    	
    	GameRegistry.addShapedRecipe(new ItemStack(zirconAxe), new Object[] {
    		"ZZ",
    		"ZI",
    		" I", 'I', Items.iron_ingot, 'Z', zircon
    	});
    	
    	GameRegistry.addShapedRecipe(new ItemStack(zirconAxe), new Object[] {
    		"ZZ",
    		"IZ",
    		"I ", 'I', Items.iron_ingot, 'Z', zircon
    	});
	}
	
	public static void registerRenders() {
		registerRender(zircon);
		registerRender(zirconPickaxe);
		registerRender(zirconSpade);
		registerRender(zirconSword);
		registerRender(zirconAxe);
		registerRender(zirconHelmet);
		registerRender(zirconChestplate); 
		registerRender(zirconLeggings); 
    	registerRender(zirconBoots);
	}
	
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
