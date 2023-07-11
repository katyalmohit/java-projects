import java.util.Scanner;
public class matrixCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension : ");
        int size = sc.nextInt();
        int arr1[][] = new int[size][size];
        int arr2[][] = new int[size][size];
        Boolean flag = true;

        System.out.println("ENTER ELEMENTS FOR MATRIX-1");
        for(int i=0; i< size; i++){
            for (int j=0; j<size; j++){
                System.out.print("Enter the element ["+(i+1)+"]["+(j+1)+"] : ");
                arr1[i][j]= sc.nextInt();
            }
        }
        display(arr1, size);
        System.out.println("ENTER ELEMENTS FOR MATRIX-2");
        for(int i=0; i< size; i++){
            for (int j=0; j<size; j++){
                System.out.print("Enter the element ["+(i+1)+"]["+(j+1)+"] : ");
                arr2[i][j]= sc.nextInt();
            }
        }
        display(arr2, size);
        matrixCalculator mat = new matrixCalculator();
        while(flag){
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Exit");
            System.out.println("Enter choice : ");
            int ch = sc.nextInt();
            
            switch(ch){
                case 1:
                    mat.add(arr1, arr2, size);
                    break;
                case 2:
                    mat.sub(arr1, arr2, size);
                    break;
                case 3:
                    mat.multi(arr1, arr2, size);
                    break;
                case 4:
                    System.out.println("Program Terminated!");
                    flag = false;
                    break;

        }
        }
        
        

    }
    public static void display(int arr[][], int size){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    void add(int arr1[][], int arr2[][], int dim){
        int sum[][] = new int[dim][dim];
        for (int i=0; i<dim; i++){
            for (int j=0; j<dim; j++){
                sum[i][j] = arr1[i][j]+ arr2[i][j]; 
            }
        }
        System.out.println("Sum of matrix1 and matrix2 is : ");
        display(sum,dim);
    }
    void sub(int arr1[][], int arr2[][], int dim){
        int dif[][] = new int[dim][dim];
        for (int i=0; i<dim; i++){
            for (int j=0; j<dim; j++){
                dif[i][j] = arr1[i][j]- arr2[i][j]; 
            }
        }
        System.out.println("Difference of matrix1 and matrix2 is : ");
        display(dif, dim);
    }
    void multi(int arr1[][], int arr2[][], int dim){
        int prod[][]= new int[dim][dim];
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                prod[i][j] = 0;
                for (int k = 0; k < dim; k++)
                    prod[i][j] += arr1[i][k]* arr2[k][j];
            }
        }
        System.out.println("Product of matrix1 and matrix2 is : ");
        display(prod, dim);
    }
}
