import java.util.Scanner;
public class StudentGradingSystem 
{
    static class Student
    {
        String name;
        int rollNumber;
        int marks;
        Student(String name, int rollNumber, int marks)
        {
            this.name = name;
            this.rollNumber = rollNumber;
            this.marks = marks;
        }
        String calculateGrade() 
        {
            if (marks >= 90) 
            {
                return "A";
            } else if (marks >= 80) 
            {
                return "B";
            } else if (marks >= 70) 
            {
                return "C";
            } else if (marks >= 60) 
            {
                return "D";
            } else {
                return "F";
            }
        }
        void displayInfo() 
        {
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Marks: " + marks);
            System.out.println("Grade: " + calculateGrade());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        System.out.print("Enter marks (out of 100): ");
        int marks = scanner.nextInt();
        Student student = new Student(name, rollNumber, marks);
        System.out.println("\n--- Student Report ---");
        student.displayInfo();
        scanner.close();
    }
}
