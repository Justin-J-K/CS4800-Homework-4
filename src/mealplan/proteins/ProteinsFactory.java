package mealplan.proteins;

import java.util.Random;

public class ProteinsFactory {
    private ProteinsFactory() {}
    
    public static Protein chooseProtein(String dietPlan) {
        return switch (dietPlan) {
            case "no restriction", "nut allergy" -> chooseProteinForNoRestriction();
            case "paleo" -> chooseProteinForPaleo();
            case "vegan" -> new Tofu(); // assumed "No Meat" included beef
            default -> null;
        };
    }

    private static Protein chooseProteinForNoRestriction() {
        Protein[] proteins = { new Fish(), new Chicken(),
                new Beef(), new Tofu() };
        return chooseProteinFromArray(proteins);
    }

    private static Protein chooseProteinForPaleo() {
        Protein[] proteins = { new Fish(), new Chicken(), new Beef() };
        return chooseProteinFromArray(proteins);
    }

    private static Protein chooseProteinFromArray(Protein[] proteins) {
        int i = new Random().nextInt(proteins.length);
        return proteins[i];
    }
}
