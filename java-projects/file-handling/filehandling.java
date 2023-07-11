import java.io.*;
import java.util.Scanner;
import java.io.IOException;
public class filehandling{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        filehandling obj = new filehandling();
        boolean flag = true;
        while (flag){
            System.out.println("1. write in file ");
            System.out.println("2. Read from file ");
            System.out.println("3. Exit ");
            String choice = sc.nextLine();
            switch(choice){
                case "1":
                    System.out.println("Enter the file name: ");
                    String fileName = sc.nextLine();
                    System.out.println("Enter the content: ");
                    String content = sc.nextLine();
                    obj.write(content, fileName);
                    break;
                case "2":
                    System.out.println("Enter the file name: ");
                    String fileName1 = sc.nextLine();
                    obj.read(fileName1);
                    System.out.println("");
                    break;
                case "3":
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
            
        }
        

    }
    void write(String content, String fileName){
        try{
            FileWriter fw = new FileWriter(fileName, true);
            fw.write(content);
            fw.close();
            System.out.println("File written successfully!");

        }catch(IOException e){
            System.out.println("Error occured!");
        }
    }
    void read(String FileName){
        try{
            FileReader fr = new FileReader(FileName);
            int i;
            while((i=fr.read())!=-1){
                System.out.print((char)i);
            }
            fr.close();
        }catch(IOException e){
            System.out.println("File does not exist!");
        }
    }
    
}