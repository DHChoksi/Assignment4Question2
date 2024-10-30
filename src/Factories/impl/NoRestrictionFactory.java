package Factories.impl;

import Enums.Carbs;
import Enums.Protein;
import Enums.Fats;
import Factories.MacronutrientFactory;
import java.util.Random;

public class NoRestrictionFactory extends MacronutrientFactory
{
    private static NoRestrictionFactory instance;
    private final Random random = new Random();

    private NoRestrictionFactory() {}

    public static NoRestrictionFactory getInstance()
    {
        if (instance == null)
        {
            instance = new NoRestrictionFactory();
        }
        return instance;
    }

    @Override
    public Carbs getCarb()
    {
        return Carbs.values()[random.nextInt(Carbs.values().length)];
    }

    @Override
    public Protein getProtein()
    {
        return Protein.values()[random.nextInt(Protein.values().length)];
    }

    @Override
    public Fats getFat()
    {
        return Fats.values()[random.nextInt(Fats.values().length)];
    }
}