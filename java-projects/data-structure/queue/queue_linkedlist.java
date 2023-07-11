import java.util.Scanner;
public class queue_linkedlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of queue: ");
        int size = sc.nextInt();
        Queue obj = new Queue();

        boolean flag = false;
        int ch;
        do{
            System.out.println("1. Enqueue ");
            System.out.println("2. Dequeue ");
            System.out.println("3. Display ");
            System.out.println("4. Exit ");
            System.out.print("Enter choice : ");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter: ");
                    int element = sc.nextInt();
                    obj.enqueue(element);
                    break;
                case 2:
                    obj.dequeue();
                    break;
                case 3:
                    obj.display();
                    break;
                case 4:
                    flag = true;
                    break;

            }
        }while((ch>0 || ch<5 )& flag==false);
        
    }
}
class Queue{
    private int size;
    private node head;

    public Queue(){}
    public void enqueue(int value){
        node n,t;
        n= new node();
        n.setData(value);
        t= head;
        if (t == null){
            head = n;
        }
        else{
            while(t.getNext() != null){
                t = t.getNext();
                
            }
            t.setNext(n);
        }
        size++;
    }
    public void dequeue(){
        if (head == null){
            System.out.println("List is already empty");
        }
        else{
            head = head.getNext();
            size--;
        }
    }
    public boolean isEmpty(){
        if (head == null){
            return true;
        }
        else{
            return false;
        }
    }
    public void display(){
        node t;
        if (isEmpty()){
            System.out.println("List is Empty");
        }
        else{
            t = head;
            for (int i =1; i <=size;i++){
                System.out.println(""+t.getData());
                t= t.getNext();
            }
        }
    }

}
class node{
    private int data;
    private node next;

    node(){}
    node (int data, node next){
        this.data = data;
        this.next = next;
    }
    public void setData(int data){
        this.data= data;
    }
    public int getData(){
        return this.data;
    }

    public void setNext(node next){
        this.next = next;
    }
    public node getNext(){
        return this.next;
    }

}