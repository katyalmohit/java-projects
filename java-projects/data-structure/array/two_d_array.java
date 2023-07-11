import java.util.Scanner;
public class two_d_array {
    public static void main(String args[])
    {

        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the order of matrix  : ");
        int a = Sc.nextInt();
        int [][]arr1 = new int[a][a];
        int [][]arr2 = new int[a][a];
        int [][]sum = new int [a][a];
        int prod[][] = new int[a][a];
        int i,j,k,l,m;
        System.out.println("Enter the elements for 1st matrix");
        for (i=0;i<a;i++){
            for (j=0;j<a;j++){
                
                System.out.print("Enter the element ["+(i+1)+"]["+(j+1)+"] : ");
                k= Sc.nextInt();
                arr1[i][j]=k;
            }

        }
        System.out.println("Ist Matrix : ");
        for (i=0;i<a;i++){
            for (j=0;j<a;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println("Now, Enter the elements for 2nd matrix");
        for (i=0;i<a;i++){
            for (j=0;j<a;j++){
                
                System.out.print("Enter the element ["+(i+1)+"]["+(j+1)+"] : ");
                l= Sc.nextInt();
                arr2[i][j]=l;
            }

        }
        System.out.println("2nd Matrix : ");
        for (i=0;i<a;i++){
            for (j=0;j<a;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();

        }
        for (i=0;i<a;i++){
            for (j=0;j<a;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }

        }
        System.out.println();
        System.out.println("The sum of two matrices is : ");
        for (i=0;i<a;i++){
            for (j=0;j<a;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        
        for (i = 0; i < a; i++) {
            for (j = 0; j < a; j++) {
                prod[i][j] = 0;
                for (k = 0; k < a; k++)
                    prod[i][j] += arr1[i][k]* arr2[k][j];
            }
        }  
        System.out.println();
        System.out.println("Product of two matrices is : ");
        for (i = 0; i < a; i++) {
            for (j = 0; j <a; j++)
                System.out.print(prod[i][j]+ " ");
            System.out.println();
            
        }

    }
}