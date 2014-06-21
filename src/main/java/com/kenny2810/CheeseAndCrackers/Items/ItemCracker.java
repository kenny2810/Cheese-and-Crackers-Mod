package com.kenny2810.CheeseAndCrackers.Items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;

import com.kenny2810.CheeseAndCrackers.*;

import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.kenny2810.CheeseAndCrackers.Entities.EntityCracker;

public class ItemCracker extends Item
{
	public static String modid="CheeseAndCrackers";
    public ItemCracker()
    {
        super();
        setUnlocalizedName("Cracker");
        setTextureName(modid + ":" + "Cracker");
        this.maxStackSize = 16;
        this.setCreativeTab(CreativeTabs.tabMisc);
    }
    public void registerIcons(IIconRegister iconRegister)
    {
      itemIcon = iconRegister.registerIcon("CheeseAndCrackers:Cracker");
    }
    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
   
}