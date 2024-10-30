package Factories.impl;

import Enums.Carbs;
import Enums.Protein;
import Enums.Fats;
import Factories.MacronutrientFactory;
import java.util.Random;

public class PaleoFactory extends MacronutrientFactory {
    private static PaleoFactory instance;
    private final Random random = new Random();

    private PaleoFactory() {} // Private constructor for Singleton

    public static synchronized PaleoFactory getInstance()
    {
        if (instance == null) {
            instance = new PaleoFactory();
        }
        return instance;
    }

    @Override
    public Carbs getCarb()
    {
        // Only pistachio is allowed as carb
        return Carbs.PISTACHIO;
    }

    @Override
    public Protein getProtein()
    {
        Protein[] proteins = {Protein.FISH, Protein.CHICKEN, Protein.BEEF};
        return proteins[random.nextInt(proteins.length)];
    }

    @Override
    public Fats getFat()
    {
        Fats[] fats = {Fats.AVOCADO, Fats.TUNA};
        return fats[random.nextInt(fats.length)];
    }
}