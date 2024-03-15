package pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    public static final int SMALL = 0;
    public static final int MEDIUM = 1;
    public static final int LARGE = 2;

    private List<String> toppings;
    private int size;
    private String pizzaChain;

    private Pizza(List<String> toppings, int size, String pizzaChain) {
        this.toppings = toppings;
        this.size = size;
        this.pizzaChain = pizzaChain;
    }

    public void eat() {
        StringBuilder sb = new StringBuilder();

        switch (size) {
            case SMALL:
                sb.append("Small");
                break;
            case MEDIUM:
                sb.append("Medium");
                break;
            case LARGE:
                sb.append("Large");
        }

        sb.append(" pizza with ");
        sb.append(toppings.size());
        sb.append(" toppings");

        if (pizzaChain != null)
            System.out.println(pizzaChain + ":");
        System.out.println(sb);
    }

    public static class PizzaBuilder {
        private List<String> toppings = new ArrayList<>();
        private Integer size;
        private String pizzaChain;

        public PizzaBuilder setSize(int size) {
            if (size < 0 || size > 2)
                throw new IllegalArgumentException("Invalid pizza size: " + size);
            this.size = size;
            return this;
        }

        public PizzaBuilder addPepperoni() {
            toppings.add("Pepperoni");
            return this;
        }

        public PizzaBuilder addPeppers() {
            toppings.add("Peppers");
            return this;
        }

        public PizzaBuilder addHam() {
            toppings.add("Ham");
            return this;
        }

        public PizzaBuilder addSausage() {
            toppings.add("Sausage");
            return this;
        }

        public PizzaBuilder addChicken() {
            toppings.add("Chicken");
            return this;
        }

        public PizzaBuilder addPesto() {
            toppings.add("Pesto");
            return this;
        }

        public PizzaBuilder addMushrooms() {
            toppings.add("Mushrooms");
            return this;
        }

        public PizzaBuilder addOlives() {
            toppings.add("Olives");
            return this;
        }

        public PizzaBuilder addSpicyPork() {
            toppings.add("Spicy Pork");
            return this;
        }

        public PizzaBuilder addBacon() {
            toppings.add("Bacon");
            return this;
        }

        public PizzaBuilder addSpinach() {
            toppings.add("Spinach");
            return this;
        }

        public PizzaBuilder addHamAndPineapple() {
            toppings.add("Ham and Pineapple");
            return this;
        }

        public PizzaBuilder addOnions() {
            toppings.add("Onions");
            return this;
        }

        public PizzaBuilder addTomatoAndBasil() {
            toppings.add("Tomato and Basil");
            return this;
        }

        public PizzaBuilder addExtraCheese() {
            toppings.add("Extra Cheese");
            return this;
        }

        public PizzaBuilder addBeef() {
            toppings.add("Beef");
            return this;
        }

        public PizzaBuilder setPizzaChain(String pizzaChain) {
            this.pizzaChain = pizzaChain;
            return this;
        }

        public Pizza build() {
            if (size == null)
                throw new IllegalStateException("Pizza must have size before building");

            return new Pizza(toppings, size, pizzaChain);
        }
    }
 }
