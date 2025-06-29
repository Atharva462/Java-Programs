public class Circle {
	double radius;
	Circle(double r1){
		this.radius = r1;
	}
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
	public double calculateCircumference() {
		return 2 * Math.PI * radius;
	}
	public double getRadius() {
		return radius;
	}
	
	public static void main(String[] args) {
		Circle c1 = new Circle(5.0);
		System.out.println("Radius: "+c1.getRadius());
		System.out.println("Area: "+c1.calculateArea());
		System.out.println("Circumference: "+c1.calculateCircumference());
	}

}
