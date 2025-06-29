import java.util.Scanner;
public class Product {
	String productId;
	String productName;
	double price;
	int quantity;
	Product(String s1, String s2, double p1, int q1){
		this.productId = s1;
		this.productName = s2;
		this.price = p1;
		this.quantity = q1;
	}
    void addStock(int amount) {
		if(amount>0) {
			quantity += amount;
			System.out.println("Successfully added units to "+productName);
		} else {
			System.out.println("Amount to add must be positive");
		}
	}
    void reduceStock(int amount){
    	if(amount>0 && amount<=quantity) {
    		quantity -= amount;
    		System.out.println("Successfully reduced units from "+productName);
    	} else if(amount>quantity) {
    		System.out.println("Insufficient Stock to reduce this amount.");
    	} else {
    		System.out.println("Amount to be reduce must be positive.");
    	}
    }
    void displayProductDetails() {
    	System.out.println("Product ID: "+productId);
    	System.out.println("Product Name: "+productName);
    	System.out.println("Price: "+price);
    	System.out.println("Quantity: "+quantity);
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Product ID: ");
		String productId = sc.nextLine();
		System.out.print("Enter Product Name: ");
		String productName = sc.nextLine();
		System.out.print("Enter Product Price: ");
		double price = sc.nextDouble();
		System.out.print("Enter Initial Quantity: ");
		int quantity = sc.nextInt();
		
		Product p1 = new Product(productId, productName, price, quantity);
		while(true) {
			System.out.println("\nInventory Management Menu:");	
			System.out.println("1. Add Stock: ");
			System.out.println("2. Reduce Stock: ");
			System.out.println("3. Display Product Details: ");
			System.out.println("4. Exit");
			System.out.println("Choose an option: ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter amount to add: ");
				int addAmount = sc.nextInt();
				p1.addStock(addAmount);
				break;
			case 2:
				System.out.println("Enter Amount to reduce: ");
				int reduceAmount = sc.nextInt();
				p1.reduceStock(reduceAmount);
				break;
			case 3:
				p1.displayProductDetails();
				break;
			case 4:
				System.out.println("Existing the system. Thank You!");
				sc.close();
				return;
			default:
				System.out.println("Invalid option. Please try again.");
			}
		}
	}

}
