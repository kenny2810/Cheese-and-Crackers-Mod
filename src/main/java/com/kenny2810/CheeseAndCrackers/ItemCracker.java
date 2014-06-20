package com.kenny2810.CheeseAndCrackers;

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
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par3EntityPlayer.capabilities.isCreativeMode)
        {
            --par1ItemStack.stackSize;
        }

        par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!par2World.isRemote)
        {
            par2World.spawnEntityInWorld(new EntityCracker(par2World, par3EntityPlayer));
        }

        return par1ItemStack;
    }
    public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag)
    {
    	EntityPlayer player = (EntityPlayer) entity;
    	ItemStack crackerStack = new ItemStack(CheeseAndCrackersMain.Cracker);
    	ItemStack equipped = player.getCurrentEquippedItem();
    	if(equipped == crackerStack) {
    player.addPotionEffect((new PotionEffect(Potion.damageBoost.getId(), 3, 4)));
    player.addPotionEffect((new PotionEffect(Potion.jump.getId(), 3, 4)));
    player.addPotionEffect((new PotionEffect(Potion.moveSpeed.getId(), 3, 4)));
    }
    else
    {
    player.curePotionEffects(itemstack);
    }
    }
}
