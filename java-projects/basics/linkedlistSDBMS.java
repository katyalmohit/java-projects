import java.util.Scanner;
import java.io.*;
class Data {
    private String name;
    private int rollno ;
    private String course;
    private int marks;

    public Data(String name, int rollno, String course, int marks){
        this.name = name;
        this.rollno = rollno;
        this.course = course;
        this.marks = marks;
        
    }
    public void saveToFile(PrintWriter writer) {
        writer.println(name);
        writer.println(rollno);
        writer.println(course);
        writer.println(marks);
    }
    //getters
    public String getName(){
        return name;
    }
    public int getRollno(){
        return rollno;
    }
    public String getCourse(){
        return course;
    }
    public int getMarks(){
        return marks;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setRollno(int rollno){
        this.rollno = rollno;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public void setMarks(int marks){
        this.marks = marks;
    }



}
class Node {
    private Data data;
    private Node next;

    public Node(){}
    public Node (Data data, Node next){
        this.data = data;
        this.next = next;
    }

    public void setData(Data data){
        this.data = data;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Data getData(){
        return this.data;
    }
    public Node getNext(){
        return this.next;
    }

}
class LinkedList{
    private int size;
    Node start;
    public LinkedList(){}

    public void insertAtFirst(String name, int rollno, String course, int marks){
        Data data = new Data(name, rollno, course, marks);
        Node newNode = new Node(data,start);
        start = newNode;
        size++;
    }
    public void insertAtLast(String name, int rollno, String course, int marks){
        Data data = new Data(name, rollno, course, marks);
        Node newNode = new  Node(data, null);
        if (start == null){
            start = newNode;
        }
        else{
            Node current = start;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    public void insertAtPos(String name, int rollno, String course, int marks, int pos){
        if (pos ==1){
            insertAtFirst(name, rollno, course, marks);
        }
        else if (pos == size+1){
            insertAtLast(name, rollno, course, marks);
        }
        else if (pos >1 && pos <=size){
            Data data = new Data(name, rollno, course, marks);
            Node current;
            Node newNode= new Node(data, null);
            current = start;
            for (int i =1; i<pos-2;i++){
                current= current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
            size++;
        }
        else{
            System.out.println("Insertion not possible at at position "+pos);
        }

    }

    public void deleteFirst(){
        if (start == null){
            System.out.println("List is already empty");
        }
        else{
            start = start.getNext();
            size--;
        }
    }

    public void deleteLast(){
        if (start == null){
            System.out.println("List is already empty");
        }
        else if (size == 1){
            start = null;
            size--;
        }
        else{
            Node t;
            t = start;
            for (int i=1; i<size-2;i++){
                t = t.getNext();
            }
            t.setNext(null);
            size--;
        }
    }
    public void deleteAtPos(int pos){
        if (start==null){
            System.out.println("List is already empty");
        }
        else if(pos<1 || pos >size){
            System.out.println("Invalid position");
        }
        else if (pos == 1){
            deleteFirst();
        }
        else if (pos == size){
            deleteLast();
        }
        else{
            Node t,t1;
            t= start;
            for(int i=1;i < pos-1;i++){
                t=t.getNext();
            }
            t1=t.getNext();
            t.setNext(t1.getNext());
            size--;
        }
    }
    private void deleteDataFromFile(Data data) {
        try {
            File inputFile = new File("student_records.txt");
            File tempFile = new File("temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String currentLine;
            String deleteName = data.getName();
            int deleteRollno = data.getRollno();
            String deleteCourse = data.getCourse();
            int deleteMarks = data.getMarks();
            boolean isDeleted = false;

            while ((currentLine = reader.readLine()) != null) {
                if (currentLine.equals(deleteName) || currentLine.equals(Integer.toString(deleteRollno))
                        || currentLine.equals(deleteCourse) || currentLine.equals(Integer.toString(deleteMarks))) {
                    // Skip the lines to be deleted
                    reader.readLine();
                    isDeleted = true;
                    continue;
                }
                writer.write(currentLine);
                writer.newLine();
            }

            reader.close();
            writer.close();

            if (isDeleted) {
                // Rename the temp file to replace the original file
                if (inputFile.delete() && tempFile.renameTo(inputFile)) {
                    System.out.println("Data deleted from file successfully!");
                } else {
                    System.out.println("An error occurred while deleting data from file.");
                }
            } else {
                tempFile.delete(); // Delete the temporary file if no data was deleted
                System.out.println("No matching data found in the file.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while deleting data from file.");
        }
    }
    public boolean isEmpty(){
        if (start == null){
            return true;
        }
        else{
            return false;
        }
    }

    public int getListSize(){
        return size;
    }

    public void viewList(){
        Node currentNode = start;
        if (isEmpty()){
            System.out.println("List is Empty");
        }
        else{
            
            for (int i =1; i <=size;i++){
                Data studentData = currentNode.getData();
                System.out.println("Name: " + studentData.getName());
                System.out.println("Roll Number: " + studentData.getRollno());
                System.out.println("Course: " + studentData.getCourse());
                System.out.println("Marks: " + studentData.getMarks());
                System.out.println();
                
                currentNode= currentNode.getNext();
            }
            
        }
    }
    public void search(int rn) {
        Node currentNode = start;
        boolean found = false; 
        if (isEmpty()) {
            System.out.println("List is Empty");
        } else {
            while (currentNode != null) {
                Data studentData = currentNode.getData();
                if (rn == studentData.getRollno()) {
                    System.out.println("Name: " + studentData.getName());
                    System.out.println("Roll Number: " + studentData.getRollno());
                    System.out.println("Course: " + studentData.getCourse());
                    System.out.println("Marks: " + studentData.getMarks());
                    System.out.println();
                    found = true;
                }
                currentNode = currentNode.getNext();
            }
            if (!found) { 
                System.out.println("Student with roll number " + rn + " not found");
            }
        }
    }

}
public class linkedlistSDBMS{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int ch, rollno, marks, pos;
        String name, course;
        boolean flag = true;

        while (flag) {
            System.out.println("");
            System.out.println("1. Insert at first");
            System.out.println("2. Insert at last");
            System.out.println("3. Insert at position");
            System.out.println("4. Delete from start");
            System.out.println("5. Delete from last");
            System.out.println("6. Delete from any position");
            System.out.println("7. Search by roll number");
            System.out.println("8. Display the list");
            System.out.println("9. Exit");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter name:");
                    sc.nextLine();
                    name = sc.nextLine();
                    System.out.println("Enter roll number:");
                    rollno = sc.nextInt();
                    System.out.println("Enter course:");
                    sc.nextLine();
                    course = sc.nextLine();
                    System.out.println("Enter marks:");
                    marks = sc.nextInt();
                    list.insertAtFirst(name, rollno, course, marks);
                    break;

                case 2:
                    System.out.println("Enter name:");
                    sc.nextLine();
                    name = sc.nextLine();
                    System.out.println("Enter roll number:");
                    rollno = sc.nextInt();
                    System.out.println("Enter course:");
                    sc.nextLine();
                    course = sc.nextLine();
                    System.out.println("Enter marks:");
                    marks = sc.nextInt();
                    list.insertAtLast(name, rollno, course, marks);
                    break;

                case 3:
                    System.out.println("Enter name:");
                    sc.nextLine();
                    name = sc.nextLine();
                    System.out.println("Enter roll number:");
                    rollno = sc.nextInt();
                    System.out.println("Enter course:");
                    sc.nextLine();
                    course = sc.nextLine();
                    System.out.println("Enter marks:");
                    marks = sc.nextInt();
                    System.out.println("Enter position:");
                    pos = sc.nextInt();
                    list.insertAtPos(name, rollno, course, marks, pos);
                    break;

                case 4:
                    list.deleteFirst();
                    break;

                case 5:
                    list.deleteLast();
                    break;

                case 6:
                    System.out.println("Enter position:");
                    pos = sc.nextInt();
                    list.deleteAtPos(pos);
                    break;

                case 7:
                    System.out.println("Enter roll number to search:");
                    rollno = sc.nextInt();
                    list.search(rollno);
                    break;

                case 8:
                    list.viewList();
                    break;


                case 9:
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        sc.close();
    }
}