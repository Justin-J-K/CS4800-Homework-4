package mealplan.fats;

import java.util.Random;

public class FatsFactory {
    private FatsFactory() {}

    public static Fat chooseFat(String dietPlan) {
        return switch (dietPlan) {
            case "no restriction" -> chooseFatForNoRestriction();
            case "paleo" -> chooseFatForPaleo();
            case "vegan" -> chooseFatForVegan();
            case "nut allergy" -> chooseFatForNutAllergy();
            default -> null;
        };
    }

    private static Fat chooseFatForNoRestriction() {
        Fat[] fats = { new Avocado(), new SourCream(),
                new Tuna(), new Peanuts() };
        return chooseFatFromArray(fats);
    }

    private static Fat chooseFatForPaleo() {
        Fat[] fats = { new Avocado(), new Tuna(), new Peanuts() };
        return chooseFatFromArray(fats);
    }

    private static Fat chooseFatForVegan() {
        Fat[] fats = { new Avocado(), new Peanuts() };
        return chooseFatFromArray(fats);
    }

    private static Fat chooseFatForNutAllergy() {
        Fat[] fats = { new Avocado(), new SourCream(), new Tuna() };
        return chooseFatFromArray(fats);
    }

    private static Fat chooseFatFromArray(Fat[] fats) {
        int i = new Random().nextInt(fats.length);
        return fats[i];
    }
}
