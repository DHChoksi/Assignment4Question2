package Factories.impl;

import Enums.Carbs;
import Enums.Protein;
import Enums.Fats;
import Factories.MacronutrientFactory;
import java.util.Random;

public class NutAllergyFactory extends MacronutrientFactory
{
    private static NutAllergyFactory instance;
    private final Random random = new Random();

    private NutAllergyFactory() {} // Private constructor for Singleton

    public static synchronized NutAllergyFactory getInstance()
    {
        if (instance == null)
        {
            instance = new NutAllergyFactory();
        }
        return instance;
    }

    @Override
    public Carbs getCarb()
    {
        Carbs[] carbs = {Carbs.CHEESE, Carbs.BREAD, Carbs.LENTILS};
        return carbs[random.nextInt(carbs.length)];
    }

    @Override
    public Protein getProtein()
    {
        Protein[] proteins = {Protein.FISH, Protein.CHICKEN, Protein.BEEF, Protein.TOFU};
        return proteins[random.nextInt(proteins.length)];
    }

    @Override
    public Fats getFat()
    {
        Fats[] fats = {Fats.AVOCADO, Fats.SOUR_CREAM, Fats.TUNA};
        return fats[random.nextInt(fats.length)];
    }
}