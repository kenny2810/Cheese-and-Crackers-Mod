package com.kenny2810.CheeseAndCrackers;

// This Import list will grow longer with each additional tutorial.
// It's not pruned between full class postings, unlike other tutorial code.
import java.util.logging.Logger;

import com.kenny2810.CheeseAndCrackers.Items.*;
import com.kenny2810.CheeseAndCrackers.Items.Crackers.*;
import com.kenny2810.CheeseAndCrackers.Items.Cheese.*;

import net.minecraft.block.Block;
import net.minecraft.entity.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid="CheeseAndCrackers", name="Cheese And Crackers", version="1.1.0")
public class CheeseAndCrackersMain 
{
	
	public static Item Cracker = new ItemCracker(2, false);
	public static Item StrenghtCracker = new StrenghtCracker();
	public static Item JumpBoostCracker = new JumpBoostCracker();
	public static Item SpeedCracker = new SpeedCracker();
	public static Item InvisCracker = new InvisCracker();
	public static Item Cheese;	
	public static Item RegenCheese;
	public static Item ResistanceCheese;
	public static Item FireResistCheese;
	public static Item WaterBreathingCheese;
	public static Item KiniCracker;
	public static Item KennyCracker;
	public static Item KiKiCracker;
	public static Item CloudyCracker;
	public static Item LisasCracker;
	public static Item KennysCheese;
	public static Item LisasCheese;
	public static Item CloudysCheese;
	public static Item KinisCheese;
	public static Item KikisCheese;
	public static Logger logger;
	 public static int CheeseConfig;
	    public static int CrackerConfig;
	   public static final String MODID = "CheeseAndCrackers";
	   public EntityPlayer Runew0lf; 
	   public EntityPlayer Kiki;
	   public EntityPlayer gaminggeek24;
	   public EntityPlayer Cloudhunter;
	   public EntityPlayer kenny2810;
	   
	  

	

        @Instance(value="CheeseAndCrackers")
        public static CheeseAndCrackersMain instance;
        
        @SidedProxy(clientSide="com.kenny2810.CheeseAndCrackers.Client.ClientProxy",
                        serverSide="com.kenny2810.CheeseAndCrackers.CommonProxy")
        public static CommonProxy proxy;
        
        public void onEntityDrop(LivingDropsEvent event) {

            if (event.entityLiving == Runew0lf) {
               //The integer at the end relates to how many potato will be dropped.
                event.entityLiving.dropItem(CheeseAndCrackersMain.KiniCracker, 1);
            }
                if (event.entityLiving == kenny2810) {
                    //The integer at the end relates to how many potato will be dropped.
                     event.entityLiving.dropItem(CheeseAndCrackersMain.KennyCracker, 1);
                }
                if (event.entityLiving == Cloudhunter) {
                    //The integer at the end relates to how many potato will be dropped.
                     event.entityLiving.dropItem(CheeseAndCrackersMain.CloudyCracker, 1);
                }
                if (event.entityLiving == gaminggeek24) {
                    //The integer at the end relates to how many potato will be dropped.
                     event.entityLiving.dropItem(CheeseAndCrackersMain.LisasCracker, 1);
                }
                if (event.entityLiving == Kiki) {
                    //The integer at the end relates to how many potato will be dropped.
                     event.entityLiving.dropItem(CheeseAndCrackersMain.KiKiCracker, 1);
                }
            }
        
        
       
        
        @EventHandler
        	
        	public void preInit(FMLPreInitializationEvent event) {
        	// Configuration goes here.
 
        	LisasCracker = new LisasCracker().setUnlocalizedName("Lisa`s Cracker").setTextureName(CheeseAndCrackersMain.MODID+":"+"Cracker");
        	CloudyCracker = new CloudyCracker().setUnlocalizedName("Cloudy`s Cracker").setTextureName(CheeseAndCrackersMain.MODID+":"+"Cracker");
        	KennyCracker = new KennyCracker().setUnlocalizedName("Kenny`s Cracker").setTextureName(CheeseAndCrackersMain.MODID+":"+"Cracker");
        	KiKiCracker = new KiKiCracker().setUnlocalizedName("Kiki`s Cracker").setTextureName(CheeseAndCrackersMain.MODID+":"+"Cracker");
        	KiniCracker = new KiniCracker().setUnlocalizedName("Rune`s Cracker").setTextureName(CheeseAndCrackersMain.MODID+":"+"Cracker");
        	Cracker = new ItemCracker(2, false).setUnlocalizedName("Cracker").setTextureName(CheeseAndCrackersMain.MODID+":"+"Cracker");
        	StrenghtCracker = new StrenghtCracker().setUnlocalizedName("Strenght Cracker").setTextureName(CheeseAndCrackersMain.MODID+":"+"Cracker");
        	SpeedCracker = new SpeedCracker().setUnlocalizedName("Speed Cracker").setTextureName(CheeseAndCrackersMain.MODID+":"+"Cracker");
        	InvisCracker = new InvisCracker().setUnlocalizedName("Invisibility Cracker").setTextureName(CheeseAndCrackersMain.MODID+":"+"Cracker");
        	JumpBoostCracker = new JumpBoostCracker().setUnlocalizedName("Jump Boost Cracker").setTextureName(CheeseAndCrackersMain.MODID+":"+"Cracker");
        	
        	Cheese = new ItemCheese().setUnlocalizedName("Cheese").setTextureName(CheeseAndCrackersMain.MODID+":"+"Cheese");
        	LisasCheese = new LisasCheese().setUnlocalizedName("Lisa`s Cheese").setTextureName(CheeseAndCrackersMain.MODID+":"+"Cheese");
        	CloudysCheese = new CloudyCheese().setUnlocalizedName("Cloudy`s Cheese").setTextureName(CheeseAndCrackersMain.MODID+":"+"Cheese");
        	KennysCheese = new KennyCheese().setUnlocalizedName("Kenny`s Cheese").setTextureName(CheeseAndCrackersMain.MODID+":"+"Cheese");
        	KikisCheese = new KiKiCheese().setUnlocalizedName("Kiki`s Cheese").setTextureName(CheeseAndCrackersMain.MODID+":"+"Cheese");
        	KinisCheese = new KiniCheese().setUnlocalizedName("Rune`s Cheese").setTextureName(CheeseAndCrackersMain.MODID+":"+"Cheese");
        	WaterBreathingCheese = new WaterBreathingCheese().setUnlocalizedName("Water-Breathing Cheese").setTextureName(CheeseAndCrackersMain.MODID+":"+"Cheese");
        	RegenCheese = new RegenCheese().setUnlocalizedName("Regen Cheese").setTextureName(CheeseAndCrackersMain.MODID+":"+"Cracker");
        	FireResistCheese = new FireResistanceCheese().setUnlocalizedName("Fire-Resistance Cheese").setTextureName(CheeseAndCrackersMain.MODID+":"+"Cheese");
        	ResistanceCheese = new ResistanceCheese().setUnlocalizedName("Resistance Cheese").setTextureName(CheeseAndCrackersMain.MODID+":"+"Cheese");
            
        }
        
        @EventHandler
        public void load(FMLInitializationEvent event) 
        {
       	
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
      
                
                
                GameRegistry.addShapelessRecipe(new ItemStack(CheeseAndCrackersMain.Cracker, 1),
                        wheatStack, waterBucketStack);
                
                GameRegistry.addShapelessRecipe(new ItemStack(CheeseAndCrackersMain.Cheese, 1),
                		milkBucketStack, lavaBucketStack);
                
                GameRegistry.addRecipe(new ItemStack(CheeseAndCrackersMain.FireResistCheese, 1), "xxx", "xyx", "xzx",'x', magmaCreamStack, 'y', cheeseStack, 'z', diamondStack);
                
                
                              
                // End Basic Blocks
                
                proxy.registerRenderers();
        }
        @EventHandler
        public void postInit(FMLPreInitializationEvent e) 
        {
        }
        
        
     
      
    }

    
   