import java.util.Scanner;

public class calculator1 {
    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
    public static void main(String[] args) {
        System.out.println("12^10 = " + calculator1.powerInt(12, 10));
        System.out.println("2.5^3 = " + calculator1.powerDouble(2.5, 3));
    }
}
