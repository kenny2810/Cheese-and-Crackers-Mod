package com.kenny2810.CheeseAndCrackers.Items;


import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.kenny2810.CheeseAndCrackers.CheeseAndCrackersMain;
import com.kenny2810.CheeseAndCrackers.Entities.EntityCheese;

public class ItemCheese extends Item
{
    public ItemCheese()
    {
        super();
        this.maxStackSize = 16;
        this.setCreativeTab(CreativeTabs.tabMisc);
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
            par2World.spawnEntityInWorld(new EntityCheese(par2World, par3EntityPlayer));
        }

        return par1ItemStack;
    }
    public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag)
    {
    	EntityPlayer player = (EntityPlayer) entity;
    	ItemStack cheeseStack = new ItemStack(CheeseAndCrackersMain.Cheese);
    	
    	if((player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().isItemEqual(cheeseStack))) {
    player.addPotionEffect((new PotionEffect(Potion.field_76444_x.getId(), 3, 4)));
    player.addPotionEffect((new PotionEffect(Potion.regeneration.getId(), 3, 4)));
    player.addPotionEffect((new PotionEffect(Potion.resistance.getId(), 3, 4)));
    }
    else
    {
    player.curePotionEffects(itemstack);
    }
    }
}



