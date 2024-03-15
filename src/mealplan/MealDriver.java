package mealplan;

public class MealDriver {
    public static void main(String[] args) {
        Customer c1 = new Customer("John", "no restriction");
        Meal m1 = MealFactory.chooseMeal(c1);
        System.out.printf("%s had %s\n", c1, m1);

        Customer c2 = new Customer("Emily", "paleo");
        Meal m2 = MealFactory.chooseMeal(c2);
        System.out.printf("%s had %s\n", c2, m2);

        Customer c3 = new Customer("Michael", "vegan");
        Meal m3 = MealFactory.chooseMeal(c3);
        System.out.printf("%s had %s\n", c3, m3);

        Customer c4 = new Customer("Sarah", "nut allergy");
        Meal m4 = MealFactory.chooseMeal(c4);
        System.out.printf("%s had %s\n", c4, m4);

        Customer c5 = new Customer("David", "paleo");
        Meal m5 = MealFactory.chooseMeal(c5);
        System.out.printf("%s had %s\n", c5, m5);

        Customer c6 = new Customer("Sophia", "no restriction");
        Meal m6 = MealFactory.chooseMeal(c6);
        System.out.printf("%s had %s\n", c6, m6);
    }
}
