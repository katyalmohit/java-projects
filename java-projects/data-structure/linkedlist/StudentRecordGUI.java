import javax.swing.*;
import java.io.*;

class Node {
    String name, course;
    int rollno, marks;
    Node next;

    Node(String name, int rollno, String course, int marks) {
        this.name = name;
        this.rollno = rollno;
        this.course = course;
        this.marks = marks;
        next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }

    void insert(String name, int rollno, String course, int marks) {
        Node newNode = new Node(name, rollno, course, marks);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        JOptionPane.showMessageDialog(null, "Record inserted successfully!");
        saveToFile(newNode); // Save the record to a file
    }

    void delete(int rollno) {
        if (head == null) {
            JOptionPane.showMessageDialog(null, "List is empty!");
            return;
        }
        if (head.rollno == rollno) {
            head = head.next;
            JOptionPane.showMessageDialog(null, "Record deleted successfully!");
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            if (curr.next.rollno == rollno) {
                curr.next = curr.next.next;
                JOptionPane.showMessageDialog(null, "Record deleted successfully!");
                return;
            }
            curr = curr.next;
        }
        JOptionPane.showMessageDialog(null, "Record not found!");
    }

    void show() {
        if (head == null) {
            JOptionPane.showMessageDialog(null, "List is empty!");
            return;
        }
        String[] columnNames = {"Name", "Roll No.", "Course", "Marks"};
        Object[][] data = new Object[count()][4];
        Node curr = head;
        int i = 0;
        while (curr != null) {
            data[i][0] = curr.name;
            data[i][1] = curr.rollno;
            data[i][2] = curr.course;
            data[i][3] = curr.marks;
            curr = curr.next;
            i++;
        }
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        JFrame frame = new JFrame("Student Record Management System");
        frame.add(scrollPane);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    void search(int rollno) {
        if (head == null) {
            JOptionPane.showMessageDialog(null, "List is empty!");
            return;
        }
        Node curr = head;
        while (curr != null) {
            if (curr.rollno == rollno) {
                String[] columnNames = {"Name", "Roll No.", "Course", "Marks"};
                Object[][] data = new Object[1][4];
                data[0][0] = curr.name;
                data[0][1] = curr.rollno;
                data[0][2] = curr.course;
                data[0][3] = curr.marks;
                JTable table = new JTable(data, columnNames);
                JScrollPane scrollPane = new JScrollPane(table);
                JFrame frame = new JFrame("Student Record Management System");
                frame.add(scrollPane);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
                JOptionPane.showMessageDialog(null, "Record found!");
                return;
            }
            curr = curr.next;
        }
    }

    int count() {
        int count = 0;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    void saveToFile(Node newNode) {
        try {
            FileWriter fileWriter = new FileWriter("students.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(newNode.name + "," + newNode.rollno + "," + newNode.course + "," + newNode.marks);
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error saving data: " + ex.getMessage());
        }
    }

    void readFromFile() {
        try {
            FileReader fileReader = new FileReader("students.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] record = line.split(",");
                String name = record[0];
                int rollno = Integer.parseInt(record[1]);
                String course = record[2];
                int marks = Integer.parseInt(record[3]);

                insert(name, rollno, course, marks);
            }

            bufferedReader.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error reading data: " + ex.getMessage());
        }
    }

    void clearFile() {
        try {
            FileWriter fileWriter = new FileWriter("students.txt", false);
            fileWriter.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error clearing data: " + ex.getMessage());
        }
    }
}

public class StudentRecordGUI {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.readFromFile(); // Read records from file on program startup

        while (true) {
            String[] options = {"Add Record", "Delete Record", "Show Records", "Search Record", "Exit"};
            int choice = JOptionPane.showOptionDialog(null, "Select an option", "Student Record Management System",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                    options, options[0]);
            switch (choice) {
                case 0:
                    String name = JOptionPane.showInputDialog("Enter name:");
                    int rollno = Integer.parseInt(JOptionPane.showInputDialog("Enter roll number:"));
                    String course = JOptionPane.showInputDialog("Enter course:");
                    int marks = Integer.parseInt(JOptionPane.showInputDialog("Enter marks:"));
                    list.insert(name, rollno, course, marks);
                    break;
                case 1:
                    int roll = Integer.parseInt(JOptionPane.showInputDialog("Enter roll number to delete:"));
                    list.delete(roll);
                    break;
                case 2:
                    list.show();
                    break;
                case 3:
                    int rollNum = Integer.parseInt(JOptionPane.showInputDialog("Enter roll number to search:"));
                    list.search(rollNum);
                    break;
                case 4:
                    list.clearFile(); // Clear the file before program exit
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice!");
            }
        }
    }
}
