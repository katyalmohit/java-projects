public class methodOverriding {
    public static void main(String[] args){
        //same name, same number of arguments
        System.out.println("Same name, Same number of arguments : "+add(1,2));

        //same name, different number of arguments
        System.out.println("Same name, Different number of arguments : "+add(1,2,3,4));

        //same name, different type of arguments
        System.out.println("Same name, Different type of arguments : "+add(1.9,2.8f));

        //same name, different number and type of arguments
        System.out.println("Same name, Different number and type of arguments : "+add(22,1.9,2.8f));
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b, int c, int d){
        return a+b+c+d;
    }
    public static double add(double a, float b){
        return a+b;
    }
    public static double add(int a, double b, float c){
        return a+b+c;
    }
}
