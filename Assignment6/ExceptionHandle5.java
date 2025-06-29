import java.util.Scanner;

public class ExceptionHandle5 {
	 public static int divide(int a, int b) throws ArithmeticException {
	        return a / b;
	 }
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the first number: ");
            int num1 = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter the second number: ");
            int num2 = Integer.parseInt(scanner.nextLine());
            
            int result = divide(num1, num2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero.");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid input. Please enter valid integers.");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
