import java.util.InputMismatchException;
import java.util.Scanner;
class shapes { 
    int area(){
        System.out.println("inside shape class");
        return 0;
    }
}
class triangle extends shapes{
    int height;
    int base;
    double area(int height, int base){
        return ((0.5)*base*height);
    }
}
class circle extends shapes{
    double radius;
    public double area(double radius){
        return ((3.14)*Math.pow(radius,2));
    }
}
class square extends shapes{
    int side;
    public double area(int side){
        return (Math.pow(side,2));
    }
}
public class areaOfShapes{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    shapes newshape = new shapes();
    triangle newtriangle = new triangle();
    circle newcircle = new circle ();
    square newsquare = new square();
    try { 
        System.out.println("Enter the radius of circle : ");
        double c = sc.nextDouble();
        System.out.println("The area of circle with radius "+c+" is "+newcircle.area(c));
        System.out.println("Height : ");
        int h = sc.nextInt();
        System.out.println("Base : ");
        int b = sc.nextInt();
        System.out.println("The area of triangle is "+newtriangle.area(h,b));
        System.out.println("Side : ");
        int s = sc.nextInt();
        System.out.println("The area of square is "+newsquare.area(s));
        }catch (InputMismatchException e){
            System.out.println("Enter valid input");
        }
   }

}