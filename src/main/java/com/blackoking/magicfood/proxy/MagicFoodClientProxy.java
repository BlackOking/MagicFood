package com.blackoking.magicfood.proxy;

import java.io.File;

import com.blackoking.magicfood.items.ItemChickenFly;

public class MagicFoodClientProxy extends MagicFoodCommonProxy
{
    @Override
    public void preInit(File configFile)
    {
        super.preInit(configFile);
        ItemChickenFly.registerItemsModels();
    }

    @Override
    public void init()
    {
        super.init();
    }
}
