package com.blackoking.magicfood;

import com.blackoking.magicfood.items.MagicFoodItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public abstract class MagicFoodRecipes {
    public static void registerRecipes() {
        GameRegistry.addRecipe(new ItemStack(MagicFoodItems.CHICKENFLY, 1),
                new Object[] { "A", "B", 'A',
                        new ItemStack(Items.FEATHER, 2), 'B',
                        new ItemStack(Items.STICK, 1) });
    }
}
