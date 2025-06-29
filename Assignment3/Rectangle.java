import java.util.Scanner;
public class Rectangle {
	double length;
	double breadth;
	
	public void readDimentions() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length: ");
		length = sc.nextDouble();
		System.out.print("Enter the breadth: ");
		breadth = sc.nextDouble();
	}
	public double calculateArea() {
		return 	length * breadth;
	}
	public double calculatePerimeter() {
		return 2 * (length + breadth);
	}
	public void display() {
        System.out.println("Area of Rectangle: " + calculateArea());
        System.out.println("Perimeter of Rectangle: " + calculatePerimeter());
    }
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.readDimentions();
		rect.display();
	}

}
