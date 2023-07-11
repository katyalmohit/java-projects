public class threadDemo5 {
    public static void main(String[] args) throws Exception{
        Thread t1 = new Thread(() ->
            {
                for(int i=0; i<4; i++){
                    System.out.println("Hi");
                    try{Thread.sleep(500);}catch(Exception e){}
                }
             },"Hi Thread");
        Thread t2 = new Thread(() ->
            {
                for(int i=0; i<4; i++){
                    System.out.println("Hello");
                    try{Thread.sleep(500);}catch(Exception e){}
                }
            },"Hello Thread");
            //t1.setName("Hi Thread");
            //t2.setName("Hello Thread");
        
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Priority of t1: "+t1.getPriority());
        System.out.println("Priority of t2: "+t2.getPriority());

        System.out.println(t1.getName());
        System.out.println(t2.getName());

        t1.start();
        try{Thread.sleep(10) ;}catch(Exception e){}
        t2.start();
        
        t1.join();
        t2.join();
        System.out.println(t1.isAlive());
        System.out.println("Bye");

    }
}