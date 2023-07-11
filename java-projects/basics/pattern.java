import java.util.Scanner;
public class pattern {
    public static void main(String[] args){
        int i,j;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter No. of Rows/Columns : ");
        int a = Sc.nextInt();
        for(i=a; i>0; i--){
            for (j=i-1;j>=0;j--){
                System.out.print("$ ");
                
            }
            System.out.println();
        }
    }
    
}
