import java.util.Scanner;

class InvalidCountryException extends Exception {
    public InvalidCountryException(String message) {
        super(message);
    }
}

class UserRegistration {
    public void registerUser(String username, String userCountry) throws InvalidCountryException {
        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException("User Outside India cannot be registered");
        }
        System.out.println("User registration done successfully");
    }
}

public class ExceptionHandle6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserRegistration registration = new UserRegistration();
        
        try {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            
            System.out.print("Enter country: ");
            String userCountry = scanner.nextLine();
            
            registration.registerUser(username, userCountry);
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
