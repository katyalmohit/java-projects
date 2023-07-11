import java.util.Scanner;
public class menu_driven{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int choice;
        int ch;
        do{
        System.out.println("Do you want to continue (1/0) : ");
        ch=Sc.nextInt();
        if(ch==1){

        
        System.out.println("1. Print the pattern");
        System.out.println("2. Check whether a number is even or odd");
        System.out.println("3. To get nth Prime number");
        System.out.println("4. To get factorial of a number");
        System.out.println("5. To get the area of a right-angled triangle");
        System.out.println("6. Addition and Multiplication of matrices");
        System.out.println("7. To display Fibonacci series");
        System.out.println("8. String Functions");
        System.out.println();
        
        Questions show= new Questions();
        
        System.out.print("Enter the choice : ");
        choice = Sc.nextInt();
        switch(choice){
            case 1:
            show.pattern();
            break;
            case 2:
            show.even_odd();
            break;
            case 3:
            show.nth_primenumber();
            break;
            case 4:
            show.factorial();
            break;
            case 5:
            show.triangle();
            break;
            case 6:
            show.matrix();
            break;
            case 7:
            show.fibonacci();
            break;
            case 8:
            show.string();
            break;
        }
    }
    else{
        break;
    }
    }while(choice>0 && choice<9);
}
}

class Questions {
     void pattern(){
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
    void even_odd(){
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter any natural number : ");
        int a = Sc.nextInt();
        if (a%2==0){
            System.out.println(a+" is an Even number.");
        }
        else{
            System.out.println(a+" is an Odd number");
        }
    }

    void nth_primenumber(){
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
    
    void factorial() {
        Scanner Sc = new Scanner(System.in);
        
        System.out.print("Enter any number : ");
        int a = Sc.nextInt();
        Factorial f =new Factorial();
        System.out.println("Factorial is "+f.fact(a));
    }

    void triangle() {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Height of triangle: ");
        int h = Sc.nextInt();
        System.out.print("Enter Base of triangle : ");
        int b = Sc.nextInt();
        area(b,h);
    }
    void area(int base, int height){
        double calc = 0.5 * base * height;
        System.out.println("Area of triangle is : "+ calc);

    }
    void matrix()
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
    void fibonacci() {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Till what term would you like to see Fibonacci Series : ");
        int a = Sc.nextInt(); 
        recur f = new recur();
        int count =0;
        for (int i=1;i<=a;i++){
            
            System.out.print(f.fib(i));
            count++;
            if (count<a){
                System.out.print(",");
            }
        }
        System.out.println();
        
    }

    void string( ) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter first string : ");
        String str1= Sc.nextLine();
        StringBuffer newStr1=new StringBuffer(str1); 

        System.out.println("Enter second string : ");
        String str2= Sc.nextLine();
        StringBuffer newStr2=new StringBuffer(str1); 

        System.out.println("1. CharAt");
        System.out.println("2. Length");
        System.out.println("3. Conversion");
        System.out.println("4. Comparison");
        System.out.println();
        System.out.print("Enter your choice : ");
        int c= Sc.nextInt();
        int i;
        switch(c){
            case 1:
            System.out.println("Enter the index : ");
            int index = Sc.nextInt();
            System.out.println("The character at index "+index+" in string 1 is "+str1.charAt(index));
            System.out.println("The character at index "+index+" in string 2 is "+str2.charAt(index));
            break;
            case 2:
            System.out.println("The length of 1st string and 2nd string is "+str1.length()+" and "+str2.length()+" respectively");
            break;
            case 3:
            for (i=0; i< str1.length();i++){
                if(Character.isLowerCase(str1.charAt(i)));
                newStr1.setCharAt(i,Character.toUpperCase(str1.charAt(i)));
                if(Character.isUpperCase(str1.charAt(i))){
                    newStr1.setCharAt(i,Character.toLowerCase(str1.charAt(i)));
                }
            }
            for (i=0; i< str2.length();i++){
                if(Character.isLowerCase(str2.charAt(i)));
                newStr2.setCharAt(i,Character.toUpperCase(str2.charAt(i)));
                if(Character.isUpperCase(str2.charAt(i))){
                    newStr2.setCharAt(i,Character.toLowerCase(str2.charAt(i)));
                }  
            }
            System.out.println("1st String after case conversion is : "+newStr1);
            System.out.println("2nd String after case conversion is : "+newStr2);
            break;
            case 4:
            boolean result = str1.equals(str2);
            if(result == true){
                System.out.println("Both strings are equal.");
            }
            else{
                System.out.println("Both string are not equal");
            }
            break;
    
    }
}
}
    
class Factorial{
    double fact(double n){
        double result;
        if (n==1) return 1;
        result = fact(n-1)*n;
        return result;
    }
}
class recur{
    int fib(int n){
        int result;
        if (n==1) return 0;
        if (n==2) return 1;
        result = fib(n-1)+ fib(n-2);
        return result;
    }
}
