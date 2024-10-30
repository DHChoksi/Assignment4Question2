package Factories.impl;

import Enums.Carbs;
import Enums.Protein;
import Enums.Fats;
import Factories.MacronutrientFactory;
import java.util.Random;

public class VeganFactory extends MacronutrientFactory
{
    private static VeganFactory instance;
    private final Random random = new Random();

    private VeganFactory() {}

    public static VeganFactory getInstance()
    {
        if (instance == null)
        {
            instance = new VeganFactory();
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
        return Protein.TOFU;
    }

    @Override
    public Fats getFat()
    {
        return Fats.AVOCADO;
    }
}