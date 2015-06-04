package com.nadia.flyingpig;

import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

import com.nadia.flyingpig.entity.Entity_FlyingPig;
import com.nadia.flyingpig.items.ZirconArmor;
import com.nadia.flyingpig.items.ZirconAxe;
import com.nadia.flyingpig.items.ZirconPickaxe;
import com.nadia.flyingpig.items.ZirconSpade;
import com.nadia.flyingpig.items.ZirconSword;
import com.nadia.flyingpig.proxies.CommonProxyVT;
 
//@Mod(modid = WhenPigsFlyMod.MODID, version = WhenPigsFlyMod.VERSION)
public class WhenPigsFlyMod
{
	
	//@SidedProxy(clientSide = "com.example.visiontech.proxies.ClientProxyVT", serverSide = "com.example.visiontech.proxies.CommonProxyVT")
	//public static CommonProxyVT proxy;
	
    public static final String MODID = "diff";
    public static final String VERSION = "1.0";
    
    //@Instance(MODID)
    //public static WhenPigsFlyMod instance;

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
    
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) 
    {
    	
    	//Zircon
    	zircon = new Item();
    	zircon.setUnlocalizedName("Zircon");
    	zircon.setCreativeTab(CreativeTabs.tabMaterials);
    	GameRegistry.registerItem(zircon, "Zircon");

    
    	//Zircon Tools and Weapons
    	
    	//Zircon Pickaxe
    	zirconPickaxe = new ZirconPickaxe(zirconToolMaterial);
    	
    	GameRegistry.addShapedRecipe(new ItemStack(zirconPickaxe), new Object[] {
    		"ZZZ",
    		" I ",
    		" I ", 'I', Items.iron_ingot, 'Z', zircon
    	});
    	
    	//Zircon Shovel
    	zirconSpade = new ZirconSpade(zirconToolMaterial);
    	zirconSpade.setUnlocalizedName("Zircon Spade");
    	zirconSpade.setCreativeTab(CreativeTabs.tabTools);
    	GameRegistry.registerItem(zirconSpade, "Zircon Spade");

    	GameRegistry.addShapedRecipe(new ItemStack(zirconSpade), new Object[] {
    		"Z",
    		"I",
    		"I", 'I', Items.iron_ingot, 'Z', zircon
    	});
    	
    	//Zircon Sword
    	zirconSword = new ZirconSword(zirconSwordMaterial);
    	zirconSword.setUnlocalizedName("Zircon Sword");
    	zirconSword.setCreativeTab(CreativeTabs.tabCombat);
    	GameRegistry.registerItem(zirconSword, "Zircon Sword");

    	GameRegistry.addShapedRecipe(new ItemStack(zirconSword), new Object[] {
    		"Z",
    		"Z",
    		"I", 'I', Items.iron_ingot, 'Z', zircon
    	});

    	
    	//Zircon Axe
    	zirconAxe = new ZirconAxe(zirconBettyMaterial);
    	zirconAxe.setUnlocalizedName("Zircon Axe");
    	zirconAxe.setCreativeTab(CreativeTabs.tabTools);
    	GameRegistry.registerItem(zirconAxe, "Zircon Axe");

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
    	
    	
		//Zircon Armor
    
    	//Zircon Helmet
    	zirconHelmet = new ZirconArmor(zirconArmorMaterial, 0);
    	zirconHelmet.setUnlocalizedName("Zircon Helmet");
    	zirconHelmet.setCreativeTab(CreativeTabs.tabCombat);
    	GameRegistry.registerItem(zirconHelmet, "Zircon Helmet");

    	GameRegistry.addShapedRecipe(new ItemStack(zirconHelmet), new Object[] {
    		"ZZZ",
    		"Z Z", 'Z', zircon
    	});
    	
    	//Zircon Chestplate
    	zirconChestplate = new ZirconArmor(zirconArmorMaterial, 1);
    	zirconChestplate.setUnlocalizedName("Zircon Chestplate");
    	zirconChestplate.setCreativeTab(CreativeTabs.tabCombat);
    	GameRegistry.registerItem(zirconChestplate, "Zircon Chestplate");
    	
    	GameRegistry.addShapedRecipe(new ItemStack(zirconChestplate), new Object[] {
    		"Z Z",
    		"ZZZ",
    		"ZZZ", 'Z', zircon
    	});
    	
    	//Zircon Leggings
    	zirconLeggings = new ZirconArmor(zirconArmorMaterial, 2);
    	zirconLeggings.setUnlocalizedName("Zircon Leggings");
    	zirconLeggings.setCreativeTab(CreativeTabs.tabCombat);
    	GameRegistry.registerItem(zirconLeggings, "Zircon Leggings");
    	
    	GameRegistry.addShapedRecipe(new ItemStack(zirconLeggings), new Object[] {
    		"ZZZ",
    		"Z Z",
    		"Z Z", 'Z', zircon
    	});

    	//Zircon Boots
    	zirconBoots = new ZirconArmor(zirconArmorMaterial, 3);
    	zirconBoots.setUnlocalizedName("Zircon Boots");
    	zirconBoots.setCreativeTab(CreativeTabs.tabCombat);
    	GameRegistry.registerItem(zirconBoots, "Zircon Boots");
    	
    	GameRegistry.addShapedRecipe(new ItemStack(zirconBoots), new Object[] {
    		"Z Z",
    		"Z Z", 'Z', zircon
    	});

		/**
    	//Mob Spawning
    	
    	proxy.registerEntityRenders();
		
    	//World Generation
    	//GameRegistry.registerWorldGenerator(eventmanager, 1);
		
    					
    	//Mob Registration	
    	registerEntity(FlyingPig.class, "Flying Pig");
    	//EntityRegistry.addSpawn(entityClass, weightedProb, min, max, typeOfCreature [EnumCreatureType.], biomes [BiomeGenBase.]);
    	EntityRegistry.addSpawn(FlyingPig.class, 1, 4, 4, EnumCreatureType.CREATURE, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach );
    			
    	**/
    			
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
// some example code
        System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());

        if(event.getSide() == Side.CLIENT)
        {
            	RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
            	renderItem.getItemModelMesher().register(zirconPickaxe, 0, new ModelResourceLocation(WhenPigsFlyMod.MODID + ":" + ((ZirconPickaxe) zirconPickaxe).getName(), "inventory"));
        }
        
    } 
    
    /**
    public static void registerEntity(Class entityClass, String name)
    {
    int entityID = EntityRegistry.findGlobalUniqueEntityId();
    long seed = name.hashCode();
    Random rand = new Random(seed);
    int primaryColor = rand.nextInt() * 16777215;
    int secondaryColor = rand.nextInt() * 16777215;

    EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
    EntityRegistry.registerModEntity(entityClass, name, entityID, instance, 64, 1, true);
    EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
    }
	**/
}
