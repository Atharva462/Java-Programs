import java.util.Scanner;

class Patient {
    private String name;
    private double weight;
    private double height;

    public Patient(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public double BMI() {
        return (weight / (height * height)) * 703;
    }

    public String getName() {
        return name;
    }
}

public class Patients {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();
        System.out.print("Enter weight (in pounds): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height (in inches): ");
        double height = scanner.nextDouble();

        Patient patient = new Patient(name, weight, height);

        System.out.println("Patient Name: " + patient.getName());
        System.out.println("BMI: " + patient.BMI());
        
        scanner.close();
    }
}
