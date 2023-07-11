import java.util.Scanner;

// superclass <vehicle>
class vehicle{
    public String model;
    public String regno;
    public int speed;
    public int fuelcap;
    public int fuelcons;
    
    vehicle(){}
    vehicle(String model, String regno, int speed, int fuelcap, int fuelcons){
        this.model = model;
        this.regno = regno;
        this.speed = speed;
        this.fuelcap = fuelcap;
        this.fuelcons = fuelcons;
    }

    // setters and getters

    // for model 
    void setModel(String model){
        this.model = model;
    }
    String getModel(){
        return this.model;
    }

    // for registration number 
    void setRegno(String regno){
        this.regno = regno;
    }
    String getRegno(){
        return this.regno;
    }

    // for speed
    void setSpeed(int speed){
        this.speed = speed;
    }
    int getSpeed(){
        return this.speed;
    }

    // for fuel capacity
    void setFuelcap(int fuelcap){
        this.fuelcap = fuelcap;
    }
    int getFuelcap(){
        return this.fuelcap;
    }

    //for fuel consumption 
    void setFuelcons(int fuelcons){
        this.fuelcons = fuelcons;
    }
    int getFuelcons(){
        return this.fuelcons;
    }

    // a method <fuelNeeded> which will return the amount of fuel needed after taking distance as argument
    String fuelNeeded(double distance){
        return ("Fuel Needed "+(fuelcons*distance));
    }

    String distanceCovered(double time){
        return ("Distance Covered : "+(speed*time));
    }

    public String display(){
        return ("Vehicle Model : "+this.getModel()+"\n"
        +"Registration Number : "+this.getRegno()+"\n"
        +"Vehicle Speed : "+this.getSpeed()+"\n"
        +"Fuel Capacity : "+this.getFuelcap()+"\n"
        +"Fuel Consumption : "+this.getFuelcons()+"\n");
    }
}
//subclass <truck> of superclass <vehicle>
class truck extends vehicle{
    private double cargWeight;
    
    // constructor
    truck(){}
    truck(String model, String regno, int speed, int fuelcap, int fuelcons,double cargWeight){
        //invoking base-class (vehicle) constructor
        super(model, regno, speed, fuelcap, fuelcons);
        this.cargWeight = cargWeight;
    }

    // setters and getters 
    void setCargWeight(double cargWeight){
        this.cargWeight = cargWeight;
    }
    double getCargWeight(){
        return this.cargWeight;
    }

    // method <display> is being over-ridden
    public String display(){
        return ("Vehicle Model : "+this.getModel()+"\n"
        +"Registration Number : "+this.getRegno()+"\n"
        +"Vehicle Speed : "+this.getSpeed()+"\n"
        +"Fuel Capacity : "+this.getFuelcap()+"\n"
        +"Fuel Consumption : "+this.getFuelcons()+"\n"
        +"Cargo Weight Limit : "+this.getCargWeight()+"\n");
    }
}
// subclass <bus> of superclass <vehicle>
class bus extends vehicle{
    private int numPass;

    // constructor
    bus(){}
    bus(String model, String regno, int speed, int fuelcap, int fuelcons,int numPass){
        //invoking base-class (vehicle) constructor
        super(model, regno, speed, fuelcap, fuelcons);
        this.numPass = numPass;
    }

    // setters and getters
    void setNumPass(int numPass){
        this.numPass = numPass;
    }
    int getNumPass(){
        return this.numPass;
    }

    // method <display> is being over-ridden
    public String display(){
        
        return ("Vehicle Model : "+this.getModel()+"\n"
        +"Registration Number : "+this.getRegno()+"\n"
        +"Vehicle Speed : "+this.getSpeed()+"\n"
        +"Fuel Capacity : "+this.getFuelcap()+"\n"
        +"Fuel Consumption : "+this.getFuelcons()+"\n"
        +"Number of Passengers : "+this.getNumPass()+"\n");
    }
}
public class Transport{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for truck or Press 0 for bus : ");
        int ch = sc.nextInt();
        sc.nextLine();
        if (ch == 1){
            vehicle newVehicle = new vehicle();
            System.out.println("Vehicle Model : ");
            String model = sc.nextLine();
            System.out.println("Registration number : ");
            String regno = sc.nextLine();
            System.out.println("Vehicle Speed : ");
            int speed = sc.nextInt();
            sc.nextLine();
            System.out.println("Fuel Capacity : ");
            int fuelcap = sc.nextInt();
            sc.nextLine();
            System.out.println("Fuel Consumption : ");
            int fuelcons = sc.nextInt();
            sc.nextLine();
            System.out.println("Cargo Weight Limit : ");
            double cargWeight = sc.nextDouble();
            System.out.println("Distance : ");
            double distance = sc.nextDouble();
            System.out.println("Time : ");
            double time = sc.nextDouble();
            vehicle v1 = new truck(model, regno, speed, fuelcap, fuelcons, cargWeight);
            System.out.println(v1.display());
            System.out.println(v1.fuelNeeded(distance));
            System.out.println(v1.distanceCovered(time));
            
        }
        else if (ch == 0){
            System.out.println("Vehicle Model : ");
            String model = sc.nextLine();
            System.out.println("Registration number : ");
            String regno = sc.nextLine();
            System.out.println("Vehicle Speed : ");
            int speed = sc.nextInt();
            sc.nextLine();
            System.out.println("Fuel Capacity : ");
            int fuelcap = sc.nextInt();
            sc.nextLine();
            System.out.println("Fuel Consumption : ");
            int fuelcons = sc.nextInt();
            sc.nextLine();
            System.out.println("Number of Passengers : ");
            int numPass = sc.nextInt();
            sc.nextLine();
            System.out.println("Distance : ");
            double distance = sc.nextDouble();
            System.out.println("Time : ");
            double time = sc.nextDouble();
            vehicle v2 = new bus(model, regno, speed, fuelcap, fuelcons, numPass);
            System.out.println(v2.display());
            System.out.println(v2.fuelNeeded(distance));
            System.out.println(v2.distanceCovered(time));
        }
        else {
            System.out.println("INVALID CHOICE !");
        }
        

    }
}       
