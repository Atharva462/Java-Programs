import java.util.Scanner;

class Student {
    int roll;
    String name;
    float cgpa;

    Student(int roll, String name, float cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println("Roll: " + roll + ", Name: " + name + ", CGPA: " + cgpa);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        
        Student[] students = new Student[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter roll number for student " + (i + 1) + ": ");
            int roll = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            
            System.out.print("Enter name for student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            
            System.out.print("Enter CGPA for student " + (i + 1) + ": ");
            float cgpa = scanner.nextFloat();
            
            students[i] = new Student(roll, name, cgpa);
        }
        
        System.out.println("\nDetails of students:");
        for (Student student : students) {
            student.display();
        }
        
        Student minCgpaStudent = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].cgpa < minCgpaStudent.cgpa) {
                minCgpaStudent = students[i];
            }
        }
        
        System.out.println("\nStudent with the lowest CGPA: " + minCgpaStudent.name);
    }
}
