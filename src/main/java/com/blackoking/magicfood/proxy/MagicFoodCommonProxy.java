package com.blackoking.magicfood.proxy;

import java.io.File;

import com.blackoking.magicfood.items.MagicFoodItems;

public class MagicFoodCommonProxy
{

    public void preInit(File configFile)
    {
        MagicFoodItems.registerItems();
    }

    public void init()
    {
        
    }
    
}
