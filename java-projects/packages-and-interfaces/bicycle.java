public class bicycle implements properties{
    public static void main(String[] args) {
        bicycle b = new bicycle();
        b.brake();
        b.speedup();
    }
    public void brake(){
        System.out.println("speed decrease");
    }
    public void speedup(){
        System.out.println("Speed increase");
    }
}
interface properties{
    void brake();
    void speedup();
}
