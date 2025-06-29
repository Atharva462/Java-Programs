import java.util.Scanner;

public class Number {
    private int[] numbers;
    private int n;

    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n = scanner.nextInt();
        numbers = new int[n];
        
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
    }

    public void swap() {
        if (n == 0) return;
        int minIndex = 0, maxIndex = 0;
        
        for (int i = 1; i < n; i++) {
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
            if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i;
            }
        }

        int temp = numbers[minIndex];
        numbers[minIndex] = numbers[maxIndex];
        numbers[maxIndex] = temp;
    }

    public void display() {
        System.out.println("Array after swapping biggest and smallest elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Number numList = new Number();
        numList.read();
        numList.swap();
        numList.display();
    }
}
