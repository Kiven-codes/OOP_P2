class Fruit {
    String name;
    String color;

    Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    void displayInfo() {
        System.out.println("=======================");
        System.out.println("My Sample Code for Fruit Class\n");
        System.out.println("Fruit Name: " + name);
        System.out.println("Fruit Color: " + color);
        System.out.println("=======================\n");
    }
}

class Apple extends Fruit {
    Apple() {
        super("Apple", "Red");
    }
}

class Orange extends Fruit {
    Orange() {
        super("Orange", "Orange");
    }
}

class Banana extends Fruit {
    Banana() {
        super("Banana", "Yellow");
    }
}

class Grape extends Fruit {
    Grape() {
        super("Grape", "Purple");
    }
}

class Guava extends Fruit {
    Guava() {
        super("Guava", "Green");
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