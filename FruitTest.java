class Fruit {
    String name;
    String color;
    String description; // The included description of the fruit is from google search.

    Fruit(String name, String color, String description) {
        this.name = name;
        this.color = color;
        this.description = description;
    }

    void displayInfo() {
        System.out.println("=======================");
        System.out.println("My favorite fruits.\n");
        System.out.println("Fruit Name: " + name);
        System.out.println("Fruit Color: " + color);
        System.out.println("Description: " + description);
        System.out.println("=======================\n");
    }
}

class Apple extends Fruit {
    Apple() {
        super("Apple", "Red",
                "An apple is a popular, round, pome fruit from the Malus domestica tree, known for its edible, crisp flesh and skin that can be red, green, or yellow, varying in sweetness and tartness across thousands of varieties used for eating, cooking, and cider.");
    }
}

class Orange extends Fruit {
    Orange() {
        super("Orange", "Orange",
                "An orange is a round, sweet-tart citrus fruit with a bright orange rind, juicy segmented pulp, and high Vitamin C content, known for its refreshing taste and aroma, used for eating fresh, juicing, or flavoring, and comes in varieties like navel, Valencia, and bitter (Seville).");
    }
}

class Banana extends Fruit {
    Banana() {
        super("Banana", "Yellow",
                "A banana is an elongated, curved edible fruit (botanically a berry) produced by large herbaceous plants in the genus Musa.");
    }
}

class Grape extends Fruit {
    Grape() {
        super("Grape", "Purple",
                "Grapes are small, juicy berries growing in clusters on woody vines, varying in color (green, red, purple, black) and used fresh, dried (raisins), juiced, or fermented into wine; botanically a berry, they are sweet, contain sugars (glucose/fructose), and have antioxidants, growing worldwide on Vitis genus vines, often with a powdery \"bloom\".");
    }
}

class Guava extends Fruit {
    Guava() {
        super("Guava", "Green",
                "Guava is a tropical fruit from the Psidium guajava plant, known for its strong, sweet, musky aroma and diverse appearance, with skin ranging from green to yellow and pulp from white to deep pink or red, containing many small, hard seeds.");
    }
}

public class FruitTest {
    public static void main(String[] args) {
        Fruit myFruit = new Apple();
        myFruit.displayInfo();
        myFruit = new Orange();
        myFruit.displayInfo();
        myFruit = new Banana();
        myFruit.displayInfo();
        myFruit = new Grape();
        myFruit.displayInfo();
        myFruit = new Guava();
        myFruit.displayInfo();
    }
}
