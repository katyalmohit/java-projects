import java.security.SecureRandom;
import java.util.Scanner;
public class passwordGenerator{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of password : ");
        int size  = sc.nextInt();

        char arr[]= new char[size];
        String upperLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerLetter = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*(){}[],.<>?/+-*.";
        String alphanumeric = upperLetter + lowerLetter + numbers + specialChars;

        passwordGenerator enc = new passwordGenerator();
        System.out.print(enc.generate(alphanumeric, size));
        System.out.println();

        
    }
    String generate(String alphanumeric, int size){
        SecureRandom r  = new SecureRandom();
        char arr[] = new char[size];
        for(int i=0; i<size; i++){
            int index = r.nextInt(alphanumeric.length());
            arr[i]= alphanumeric.charAt(index);
        }
        return new String(arr);
    }
}
