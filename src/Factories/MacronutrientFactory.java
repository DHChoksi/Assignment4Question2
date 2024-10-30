package Factories;

import Enums.Carbs;
import Enums.Protein;
import Enums.Fats;

public abstract class MacronutrientFactory {
    public abstract Carbs getCarb();
    public abstract Protein getProtein();
    public abstract Fats getFat();
}