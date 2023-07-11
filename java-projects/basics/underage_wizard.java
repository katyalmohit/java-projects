class underage extends Exception{
    public final int age;
    public underage(int age){
        this.age = age;
    }
    public void printmessage(){
        System.out.println("Underage Wizard! ");
    }

}
public class underage_wizard{
    public static void main(String[] args){
        try{
            test(22);
            test(17);
        }catch(underage e){
            e.printmessage();
        }
        
    }
    public static void test(int age) throws underage{
        if(age < 18){
            throw new underage(age);
        }
        else{
            System.out.println("You're eligible!");
        }
    }
}