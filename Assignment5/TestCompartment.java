import java.util.Random;

abstract class Compartment {
    abstract void notice();
}

class FirstClass extends Compartment {
    @Override
    void notice() {
        System.out.println("This is First Class Compartment.");
    }
}

class Ladies extends Compartment {
    @Override
    void notice() {
        System.out.println("This is Ladies Compartment.");
    }
}

class General extends Compartment {
    @Override
    void notice() {
        System.out.println("This is General Compartment.");
    }
}

class Luggage extends Compartment {
    @Override
    void notice() {
        System.out.println("This is Luggage Compartment.");
    }
}

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random rand = new Random();

        for (int i = 0; i < compartments.length; i++) {
            int type = rand.nextInt(4) + 1;
            switch (type) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }

        for (Compartment compartment : compartments) {
            compartment.notice();
        }
    }
}
