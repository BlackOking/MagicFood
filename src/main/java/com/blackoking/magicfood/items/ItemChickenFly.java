package com.blackoking.magicfood.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemChickenFly extends ItemFood
{
    public ItemChickenFly(int id, int foodAmount, float saturation, boolean isWolfFood)
    {
        super(id, foodAmount, isWolfFood);

    }
    
    protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player) {
    }
}
