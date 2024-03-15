package mealplan;

import mealplan.carbs.Carb;
import mealplan.fats.Fat;
import mealplan.proteins.Protein;

public class Meal {
    private final Carb carb;
    private final Protein protein;
    private final Fat fat;

    public Meal(Carb carb, Protein protein, Fat fat) {
        this.carb = carb;
        this.protein = protein;
        this.fat = fat;
    }

    public Carb getCarb() {
        return carb;
    }

    public Protein getProtein() {
        return protein;
    }

    public Fat getFat() {
        return fat;
    }

    @Override
    public String toString() {
        return carb.getCarbName() + ", " + protein.getProteinName()
                + ", and " + fat.getFatName();
    }
}
