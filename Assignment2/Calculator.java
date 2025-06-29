public class Calculator {
	public static int powerInt(int num1, int num2) {
		return (int) Math.pow(num1,num2);
	}

	public static double powerDouble(double num1, double num2) {
		return (double) Math.pow(num1, num2);
	}
	public static void main(String[] args) {
		int result1 = Calculator.powerInt(12,10);
		double result2 = Calculator.powerDouble(2.5,3);
		
		System.out.println("12^10: "+result1);
		System.out.println("2.5^3: "+result2);

	}
} 