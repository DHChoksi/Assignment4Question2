package Factories;

import Factories.impl.NoRestrictionFactory;
import Factories.impl.NutAllergyFactory;
import Factories.impl.PaleoFactory;
import Factories.impl.VeganFactory;
import Enums.DietPlan;

public class DietPlanFactory
{
    private static DietPlanFactory instance;

    private DietPlanFactory() {}

    public static DietPlanFactory getInstance()
    {
        if (instance == null)
        {
            instance = new DietPlanFactory();
        }
        return instance;
    }

    public MacronutrientFactory getFactory(DietPlan plan)
    {
        switch (plan)
        {
            case PALEO:
                return PaleoFactory.getInstance();
            case VEGAN:
                return VeganFactory.getInstance();
            case NUT_ALLERGY:
                return NutAllergyFactory.getInstance();
            default:
                return NoRestrictionFactory.getInstance();
        }
    }
}
