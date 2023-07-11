class runtime_calculation
{
    public static void main(String args[])
    {
        long startTime = System.nanoTime(); 
        int i,n;
        n=1;
        
        for(i=1;i<50000;i++){
            n=n+1;
        }
        long endTime = System.nanoTime(); 
        long totalTime = endTime - startTime;
        System.out.println(totalTime);



    }

    {
        long startTime = System.nanoTime(); 
        int i,n;
        n=1;
        
        for(i=50000;i>1;i--){
            n=n+1;
        }
        long endTime = System.nanoTime(); 
        long totalTime = endTime - startTime;
        System.out.println(totalTime);



    }}
