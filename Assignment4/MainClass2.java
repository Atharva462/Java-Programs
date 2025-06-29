class Fruit {
    protected String name;
    protected String taste;
    protected String size;

    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {
        System.out.println("Fruit Name: " + name + ", Taste: " + taste);
    }
}

class Apple extends Fruit {
    public Apple() {
        super("Apple", "Sweet", "Medium");
    }
    @Override
    public void eat() {
        System.out.println("Fruit Name: " + name + ", Taste: " + taste + " with a crisp texture.");
    }
}

class Orange extends Fruit {
    public Orange() {
        super("Orange", "Citrusy", "Small");
    }
    @Override
    public void eat() {
        System.out.println("Fruit Name: " + name + ", Taste: " + taste + " with a juicy texture.");
    }
}

public class MainClass2 {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit orange = new Orange();

        apple.eat();
        orange.eat();
    }
}
