import java.util.Scanner;
class Factorial{
    double fact(double n){
        double result;
        if (n==1) return 1;
        result = fact(n-1)*n;
        return result;

    }
}
class recursion{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Enter any number : ");
        int a = Sc.nextInt();
        Factorial f =new Factorial();
        
        System.out.println("Factorial is "+f.fact(a));
    }
}