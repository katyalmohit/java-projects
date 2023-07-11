import java.util.Scanner;
public class nth_primeNumber{
    public static void main(String args[]){
        int i,j,k=0,count=0;

        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int a = Sc.nextInt();
        for (i=2; ;i++){
            for(j=2;j<i;j++){
                if (i%j ==0){
                    k=1;
                    break;
                }
                else {
                    k=0; 
                }
            }
            if (k==0){
                count+=1;
                if (count==a){
                    System.out.println("The "+a+"th prime number is : "+i);
                    break;
                }
            } 
            
        }
    }
}