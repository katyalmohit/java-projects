public class threadDemo3{
    public static void main(String[] args){
        /*instead of creating many classes and increasing the no. of lines is our program, 
        we can create an anonymous class like this: */ 
        Runnable obj1 = new Runnable(){
            public void run(){
                for(int i=0; i<4; i++){
                    System.out.println("Hi");
                    try{Thread.sleep(500);}catch(Exception e){}
                }
             }
        };
        Runnable obj2 = new Runnable(){
            public void run(){
                for(int i=0; i<4; i++){
                    System.out.println("Hello");
                    try{Thread.sleep(500);}catch(Exception e){}

                }
            }
        };
         
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        try{Thread.sleep(10) ;}catch(Exception e){}
        t2.start();
        //obj1.show();
        //obj2.show();
    }
}