package mealplan;

public class Customer {
    private String name;
    private String dietPlan;

    public Customer(String name, String dietPlan) {
        this.name = name;
        this.dietPlan = dietPlan;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public String getDietPlan() {
        return dietPlan;
    }

    public Customer setDietPlan(String dietPlan) {
        this.dietPlan = dietPlan;
        return this;
    }

    @Override
    public String toString() {
        return name + " with " + dietPlan + " plan";
    }
}
