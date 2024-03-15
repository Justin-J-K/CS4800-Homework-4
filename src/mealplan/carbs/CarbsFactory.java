package mealplan.carbs;

import java.util.Random;

public class CarbsFactory {
    private CarbsFactory() {}

    public static Carb chooseCarb(String dietPlan) {
        return switch (dietPlan) {
            case "no restriction" -> chooseCarbForNoRestriction();
            case "paleo" -> new Pistachio();
            case "vegan" -> chooseCarbForVegan();
            case "nut allergy" -> chooseCarbForNutAllergy();
            default -> null;
        };
    }

    private static Carb chooseCarbForNoRestriction() {
        Carb[] carbs = { new Cheese(), new Bread(),
                new Lentils(), new Pistachio() };
        return chooseCarbFromArray(carbs);
    }

    private static Carb chooseCarbForVegan() {
        Carb[] carbs = { new Bread(), new Lentils(), new Pistachio() };
        return chooseCarbFromArray(carbs);
    }

    private static Carb chooseCarbForNutAllergy() {
        Carb[] carbs = { new Cheese(), new Bread(), new Lentils() };
        return chooseCarbFromArray(carbs);
    }

    private static Carb chooseCarbFromArray(Carb[] carbs) {
        int i = new Random().nextInt(carbs.length);
        return carbs[i];
    }

}
