public class threadDemo4{
    public static void main(String[] args) throws Exception{
        /*instead of creating many classes and increasing the no. of lines is our program, 
        we can create an anonymous class like this: */ 
        Thread t1 = new Thread(() ->
            {
                for(int i=0; i<4; i++){
                    System.out.println("Hi");
                    try{Thread.sleep(500);}catch(Exception e){}
                }
             });
        Thread t2 = new Thread(() ->
            {
                for(int i=0; i<4; i++){
                    System.out.println("Hello");
                    try{Thread.sleep(500);}catch(Exception e){}
                }
            });
        t1.start();
        try{Thread.sleep(10) ;}catch(Exception e){}
        t2.start();
        /*This will print the message in a weird way i.e., in between. 
        this happens because, thread1 and thread2 were performing there own tasks 
        whereas main thread was doing nothing. So, here main thread is also involved 
        when we want to do any other tasks.
        */
        System.out.println("Bye");
        //in order to tackle earlier problem, we use join and alive method
        System.out.println("Is t1 alive: "+t1.isAlive());
         t1.join();
         System.out.println("Is t1 alive: "+t1.isAlive());
         System.out.println("Is t2 alive: "+t2.isAlive());
         t2.join();
         
         System.out.println("Bye");
    }
}