import java.util.InputMismatchException;
import java.util.Scanner;
public class repSubtraction {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter Dividend : ");
            int dividend = sc.nextInt();
            System.out.println("Enter Divisor : ");
            int divisor = sc.nextInt();

            repSubtraction r = new repSubtraction();
            r.remainder(dividend, divisor);
        }
        //it will print the message and handle the exception as well
        catch (InputMismatchException | ArithmeticException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
        
    }
    /*  throws clause of the method remainder specifies that the method might throw both Arithmetic and IllegalArgumentException*/
    void remainder(int dividend, int divisor) throws ArithmeticException, IllegalArgumentException{
        
            if (divisor == 0){
                throw new ArithmeticException("Divide by zero error!");
            }
            if(divisor < 0){
                throw new IllegalArgumentException("Divisor must be positive!");
            }
            if(dividend <0){
                throw new IllegalArgumentException("Dividend must be positive!");
            }
            //this output will not be displayed because int has a certain limit which 
            if(divisor > Integer.MAX_VALUE || dividend >Integer.MAX_VALUE){
                throw new ArithmeticException("Overflow error!");
            }
            else if(dividend>dividend){
                System.out.println("Remainder is :"+dividend);
            }
            else{
                
                while(dividend >= divisor){
                    dividend = dividend - divisor;
                }
                System.out.println("Remainder is : "+dividend);
            }
        
        
        
        
        
    }

    
}

    
