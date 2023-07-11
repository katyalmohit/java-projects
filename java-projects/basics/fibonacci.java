import java.util.Scanner;
class recur{
    int fib(int n){
        int result;
        if (n==1) return 0;
        if (n==2) return 1;
        result = fib(n-1)+ fib(n-2);
        return result;
    }
}
class fibonacci{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Till what term you would like to see Fibonacci Series : ");
        int a = Sc.nextInt(); 
        recur f = new recur();
        int count =0;
        for (int i=1;i<=a;i++){
            
            System.out.print(f.fib(i));
            count++;
            if (count<a){
                System.out.print(",");
            }
        }
        System.out.println();
        
    } 
}