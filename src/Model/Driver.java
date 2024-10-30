package Model;

import Enums.DietPlan;

public class Driver
{
    public static void main(String[] args)
    {
        MealPlanner planner = new MealPlanner();

        Customer[] customers =
                {
                new Customer("Karna", DietPlan.NO_RESTRICTION),
                new Customer("Bob", DietPlan.PALEO),
                new Customer("Mario", DietPlan.VEGAN),
                new Customer("Tom", DietPlan.NUT_ALLERGY),
                new Customer("Evan", DietPlan.NO_RESTRICTION),
                new Customer("Chamkila", DietPlan.PALEO)
        };

        for (Customer customer : customers)
        {
            Meal meal = planner.createMeal(customer);
            System.out.println(customer.getName() + "'s Meal: " + meal);
        }
    }
}