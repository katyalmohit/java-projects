class hi  implements Runnable{
    public void run(){
        for(int i=0; i<4; i++){
            System.out.println("Hi");
            try{Thread.sleep(500);}catch(Exception e){}
        }
    }
}
class hello implements Runnable{
    public void run(){
        for(int i=0; i<4; i++){
            System.out.println("Hello");
            try{Thread.sleep(500);}catch(Exception e){}

        }
    }
}
public class threadDemo2{
    public static void main(String[] args){
        hi obj1 = new hi();
        hello obj2 = new hello();
        /*or 
         * Runnable obj1 = new hi();
         * Runnable obj2 = new hello();
         */
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        try{Thread.sleep(10) ;}catch(Exception e){}
        t2.start();
        //obj1.show();
        //obj2.show();
    }
}