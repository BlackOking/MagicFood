package com.blackoking.magicfood.items;

import com.blackoking.magicfood.ModMagicFood;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MagicFoodItems
{
    // ici on va déclarer les items
    public static final Item CHICKENFLY = new ItemChickenFly(501, 5, 1.5F, false).setAlwaysEdible().setUnlocalizedName("ChickenFly").setCreativeTab(CreativeTabs.FOOD);
   
    public static void registerItems()
    {
        // ici on va les enregistrer
        GameRegistry.registerItem (CHICKENFLY, "chicken_fly");
        
    }
    
    @SideOnly(Side.CLIENT)
    public static void registerItemsModels()
    {
        // et ici on va enregistrer les modèles (fichiers json)
        ModelLoader.setCustomModelResourceLocation(CHICKENFLY, 0, new ModelResourceLocation(ModMagicFood.MODID + ":chicken_fly", "inventory"));
    }
    
    
}
