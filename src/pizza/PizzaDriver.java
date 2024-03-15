package pizza;

public class PizzaDriver {
    public static void main(String[] args) {
        Pizza p1 = new Pizza.PizzaBuilder().addBacon()
                .addSpinach()
                .addChicken()
                .setSize(Pizza.SMALL)
                .build();
        p1.eat();

        Pizza p2 = new Pizza.PizzaBuilder().addHam()
                .addHamAndPineapple()
                .addPesto()
                .addBeef()
                .addPeppers()
                .addPepperoni()
                .setSize(Pizza.MEDIUM)
                .build();
        p2.eat();

        Pizza p3 = new Pizza.PizzaBuilder().addHam()
                .addPesto()
                .addSpinach()
                .addSpicyPork()
                .addHamAndPineapple()
                .addBeef()
                .addExtraCheese()
                .addOnions()
                .addTomatoAndBasil()
                .setSize(Pizza.LARGE)
                .build();
        p3.eat();

        Pizza p4 = new Pizza.PizzaBuilder().setSize(Pizza.LARGE)
                .setPizzaChain("Pizza Hut")
                .addBacon()
                .addBeef()
                .addMushrooms()
                .build();
        p4.eat();

        Pizza p5 = new Pizza.PizzaBuilder().setSize(Pizza.SMALL)
                .setPizzaChain("Pizza Hut")
                .addBacon()
                .addBeef()
                .build();
        p5.eat();

        Pizza p6 = new Pizza.PizzaBuilder().setSize(Pizza.MEDIUM)
                .setPizzaChain("Little Caesars")
                .addBacon()
                .addBeef()
                .addMushrooms()
                .addOlives()
                .addSausage()
                .addExtraCheese()
                .addChicken()
                .addOnions()
                .build();
        p6.eat();

        Pizza p7 = new Pizza.PizzaBuilder().setSize(Pizza.SMALL)
                .setPizzaChain("Little Caesars")
                .addBacon()
                .addBeef()
                .addMushrooms()
                .addOlives()
                .addSausage()
                .addExtraCheese()
                .build();
        p7.eat();

        Pizza p8 = new Pizza.PizzaBuilder().setSize(Pizza.SMALL)
                .addBacon()
                .setPizzaChain("Dominos")
                .build();
        p8.eat();

        Pizza p9 = new Pizza.PizzaBuilder().setSize(Pizza.LARGE)
                .addBacon()
                .addBeef()
                .addMushrooms()
                .setPizzaChain("Dominos")
                .build();
        p9.eat();
    }
}
