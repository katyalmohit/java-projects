import java.util.Scanner;

class Operations {
    int[] q;
    int size;
    int rear;
    int front;
    int rear2 = rear;

    Operations(int size) {
        this.size = size;
        this.q = new int[size];
        this.rear = -1;
        this.front = -1;
    }

    void enqueue(int x) {
        
        if (rear < size - 1) {
            rear++;
            q[rear] = x;
        }
        
        else {
            System.out.println("OVERFLOW!");
        } 
    }

    void dequeue() {
        if (front < rear) {
            front++;
            System.out.println(q[front]);
        } else {
            System.out.println("UNDERFLOW!");
        }
    }
    void display(){
        for (int i = front+1 ;i <= rear;i++){
            System.out.println("Elements are : "+q[i]);
        }
        
    }
}

public class queue_array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of queue: ");
        int size = sc.nextInt();
        Operations obj = new Operations(size);

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
