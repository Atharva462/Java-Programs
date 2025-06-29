import java.util.Scanner;

public class ExceptionHandle2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array");
        int size = scanner.nextInt();
        int[] array = new int[size];
        
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.println("Enter the index of the array element you want to access");
        int index = scanner.nextInt();
        
        try {
            System.out.println("The array element at index " + index + " = " + array[index]);
            System.out.println("The array element successfully accessed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getClass().getName());
        }
        
        scanner.close();
    }
}