import java.util.Scanner;
class Box{
		double length, width, height;
		Box(double l1, double w1, double h1){
			this.length = l1;
			this.width = w1;
			this.height = h1;
		}
		public double volume() {
			return length * width * height;
		}
}
public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length: ");
        double length = sc.nextDouble();
        
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        
        Box b = new Box(length, width, height);
        System.out.println("Volume of the box: " + b.volume());
        sc.close();
	}

}
