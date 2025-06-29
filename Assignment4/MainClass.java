class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    protected int studentID;

    public Student(String name, int age, int studentID) {
        super(name, age);
        this.studentID = studentID;
    }
}

class Teacher extends Person {
    private double salary;
    private String subject;

    public Teacher(String name, int age, double salary, String subject) {
        super(name, age);
        this.salary = salary;
        this.subject = subject;
    }
    public void displayDetails() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}

class CollegeStudent extends Student {
    private int year;
    private String major;

    public CollegeStudent(String name, int age, int studentID, int year, String major) {
        super(name, age, studentID);
        this.year = year;
        this.major = major;
    }

    public void printDetails() {
        System.out.println("College Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentID);
        System.out.println("Year: " + year);
        System.out.println("Major: " + major);
    }
}

public class MainClass {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Sital Das", 47, 55000, "Computer Science");
        teacher.displayDetails();
        System.out.println();

        CollegeStudent student = new CollegeStudent("Atharva Ubhe", 20, 12345, 2, "Computer Engineering");
        student.printDetails();
    }
}
