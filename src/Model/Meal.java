package Model;

import Enums.Carbs;
import Enums.Protein;
import Enums.Fats;

public class Meal
{
    private Carbs m_Carb;
    private Protein m_Protein;
    private Fats m_Fat;

    public Meal(Carbs carb, Protein protein, Fats fat)
    {
        m_Carb = carb;
        m_Protein = protein;
        m_Fat = fat;
    }

    @Override
    public String toString()
    {
        return "Meal [Carb=" + m_Carb + ", Protein=" + m_Protein + ", Fat=" + m_Fat + "]";
    }
}
