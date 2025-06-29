import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day number of the current month (1-31): ");
        int day = scanner.nextInt();
        if (day < 1 || day > 32) {
            System.out.println("Invalid day number. Please enter a number between 1 and 31.");
        } else {
            int weekDay = day % 7; // Calculate the weekday (1 = Sunday, 2 = Monday, etc.)
            switch (weekDay) {
                case 0:
                    System.out.println("Saturday");
                    break;
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                default:
                    System.out.println("Invalid input."); // This case is unlikely
            }
        }
        scanner.close();
	}
}
