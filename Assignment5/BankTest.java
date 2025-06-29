abstract class GeneralBank {
    abstract double getSavingInterestRate();
    abstract double getFixedInterestRate();
}

class ICICIBank extends GeneralBank {
    @Override
    double getSavingInterestRate() {
        return 4.0;
    }

    @Override
    double getFixedInterestRate() {
        return 8.5;
    }
}
class KotMBank extends GeneralBank {
    @Override
    double getSavingInterestRate() {
        return 6.0;
    }

    @Override
    double getFixedInterestRate() {
        return 9.0;
    }
}

public class BankTest {
    public static void main(String[] args) {
        ICICIBank icici = new ICICIBank();
        System.out.println("ICICI Bank Savings Interest Rate: " + icici.getSavingInterestRate() + "%");
        System.out.println("ICICI Bank Fixed Interest Rate: " + icici.getFixedInterestRate() + "%");

        KotMBank kotm = new KotMBank();
        System.out.println("KotMBank Savings Interest Rate: " + kotm.getSavingInterestRate() + "%");
        System.out.println("KotMBank Fixed Interest Rate: " + kotm.getFixedInterestRate() + "%");

        GeneralBank gbKotm = new KotMBank();
        System.out.println("GeneralBank (KotMBank) Savings Interest Rate: " + gbKotm.getSavingInterestRate() + "%");
        System.out.println("GeneralBank (KotMBank) Fixed Interest Rate: " + gbKotm.getFixedInterestRate() + "%");

        GeneralBank gbIcici = new ICICIBank();
        System.out.println("GeneralBank (ICICI) Savings Interest Rate: " + gbIcici.getSavingInterestRate() + "%");
        System.out.println("GeneralBank (ICICI) Fixed Interest Rate: " + gbIcici.getFixedInterestRate() + "%");
    }
}
