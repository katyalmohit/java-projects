import java.util.Scanner;
class addition
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner (System.in);
        int a = Sc.nextInt();
        System.out.println("Enter first number : "+a);
        int b = Sc.nextInt();
        System.out.println("Enter second number : "+b);
        int c = a+b;
        System.out.println("The sum is : "+c);
        System.out.println();

    }

}