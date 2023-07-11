package package1;
import package2.fib;
//inter-package call
import java.util.Scanner;
public class callfib {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many terms of fibonacci series : ");
        int ch = sc.nextInt();
        fib.show(ch);
        
    }
}
