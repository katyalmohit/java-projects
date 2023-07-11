package package2;

public class fib {
    public static void show(int n){
        for (int i= 1; i <= n;i ++){
            System.out.print(recur(i)+",");
           
        }
        
    }
    public static int recur(int n){
        if (n==1) return 0;
        if (n==2) return 1;
        int result = recur(n-1)+recur(n-2);
        return result;
    }
}
