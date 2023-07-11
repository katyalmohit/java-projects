import java.util.Scanner;

public class queuesimulation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of queues: ");
        int numQueues = sc.nextInt();
        Queue[] queues = new Queue[numQueues];
        for (int i = 0; i < numQueues; i++) {
            queues[i] = new Queue();
            // enqueue some number of persons into each queue
            for (int j = 0; j < 7; j++) {
                queues[i].enqueue(j);
            }
        }
    
        // simulate the movement of people between the queues
        while (!queues[numQueues - 1].isEmpty()) {
            // process person at front of last queue
            queues[numQueues - 1].dequeue();
            // move people between queues
            for (int i = numQueues - 2; i >= 0; i--) {
                if (!queues[i].isEmpty()) {
                    int person = queues[i].dequeue();
                    queues[i + 1].enqueue(person);
                }
            }
            // display the state of the queues
            for (int i = 0; i < numQueues; i++) {
                System.out.println("Queue " + i + ": " + queues[i]);
            }
            System.out.println();
        }
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
    public int dequeue() {
        if (head == null) {
            System.out.println("List is already empty");
            return -1;
        } else {
            int person = head.getData();
            head = head.getNext();
            size--;
            return person;
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
    public String toString() {
        StringBuilder sb = new StringBuilder();
        node t = head;
        while (t != null) {
            sb.append(t.getData()).append(" ");
            t = t.getNext();
        }
        return sb.toString();
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
