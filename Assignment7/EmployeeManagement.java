import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Employee {
    private int eCode;
    private String name;
    private double salary;

    public Employee(int eCode, String name, double salary) {
        this.eCode = eCode;
        this.name = name;
        this.salary = salary;
    }

    public int getECode() {
        return eCode;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Employee Code: " + eCode + ", Name: " + name + ", Salary: " + salary;
    }
}

class EmployeeDB {
    private ArrayList<Employee> empList = new ArrayList<>();

    public boolean addEmployee(Employee e) {
        return empList.add(e);
    }

    public boolean deleteEmployee(int eCode) {
        Iterator<Employee> it = empList.iterator();
        while (it.hasNext()) {
            Employee emp = it.next();
            if (emp.getECode() == eCode) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public String showPaySlip(int eCode) {
        for (Employee emp : empList) {
            if (emp.getECode() == eCode) {
                return "PaySlip for " + emp.getName() + ": Rs. " + emp.getSalary();
            }
        }
        return "Employee not found";
    }

    public Employee[] listAll() {
        Employee[] empArray = new Employee[empList.size()];
        empArray = empList.toArray(empArray);
        return empArray;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeDB db = new EmployeeDB();
        boolean running = true;

        while (running) {
            System.out.println("\n--- Employee DB Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Delete Employee");
            System.out.println("3. Show Pay Slip");
            System.out.println("4. List All Employees");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee Code: ");
                    int code = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    Employee emp = new Employee(code, name, salary);
                    db.addEmployee(emp);
                    System.out.println("Employee added.");
                    break;

                case 2:
                    System.out.print("Enter Employee Code to delete: ");
                    int delCode = scanner.nextInt();
                    boolean deleted = db.deleteEmployee(delCode);
                    if (deleted)
                        System.out.println("Employee deleted.");
                    else
                        System.out.println("Employee not found.");
                    break;

                case 3:
                    System.out.print("Enter Employee Code to show payslip: ");
                    int slipCode = scanner.nextInt();
                    System.out.println(db.showPaySlip(slipCode));
                    break;

                case 4:
                    Employee[] all = db.listAll();
                    if (all.length == 0) {
                        System.out.println("No employees in the system.");
                    } else {
                        System.out.println("--- Employee List ---");
                        for (Employee e : all) {
                            System.out.println(e);
                        }
                    }
                    break;

                case 5:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        scanner.close();
        System.out.println("Program exited.");
    }
}
