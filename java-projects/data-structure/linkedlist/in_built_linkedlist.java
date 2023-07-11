import java.util.LinkedList;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNo;
    private float marks;

    public Student(String name, int rollNo, float marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public float getMarks() {
        return marks;
    }
}

public class in_built_linkedlist {
    private LinkedList<Student> students;

    public in_built_linkedlist() {
        students = new LinkedList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Roll No: " + student.getRollNo());
            System.out.println("Marks: " + student.getMarks());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        in_built_linkedlist db = new in_built_linkedlist();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add student");
            System.out.println("2. Display students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter roll no: ");
                    int rollNo = scanner.nextInt();
                    System.out.print("Enter marks: ");
                    float marks = scanner.nextFloat();
                    db.addStudent(new Student(name, rollNo, marks));
                    break;
                case 2:
                    db.displayStudents();
                    break;
                case 3:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}