import java.util.InputMismatchException;
import java.util.Scanner;
class box{
    double surfaceArea(double length, double breadth, double height){
        double area = 2 * ((length * breadth) + (breadth * height) + (height * length));
        return area;
    }
    double Volume(double length, double breadth, double height){
        double volume = length * breadth * height;
        return volume;
    }
    boolean check(double length, double breadth, double height){
        if (length == breadth && breadth == height){
            return true;
        }
        else{
            return false;
        }
    }
}

public class area_volume_calculator {
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter length: ");
            int l = sc.nextInt();
            System.out.println("Enter breadth: ");
            int b = sc.nextInt();
            System.out.println("Enter height: ");
            int h = sc.nextInt();

            test(l,b,h);

        }
        // catch block catches the exception that is found in try block and display message
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(InputMismatchException e){
            System.out.println("Enter a valid integer");
        }

        //this block runs whether there is an exception or not
        finally{
            System.out.println("Program Terminated!");
        }
    }
    static void test(double l, double b, double h){
        // creating an object of class box
        box newBox = new box();
        if(l<0 || b <0 || h<0){
            throw new ArithmeticException("Dimensions cannot be negative!");
        }
        else{
            box obj = new box();
            System.out.println("Surface area: "+obj.surfaceArea(l, b, h));
            System.out.println("Volume: "+obj.Volume(l, b, h));
            if (obj.check(l,b,h)){
                System.out.println("It is a cube!");
            }
            else{
                System.out.println("It is a cuboid!");
            }
        }
    }
}

