import java.util.Scanner;
public class AreaCalculator {
	public double area(double radius) {
		return Math.PI * radius * radius;
	}
	public double area(double base, double height) {
		return 0.5 * base * height;
	}
	public double area(int side) {
		return side * side; 
	}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AreaCalculator calc = new AreaCalculator();
		
		System.out.println("Choose Shape to calculate area: 1. Circle 	2.Triangle	 3.Square");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.print("Enter Radius:");
			double radius = sc.nextDouble();
			System.out.println("Area of circle: "+calc.area(radius));
			break;
		case 2: 
			System.out.print("Enter base: ");
            double base = sc.nextDouble();
            System.out.print("Enter height: ");
            double height = sc.nextDouble();
            System.out.println("Area of Triangle: " + calc.area(base, height));
            break;
		case 3:
			System.out.print("Enter side: ");
            int side = sc.nextInt();
            System.out.println("Area of Square: " + calc.area(side));
            break;
        default:
            System.out.println("Invalid choice!");
		}
		sc.close();
	}

}
