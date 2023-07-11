import java.util.Scanner;
public class sorting_searching{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,k,s;
        int count =0;
        int count1 =0;
        int count2 = 0;
        System.out.println("How many numbers : ");
        a = sc.nextInt();
        b = a;
        int arr[] = new int[a];
        int arr1[] = new int[a];
       
        
        for (int i =0; i<a; i++){
            System.out.println("Enter number :");
            b= sc.nextInt();
            arr[i]= b;
            arr1[i]=arr[i];
        }
        for (int i=1;i<a;i++){
            for (int j=0; j<i; j++){
                if(arr1[i]<arr1[j]){
                    k = arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=k;
                    count++;
                }
            }
        }
        for (int i =0; i<a; i++){
            System.out.println(arr1[i]);
        }
        
        System.out.println("Enter the element you want to search : ");
        s = sc.nextInt();
        for (int i =0; i<a; i++){
            if (arr1[i]==s){
                System.out.println("Element in sorted array found at index "+i);
                
            }
            
            if (arr[i]==s){
                System.out.println("Element in unsorted array found at index "+i);
                
            }
            count1 ++;
        }
        System.out.println("count : "+count);
        System.out.println("count1 : "+count1);

        while (s!= arr1[b/2]){
            
            if (s<arr1[b/2]){
                b=b/2;
            } 
            if (s>arr1[b/2]){
                b=3*b;
            }
            
        }
        System.out.println("Element found at : "+((b/2)+1));



        

    }
    

}
