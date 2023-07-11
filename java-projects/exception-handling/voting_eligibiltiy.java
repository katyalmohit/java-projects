import java.util.InputMismatchException;
import java.util.Scanner;
class UnderAge extends Exception {
    int age;

    UnderAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Under Age: " + age+"\nYou are not eligible to vote!";
    }
}

public class voting_eligibiltiy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            test(age);
        } catch (UnderAge e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch(InputMismatchException e){
            System.out.println("Invalid Input! Please enter a valid integer.");
        }finally{
            System.out.println("Thank You!");
            sc.close();
        }
    }

    static void test(int age) throws UnderAge {
        if (age < 18 && age>=0) {
            throw new UnderAge(age);
        }
        else if(age<0){
            throw new ArithmeticException("Age is negative");
        }
        else {
            System.out.println("Age is: " + age+"\nYou are eligible to vote!");
        }
    }
}
