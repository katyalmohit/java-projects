// lambda expression makes the code more efficient.
/* in this code, we have decreased the number of lines using lambda expression.
but still we are using obj1 and obj2 once, in order to remove them we can write 
the lines from 15 to 21 in place of obj1 in line 24 and similarly for obj2*/ 
public class lambdaExp{
    public static void main(String[] args){
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
    }
}