package Model;

import Enums.DietPlan;

public class Customer {
    private String m_Name;
    private DietPlan m_DietPlan;

    public Customer(String name, DietPlan dietPlan) {
        m_Name = name;
        m_DietPlan = dietPlan;
    }

    public String getName() {
        return m_Name;
    }

    public DietPlan getDietPlan() {
        return m_DietPlan;
    }
}
