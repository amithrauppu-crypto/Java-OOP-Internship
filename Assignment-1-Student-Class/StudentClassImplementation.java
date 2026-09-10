import java.util.Scanner;

class Student {
    // Attributes
    private String name;
    private int rollNumber;
    private String branch;
    private double marks;

    // Constructor
    Student(String name, int rollNumber, String branch, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.branch = branch;
        this.marks = marks;
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("----- Student Information -----");
        System.out.println("Name       : " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Branch     : " + branch);
        System.out.println("Marks      : " + marks);
    }
}

public class StudentClassImplementation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter branch: ");
        String branch = scanner.nextLine();

        System.out.print("Enter marks: ");
        double marks = scanner.nextDouble();

        Student student = new Student(name, rollNumber, branch, marks);

        System.out.println();
        student.displayStudentInfo();

        scanner.close();
    }
}
