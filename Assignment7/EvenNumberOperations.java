import java.util.ArrayList;
import java.util.Scanner;

public class EvenNumberOperations {

    // Instance variables
    private ArrayList<Integer> A1 = new ArrayList<>();
    private ArrayList<Integer> A2 = new ArrayList<>();

    // Method to save even numbers from 2 to N
    public ArrayList<Integer> saveEvenNumbers(int N) {
        A1.clear();
        for (int i = 2; i <= N; i += 2) {
            A1.add(i);
        }
        return A1;
    }

    // Method to print even numbers multiplied by 2 and return a new list
    public ArrayList<Integer> printEvenNumbers() {
        A2.clear();
        for (int num : A1) {
            int multiplied = num * 2;
            System.out.print(multiplied + " ");
            A2.add(multiplied);
        }
        System.out.println();
        return A2;
    }

    // Method to search for a number in A1
    public int printEvenNumber(int N) {
        if (A1.contains(N)) {
            return N;
        } else {
            return 0;
        }
    }

    // Main method with user input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EvenNumberOperations obj = new EvenNumberOperations();

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        System.out.println("Saved Even Numbers (A1): " + obj.saveEvenNumbers(N));

        System.out.println("Printed Even Numbers multiplied by 2 (A2): ");
        obj.printEvenNumbers();

        System.out.print("Enter a number to search in A1: ");
        int searchNum = scanner.nextInt();

        int result = obj.printEvenNumber(searchNum);
        if (result != 0) {
            System.out.println("Number " + searchNum + " found in A1.");
        } else {
            System.out.println("Number " + searchNum + " not found in A1.");
        }

        scanner.close();
    }
}
