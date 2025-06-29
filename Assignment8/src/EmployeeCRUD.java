import java.sql.*;
import java.util.Scanner;

public class EmployeeCRUD {
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/company";
    static final String DB_USER = "root";
    static final String DB_PASSWORD = "820508pass";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
            while (true) {
                System.out.println("\n--- Employee CRUD Menu ---");
                System.out.println("1. Add Employee");
                System.out.println("2. View All Employees");
                System.out.println("3. Update Employee");
                System.out.println("4. Delete Employee");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Department: ");
                        String dept = scanner.nextLine();
                        System.out.print("Enter Salary: ");
                        double salary = scanner.nextDouble();
                        addEmployee(conn, id, name, dept, salary);
                        break;
                    case 2:
                        viewEmployees(conn);
                        break;
                    case 3:
                        System.out.print("Enter ID of employee to update: ");
                        int updateId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter New Name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter New Department: ");
                        String newDept = scanner.nextLine();
                        System.out.print("Enter New Salary: ");
                        double newSalary = scanner.nextDouble();
                        updateEmployee(conn, updateId, newName, newDept, newSalary);
                        break;
                    case 4:
                        System.out.print("Enter ID of employee to delete: ");
                        int deleteId = scanner.nextInt();
                        deleteEmployee(conn, deleteId);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid option!");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void addEmployee(Connection conn, int id, String name, String dept, double salary) throws SQLException {
        String sql = "INSERT INTO employee (id, name, department, salary) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setString(3, dept);
            stmt.setDouble(4, salary);
            stmt.executeUpdate();
            System.out.println("Employee added.");
        }
    }

    static void viewEmployees(Connection conn) throws SQLException {
        String sql = "SELECT * FROM employee";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("\n--- Employee List ---");
            while (rs.next()) {
                System.out.printf("ID: %d | Name: %s | Dept: %s | Salary: %.2f%n",
                        rs.getInt("id"), rs.getString("name"),
                        rs.getString("department"), rs.getDouble("salary"));
            }
        }
    }

    static void updateEmployee(Connection conn, int id, String name, String dept, double salary) throws SQLException {
        String sql = "UPDATE employee SET name = ?, department = ?, salary = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, dept);
            stmt.setDouble(3, salary);
            stmt.setInt(4, id);
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee updated.");
            } else {
                System.out.println("Employee not found.");
            }
        }
    }

    static void deleteEmployee(Connection conn, int id) throws SQLException {
        String sql = "DELETE FROM employee WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Employee deleted.");
            } else {
                System.out.println("Employee not found.");
            }
        }
    }
}
