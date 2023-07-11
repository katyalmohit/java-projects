import java.util.Scanner;
class Node {
    private int data;
    private Node next;

    public Node(){}
    public Node (int data, Node next){
        this.data = data;
        this.next = next;
    }

    public void setData(int data){
        this.data = data;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public int getData(){
        return this.data;
    }
    public Node getNext(){
        return this.next;
    }

}
class linked_list{
    private int size;
    private Node start;
    public linked_list(){}

    public void insertAtFirst(int value){
        Node n;
        n = new Node();
        n.setData(value);
        n.setNext(start);
        start = n;
        size++;
    }
    public void insertAtLast(int value){
        Node n,t;
        n= new Node();
        n.setData(value);
        t= start;
        if (t == null){
            start = n;
        }
        else{
            while(t.getNext() != null){
                t = t.getNext();
                t.setNext(n);
            }
        }
        size++;
    }

    public void insertAtPos(int value, int pos){
        if (pos ==1){
            insertAtFirst(value);
        }
        else if (pos ==size+1){
            insertAtLast(value);
        }
        else if (pos >1 && pos <=size){
            Node n,t;
            n= new Node(value, null);
            t = start;
            for (int i =1; i<pos-1;i++){
                t= t.getNext();
            }
                n.setNext(t.getNext());
                t.setNext(n);
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
            for (int i=1; i<size-1;i++){
                t = t.getNext();
            t.setNext(null);
            size--;
            }
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
    public boolean isEmpty(){
        if (start == null){
            return true;
        }
        else{
            return false;
        }
    }

    public void viewList(){
        Node t;
        if (isEmpty()){
            System.out.println("List is Empty");
        }
        else{
            t = start;
            for (int i =1; i <=size;i++){
                System.out.println(""+t.getData());
                t= t.getNext();
            }
        }
    }
}
public class linkedlist{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        linked_list list = new linked_list();
        int ch,val,pos;
        boolean flag = true;

        while (flag){
        System.out.println("");
        System.out.println("1. Insert at first");
        System.out.println("2. Insert at last");
        System.out.println("3. insert at position");
        System.out.println("4. delete from start");
        System.out.println("5. delete from last");
        System.out.println("6. delete from any position");
        System.out.println("7. display");
        System.out.println("8. Exit");
        System.out.println("Enter your choice : ");
        ch = sc.nextInt();
        
            switch(ch){
                case 1:
                    System.out.println("Enter value :");
                    val = sc.nextInt();
                    list.insertAtFirst(val);
                    break;

                case 2:
                    System.out.println("Enter value :");
                    val = sc.nextInt();
                    list.insertAtLast(val);
                    break;

                case 3:
                    System.out.println("Enter position :");
                    pos = sc.nextInt();
                    System.out.println("Enter vaue ");
                    val = sc.nextInt();
                    list.insertAtPos(val, pos);
                    break;
                
                case 4:
                    list.deleteFirst();
                    break;
                
                case 5:
                    list.deleteLast();
                    break;

                case 6:
                    System.out.println("Enter position : ");
                    pos = sc.nextInt();
                    list.deleteAtPos(pos);
                    break;
                case 7:
                    list.viewList();
                    break;

                case 8:
                    flag = false;
                    break;
                
                default:
                    System.out.println("Invalid choice");

            }
        }
    }
}
