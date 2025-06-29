public class Calculator {
	public int subtract(int a, int b) {
		return a - b;
	}
	public int subtract(int a, int b, int c) {
		return a - b - c;
	}
	public double subtract(double a, double b) {
		return a - b;
	}
	
	
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println("Subtracting two integers: " + c1.subtract(10, 5));
        System.out.println("Subtracting three integers: " + c1.subtract(20, 5, 3));
        System.out.println("Subtracting two doubles: " + c1.subtract(10.5, 4.2));

	}
}
