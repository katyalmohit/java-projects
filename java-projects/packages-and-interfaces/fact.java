public class fact {
    public static double factorial(double n){
        double result;
        if(n==1) return 1;
        result = factorial(n-1)*n;
        return factorial(n);
    }
}
