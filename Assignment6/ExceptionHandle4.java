import java.util.Scanner;

public class ExceptionHandle4 {
	 public static void main(String[] args) {
	try {
        int[] numbers = new int[args.length];
        int sum = 0;
        
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
            sum += numbers[i];
        }
        
        double average = (double) sum / numbers.length;
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    } catch (NumberFormatException e) {
        System.out.println("NumberFormatException: Invalid input. Please enter valid integers.");
    } catch (ArithmeticException e) {
        System.out.println("ArithmeticException: Division by zero occurred.");
    } catch (Exception e) {
        System.out.println("Exception: " + e.getMessage());
    }
}
}
