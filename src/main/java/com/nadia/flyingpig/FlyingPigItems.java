package com.nadia.flyingpig;

import com.nadia.flyingpig.items.ZirconAxe;
import com.nadia.flyingpig.items.ZirconPickaxe;
import com.nadia.flyingpig.items.ZirconSpade;
import com.nadia.flyingpig.items.ZirconSword;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

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
    static ArmorMaterial zirconArmorMaterial = EnumHelper.addArmorMaterial("zirconArmorMaterial", null, 760, new int[]{4,10,8,4}, 20);
    
	public static void init() {
		
		zircon = new Item();
		zircon.setUnlocalizedName("zircon");
		zircon.setCreativeTab(CreativeTabs.tabMaterials);
	
		zirconPickaxe = new ZirconPickaxe(zirconToolMaterial);
		zirconSpade = new ZirconSpade(zirconToolMaterial);
		zirconSword = new ZirconSword(zirconSwordMaterial);
		zirconAxe = new ZirconAxe(zirconBettyMaterial);
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
	}
	
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
