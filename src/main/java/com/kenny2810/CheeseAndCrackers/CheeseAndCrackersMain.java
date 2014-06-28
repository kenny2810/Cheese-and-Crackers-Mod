package com.kenny2810.CheeseAndCrackers;

// This Import list will grow longer with each additional tutorial.
// It's not pruned between full class postings, unlike other tutorial code.
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

import com.kenny2810.CheeseAndCrackers.Block.blazeBlock;
import com.kenny2810.CheeseAndCrackers.Block.featherBlock;
import com.kenny2810.CheeseAndCrackers.Block.sugarBlock;
import com.kenny2810.CheeseAndCrackers.Items.Cheese.CloudyCheese;
import com.kenny2810.CheeseAndCrackers.Items.Cheese.FireResistanceCheese;
import com.kenny2810.CheeseAndCrackers.Items.Cheese.ItemCheese;
import com.kenny2810.CheeseAndCrackers.Items.Cheese.KennyCheese;
import com.kenny2810.CheeseAndCrackers.Items.Cheese.KiKiCheese;
import com.kenny2810.CheeseAndCrackers.Items.Cheese.KiniCheese;
import com.kenny2810.CheeseAndCrackers.Items.Cheese.LisasCheese;
import com.kenny2810.CheeseAndCrackers.Items.Cheese.RegenCheese;
import com.kenny2810.CheeseAndCrackers.Items.Cheese.ResistanceCheese;
import com.kenny2810.CheeseAndCrackers.Items.Cheese.WaterBreathingCheese;
import com.kenny2810.CheeseAndCrackers.Items.Crackers.CloudyCracker;
import com.kenny2810.CheeseAndCrackers.Items.Crackers.CrackerFromHell;
import com.kenny2810.CheeseAndCrackers.Items.Crackers.EnderCracker;
import com.kenny2810.CheeseAndCrackers.Items.Crackers.InvisCracker;
import com.kenny2810.CheeseAndCrackers.Items.Crackers.ItemCracker;
import com.kenny2810.CheeseAndCrackers.Items.Crackers.JumpBoostCracker;
import com.kenny2810.CheeseAndCrackers.Items.Crackers.KennyCracker;
import com.kenny2810.CheeseAndCrackers.Items.Crackers.KiKiCracker;
import com.kenny2810.CheeseAndCrackers.Items.Crackers.KiniCracker;
import com.kenny2810.CheeseAndCrackers.Items.Crackers.LisasCracker;
import com.kenny2810.CheeseAndCrackers.Items.Crackers.SpeedCracker;
import com.kenny2810.CheeseAndCrackers.Items.Crackers.StrenghtCracker;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid="CheeseAndCrackers", name="Cheese And Crackers", version="1.1.1")
public class CheeseAndCrackersMain 
{
//Declaration of variables	
	//Registering Crackers
	public static Item Cracker = new ItemCracker(2, false);
	public static Item StrenghtCracker;
	public static Item JumpBoostCracker;
	public static Item SpeedCracker;
	public static Item InvisCracker;
	public static Item KiniCracker;
	public static Item KennyCracker;
	public static Item KiKiCracker;
	public static Item CloudyCracker;
	public static Item LisasCracker;
	public static Item CrackerFromHell;
	public static Item EnderCracker;

	
	
//Registering Cheese
	public static Item Cheese = new ItemCheese(2, false);
	public static Item KennysCheese;
	public static Item LisasCheese;
	public static Item CloudysCheese;
	public static Item KinisCheese;
	public static Item KikisCheese;
	public static Item RegenCheese;
	public static Item ResistanceCheese;
	public static Item FireResistCheese;
	public static Item WaterBreathingCheese;
	public static Random i;

	
	//Registering Mod ID
	public static final String MODID = "CheeseAndCrackers";
	
	//Registering entities for easter egg ;) 
	public EntityPlayer Runew0lf; 
	public EntityPlayer Kiki;
	public EntityPlayer gaminggeek24;
    public EntityPlayer Cloudhunter;
    public EntityPlayer kenny2810;
    

	
    //Registering Blocks
    public static Block blazeBlock = new blazeBlock(Material.rock);
    public static Block featherBlock = new featherBlock(Material.rock);
	public static Block sugarBlock = new sugarBlock(Material.rock);

        @Instance(value="CheeseAndCrackers")
        public static CheeseAndCrackersMain instance;
        
        @SidedProxy(clientSide="com.kenny2810.CheeseAndCrackers.Client.ClientProxy",
                        serverSide="com.kenny2810.CheeseAndCrackers.CommonProxy")
        public static CommonProxy proxy;
        
        public void onEntityDrop(LivingDropsEvent event) {

            if (event.entityLiving == Runew0lf) {
            	//The integer at the end relates to how many items will be dropped.
                event.entityLiving.dropItem(CheeseAndCrackersMain.KiniCracker, 1);
                event.entityLiving.dropItem(CheeseAndCrackersMain.KinisCheese, 1);
            }
                if (event.entityLiving == kenny2810) {
                    //The integer at the end relates to how many items will be dropped.
                     event.entityLiving.dropItem(CheeseAndCrackersMain.KennyCracker, 1);
                     event.entityLiving.dropItem(CheeseAndCrackersMain.KennysCheese, 1);
                }
                if (event.entityLiving == Cloudhunter) {
                	//The integer at the end relates to how many items will be dropped.
                     event.entityLiving.dropItem(CheeseAndCrackersMain.CloudyCracker, 1);
                     event.entityLiving.dropItem(CheeseAndCrackersMain.CloudysCheese, 1);
                }
                if (event.entityLiving == gaminggeek24) {
                	//The integer at the end relates to how many items will be dropped.
                     event.entityLiving.dropItem(CheeseAndCrackersMain.LisasCracker, 1);
                     event.entityLiving.dropItem(CheeseAndCrackersMain.LisasCheese, 1);
                }
                if (event.entityLiving == Kiki) {
                    ///The integer at the end relates to how many items will be dropped.
                     event.entityLiving.dropItem(CheeseAndCrackersMain.KiKiCracker, 1);
                     event.entityLiving.dropItem(CheeseAndCrackersMain.KikisCheese, 1);
                }
            }
        
       
        
        public static CreativeTabs CheeseAndCrackersTab = new CreativeTabs("Cheese And Crackers") {
            @Override
            @SideOnly(Side.CLIENT)
            public Item getTabIconItem() {
                return CheeseAndCrackersMain.Cracker;
            }
        };
        
       
        
        @EventHandler
        	
        	public void preInit(FMLPreInitializationEvent event) {
        	// Initialising Blocks
        	blazeBlock = new blazeBlock(Material.rock).setHardness(4F).setResistance(10F).setBlockName("Blaze Block").setBlockTextureName(CheeseAndCrackersMain.MODID+":"+"blazeBlock");
        	featherBlock = new featherBlock(Material.rock).setHardness(2F).setResistance(6F).setBlockName("Feather Block").setBlockTextureName(CheeseAndCrackersMain.MODID+":"+"featherBlock");
        	sugarBlock = new sugarBlock(Material.rock).setHardness(2F).setResistance(6F).setBlockName("Sugar Block").setBlockTextureName(CheeseAndCrackersMain.MODID+":"+"sugarBlock");
        	
        	// Initialising Crackers
        	Cracker = new ItemCracker(2, false).setUnlocalizedName("Cracker").setTextureName(CheeseAndCrackersMain.MODID+":"+"cracker");
        	LisasCracker = new LisasCracker().setUnlocalizedName("Lisa`s Cracker").setTextureName(CheeseAndCrackersMain.MODID+":"+"cracker");
        	CloudyCracker = new CloudyCracker().setUnlocalizedName("Cloudy`s Cracker").setTextureName(CheeseAndCrackersMain.MODID+":"+"cracker");
        	KennyCracker = new KennyCracker().setUnlocalizedName("Kenny`s Cracker").setTextureName(CheeseAndCrackersMain.MODID+":"+"cracker");
        	KiKiCracker = new KiKiCracker().setUnlocalizedName("Kiki`s Cracker").setTextureName(CheeseAndCrackersMain.MODID+":"+"cracker");
        	KiniCracker = new KiniCracker().setUnlocalizedName("Rune`s Cracker").setTextureName(CheeseAndCrackersMain.MODID+":"+"cracker");
        	StrenghtCracker = new StrenghtCracker().setUnlocalizedName("Strenght Cracker").setTextureName(CheeseAndCrackersMain.MODID+":"+"cracker");
        	SpeedCracker = new SpeedCracker().setUnlocalizedName("Speed Cracker").setTextureName(CheeseAndCrackersMain.MODID+":"+"cracker");
        	InvisCracker = new InvisCracker().setUnlocalizedName("Invisibility Cracker").setTextureName(CheeseAndCrackersMain.MODID+":"+"cracker");
        	JumpBoostCracker = new JumpBoostCracker().setUnlocalizedName("Jump Boost Cracker").setTextureName(CheeseAndCrackersMain.MODID+":"+"cracker");
        	EnderCracker = new EnderCracker().setUnlocalizedName("The End Cracker").setTextureName(CheeseAndCrackersMain.MODID+":"+"cracker");
        	CrackerFromHell = new CrackerFromHell().setUnlocalizedName("The Cracker from Hell").setTextureName(CheeseAndCrackersMain.MODID+":"+"cracker");
        	
        	// Initialising Cheeses
        	Cracker = new ItemCheese(2, false).setUnlocalizedName("Cheese").setTextureName(CheeseAndCrackersMain.MODID+":"+"cheese");
        	LisasCheese = new LisasCheese().setUnlocalizedName("Lisa`s Cheese").setTextureName(CheeseAndCrackersMain.MODID+":"+"cheese");
        	CloudysCheese = new CloudyCheese().setUnlocalizedName("Cloudy`s Cheese").setTextureName(CheeseAndCrackersMain.MODID+":"+"cheese");
        	KennysCheese = new KennyCheese().setUnlocalizedName("Kenny`s Cheese").setTextureName(CheeseAndCrackersMain.MODID+":"+"cheese");
        	KikisCheese = new KiKiCheese().setUnlocalizedName("Kiki`s Cheese").setTextureName(CheeseAndCrackersMain.MODID+":"+"cheese");
        	KinisCheese = new KiniCheese().setUnlocalizedName("Rune`s Cheese").setTextureName(CheeseAndCrackersMain.MODID+":"+"cheese");
        	WaterBreathingCheese = new WaterBreathingCheese().setUnlocalizedName("Water-Breathing Cheese").setTextureName(CheeseAndCrackersMain.MODID+":"+"cheese");
        	RegenCheese = new RegenCheese().setUnlocalizedName("Regen Cheese").setTextureName(CheeseAndCrackersMain.MODID+":"+"Cracker");
        	FireResistCheese = new FireResistanceCheese().setUnlocalizedName("Fire-Resistance Cheese").setTextureName(CheeseAndCrackersMain.MODID+":"+"cheese");
        	ResistanceCheese = new ResistanceCheese().setUnlocalizedName("Resistance Cheese").setTextureName(CheeseAndCrackersMain.MODID+":"+"cheese");
            
        }
        
        @EventHandler
        public void load(FMLInitializationEvent event) 
        {
        	//Registering Blocks
        	blazeBlock.setHarvestLevel("pickaxe", 2);
            GameRegistry.registerBlock(blazeBlock, "BlazeRod Block");
            
            featherBlock.setHarvestLevel("pickaxe", 1);
            GameRegistry.registerBlock(featherBlock, "Feather Block");
            
            sugarBlock.setHarvestLevel("pickaxe", 1);
            GameRegistry.registerBlock(sugarBlock, "Sugar Block");
       	
            //Registering Crackers
        	GameRegistry.registerItem(Cracker, "Cracker");
        	GameRegistry.registerItem(StrenghtCracker, "Strenght Cracker");
        	GameRegistry.registerItem(SpeedCracker, "Speed Cracker");
        	GameRegistry.registerItem(InvisCracker, "Invisibility Cracker");
        	GameRegistry.registerItem(JumpBoostCracker, "Jump Boost Cracker");
        	GameRegistry.registerItem(CloudyCracker, "Cloudy`s Cracker");
        	GameRegistry.registerItem(KennyCracker, "Kenny`s Cracker");
        	GameRegistry.registerItem(KiniCracker, "Rune`s Cracker");
        	GameRegistry.registerItem(LisasCracker, "Lisa`s Cracker");
        	GameRegistry.registerItem(KiKiCracker, "Kiki`s Cracker");
        	GameRegistry.registerItem(EnderCracker, "The End Cracker");
        	GameRegistry.registerItem(CrackerFromHell, "The Cracker from Hell");
        	
        	//Registering Cheeses
        	GameRegistry.registerItem(Cheese, "Cheese");
        	GameRegistry.registerItem(LisasCheese, "Lisa`s Cheese");
        	GameRegistry.registerItem(CloudysCheese, "Cloudy`s Cheese");
        	GameRegistry.registerItem(KennysCheese, "Kenny`s Cheese");
        	GameRegistry.registerItem(KikisCheese, "Kiki`s Cheese");
        	GameRegistry.registerItem(KinisCheese, "Rune`s Cheese");
        	GameRegistry.registerItem(RegenCheese, "Regeneration Cheese");
        	GameRegistry.registerItem(WaterBreathingCheese, "Water Breathing Cheese");
        	GameRegistry.registerItem(FireResistCheese, "Fire Resistance Cheese");
        	GameRegistry.registerItem(ResistanceCheese, "Resistance Cheese");
                
            //Setting up ItemStacks for Crafting
        	    ItemStack wheatStack = new ItemStack(Items.wheat);
            	ItemStack waterBucketStack = new ItemStack(Items.water_bucket);
            	ItemStack lavaBucketStack = new ItemStack(Items.lava_bucket);
            	ItemStack milkBucketStack = new ItemStack(Items.milk_bucket);
            	ItemStack diamondStack = new ItemStack(Blocks.diamond_block);
            	ItemStack blazeStack = new ItemStack(Items.blaze_powder);
            	ItemStack featherStack = new ItemStack(Items.feather);
            	ItemStack obsidianStack = new ItemStack(Blocks.obsidian);
            	ItemStack pufferStack = new ItemStack(Items.fish);
            	ItemStack sugarStack = new ItemStack(Items.sugar);
            	ItemStack magmaCreamStack = new ItemStack(Items.magma_cream);
            	ItemStack goldenCarrotStack = new ItemStack(Items.golden_carrot);
            	ItemStack ghastTearStack = new ItemStack(Items.ghast_tear);
            	ItemStack cheeseStack = new ItemStack(CheeseAndCrackersMain.Cheese);
            	ItemStack crackerStack = new ItemStack(CheeseAndCrackersMain.Cracker);
            	ItemStack featherBlockStack = new ItemStack(CheeseAndCrackersMain.featherBlock);
            	ItemStack blazeBlockStack = new ItemStack(CheeseAndCrackersMain.blazeBlock);
            	ItemStack sugarBlockStack = new ItemStack(CheeseAndCrackersMain.sugarBlock);

                
            	//Registering Dungeon Loot (HellCracker)
            	ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(CheeseAndCrackersMain.CrackerFromHell),1,1,5));
            	ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(CheeseAndCrackersMain.CrackerFromHell),1,1,5));
            	ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(CheeseAndCrackersMain.CrackerFromHell),1,1,5));
            	ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(CheeseAndCrackersMain.CrackerFromHell),1,1,5));
            	ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(CheeseAndCrackersMain.CrackerFromHell),1,1,5));
            	ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(CheeseAndCrackersMain.CrackerFromHell),1,1,5));
            	ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(CheeseAndCrackersMain.CrackerFromHell),1,1,5));
            	
            	//Registering Dungeon Loot (EndCracker)
            	ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(CheeseAndCrackersMain.EnderCracker),1,1,5));
            	ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(CheeseAndCrackersMain.EnderCracker),1,1,5));
            	ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(CheeseAndCrackersMain.EnderCracker),1,1,5));
            	ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(CheeseAndCrackersMain.EnderCracker),1,1,5));
            	ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(CheeseAndCrackersMain.EnderCracker),1,1,5));
            	ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(CheeseAndCrackersMain.EnderCracker),1,1,5));
            	ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(CheeseAndCrackersMain.EnderCracker),1,1,5));
            	
                
                //Recipes for basic cracker and cheese
                GameRegistry.addShapelessRecipe(new ItemStack(CheeseAndCrackersMain.Cracker, 1),
                        wheatStack, waterBucketStack);
                
                GameRegistry.addShapelessRecipe(new ItemStack(CheeseAndCrackersMain.Cheese, 1),
                		milkBucketStack, lavaBucketStack);
                
                //Recipes for blocks
                GameRegistry.addRecipe(new ItemStack(CheeseAndCrackersMain.blazeBlock, 1), 
                		"xxx", "xxx", "xxx",'x', blazeStack);
                
                GameRegistry.addRecipe(new ItemStack(CheeseAndCrackersMain.featherBlock, 1), 
                		"xxx", "xxx", "xxx",'x', featherStack);
                
                GameRegistry.addRecipe(new ItemStack(CheeseAndCrackersMain.sugarBlock, 1), 
                		"xxx", "xxx", "xxx",'x', sugarStack);
                
                //Recipes for Cheeses                
                GameRegistry.addRecipe(new ItemStack(CheeseAndCrackersMain.FireResistCheese, 1), 
                		"xxx", "xyx", "xzx",'x', magmaCreamStack, 'y', cheeseStack, 'z', diamondStack);
              
                GameRegistry.addRecipe(new ItemStack(CheeseAndCrackersMain.RegenCheese, 1), 
                		"xxx", "xyx", "xzx",'x', ghastTearStack, 'y', cheeseStack, 'z', diamondStack);
                
                GameRegistry.addRecipe(new ItemStack(CheeseAndCrackersMain.ResistanceCheese, 1), 
                		"xxx", "xyx", "xzx",'x', obsidianStack, 'y', cheeseStack, 'z', diamondStack);
               
                GameRegistry.addRecipe(new ItemStack(CheeseAndCrackersMain.WaterBreathingCheese, 1), 
                		"xxx", "xyx", "xzx",'x', pufferStack, 'y', cheeseStack, 'z', diamondStack);
              
                //Recipes for Crackers
                GameRegistry.addRecipe(new ItemStack(CheeseAndCrackersMain.StrenghtCracker, 1), 
                		"xxx", "xyx", "xzx",'x', blazeBlockStack, 'y', crackerStack, 'z', diamondStack);
               
                GameRegistry.addRecipe(new ItemStack(CheeseAndCrackersMain.SpeedCracker, 1), 
                		"xxx", "xyx", "xzx",'x', sugarBlockStack, 'y', crackerStack, 'z', diamondStack);
                
                GameRegistry.addRecipe(new ItemStack(CheeseAndCrackersMain.JumpBoostCracker, 1), 
                		"xxx", "xyx", "xzx",'x', featherBlockStack, 'y', crackerStack, 'z', diamondStack);
                
                GameRegistry.addRecipe(new ItemStack(CheeseAndCrackersMain.InvisCracker, 1), 
                		"xxx", "xyx", "xzx",'x', goldenCarrotStack, 'y', crackerStack, 'z', diamondStack);
                
                
                proxy.registerRenderers();
        }
        @EventHandler
        public void postInit(FMLPreInitializationEvent e) 
        {
        }
        
        
     
      
    }

    
   