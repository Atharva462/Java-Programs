import java.util.Random;

abstract class Instrument {
    abstract void play();
}

class Piano extends Instrument {
    @Override
    void play() {
        System.out.println("Piano is playing  tan tan tan tan");
    }
}

class Flute extends Instrument {
    @Override
    void play() {
        System.out.println("Flute is playing  toot toot toot toot");
    }
}

class Guitar extends Instrument {
    @Override
    void play() {
        System.out.println("Guitar is playing  tin tin tin");
    }
}

public class TestInstrument {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[10];
        Random rand = new Random();

        for (int i = 0; i < instruments.length; i++) {
            int type = rand.nextInt(3);
            switch (type) {
                case 0:
                    instruments[i] = new Piano();
                    break;
                case 1:
                    instruments[i] = new Flute();
                    break;
                case 2:
                    instruments[i] = new Guitar();
                    break;
            }
        }

        for (int i = 0; i < instruments.length; i++) {
            instruments[i].play();
            if (instruments[i] instanceof Piano) {
                System.out.println("Instrument at index " + i + " is a Piano.");
            } else if (instruments[i] instanceof Flute) {
                System.out.println("Instrument at index " + i + " is a Flute.");
            } else if (instruments[i] instanceof Guitar) {
                System.out.println("Instrument at index " + i + " is a Guitar.");
            }
        }
    }
}
