package Model;

import Factories.DietPlanFactory;
import Factories.MacronutrientFactory;
import Enums.DietPlan;

public class MealPlanner {
    public Meal createMeal(Customer customer) {
        MacronutrientFactory factory = DietPlanFactory.getInstance().getFactory(customer.getDietPlan());
        return new Meal(factory.getCarb(), factory.getProtein(), factory.getFat());
    }
}
