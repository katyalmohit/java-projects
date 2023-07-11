import javax.swing.*;

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
            curr = curr.next;}
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
    }

    public class alternate {
    public static void main(String[] args) {
    LinkedList list = new LinkedList();
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
    System.exit(0);
    default:
    JOptionPane.showMessageDialog(null, "Invalid choice!");
    }
    }
    }
    }        