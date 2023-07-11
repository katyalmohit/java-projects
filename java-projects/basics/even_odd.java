import java.util.Scanner;
public class even_odd {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter any natural number : ");
        int a = Sc.nextInt();
        if (a%2==0){
            System.out.println(a+" is an Even number.");
        }
        else{
            System.out.println(a+" is an Odd number");
        }
    }
    
}
