import java.util.Scanner;

public class ExceptionHandle7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Enter the 2 numbers");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            int quotient = a / b;
            System.out.println("The quotient of " + a + "/" + b + " = " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("DivideByZeroException caught");
        } finally {
            System.out.println("Inside finally block");
            scanner.close();
        }
    }
}