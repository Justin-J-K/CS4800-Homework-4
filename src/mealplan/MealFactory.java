package mealplan;

import mealplan.carbs.Carb;
import mealplan.carbs.CarbsFactory;
import mealplan.fats.Fat;
import mealplan.fats.FatsFactory;
import mealplan.proteins.Protein;
import mealplan.proteins.ProteinsFactory;

public class MealFactory {
    private MealFactory() {}

    public static Meal chooseMeal(Customer customer) {
        String dietPlan = customer.getDietPlan();

        Carb carb = CarbsFactory.chooseCarb(dietPlan);
        Protein protein = ProteinsFactory.chooseProtein(dietPlan);
        Fat fat = FatsFactory.chooseFat(dietPlan);

        return new Meal(carb, protein, fat);
    }
}
