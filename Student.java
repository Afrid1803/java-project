import java.util.ArrayList;
import java.util.Scanner;

class Student 
{
     String name;
     int rollno;
     double marks;
     String grade;
    public Student(String name, int rollno,double marks)
	{
        this.name = name;
		this.rollno = rollno;
        this.marks = marks;
        this.grade = calculateGrade(marks);
    }
    private String calculateGrade(double marks) 
	{
        if (marks >= 90) 
		{
            return "A";
        } 
		else if (marks >= 80) 
		{
            return "B";
        }
		else if (marks >= 70)
		{
            return "C";
        }
		else if (marks >= 60) 
		{
            return "D";
        } 
		else
		{
            return "F";
        }
    }
    public void displayDetails()
	{
        System.out.println("Name: " + name + ", Marks: " + marks + ", Grade: " + grade);
    }
}
class StudentGradingSystem 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        System.out.println("Welcome to the Student Grading System!");
        while (true) 
		{
            System.out.print("\nEnter the student's name (or type 'exit' to stop): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) 
			{
                break;
            }
            System.out.print("Enter the student's rollno:");
			int rollno = scanner.nextInt();
            System.out.print("Enter the student's marks (out of 100): ");
            double marks = scanner.nextDouble();
            scanner.nextLine();
            students.add(new Student(name,rollno,marks));
        }
        System.out.println("\n--- All Student Results ---");
        for (Student student : students)
		{
            student.displayDetails();
        }
        scanner.close();
    }
}
