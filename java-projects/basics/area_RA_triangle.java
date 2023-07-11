import java.util.Scanner;
class area_RA_triangle {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Height of triangle: ");
        int h = Sc.nextInt();
        System.out.print("Enter Base of triangle : ");
        int b = Sc.nextInt();
        area(b,h);
    }
    public static void area(int base, int height){
        double calc = 0.5 * base * height;
        System.out.println("Area of triangle is : "+ calc);

    }
    
}

    
     

