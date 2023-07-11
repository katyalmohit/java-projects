import java.util.Date;
class Account{
    private int ID;
    private double balance;
    
    //The static variable can be used to refer to the common property of all objects
    //thats why Annual Interest Rate is declared static
    private static double AnnualInterestRate=7.5;

    // we cannot change the value of final variable    
    private final Date DateCreated;

    //default constructor with no arguments
    Account(){  
        this.ID=0;
        this.balance=0; 
        this.DateCreated=new Date(); 
    }

    //parametrized constructor
    Account(int ID,double balance){
        this.ID=ID;
        this.balance=balance;
        this.DateCreated=new Date(); 
    }

    //Accessor : used to get the value of a private variable
    int getID(){
        System.out.println("ID: "+this.ID);
        return this.ID;
    }
    double getBalance(){
        System.out.println("Balance: " +this.balance);
        return this.balance;
    }
    static double getAnnualInterestRate(){
        System.out.println("Annual Interest Rate: "+AnnualInterestRate);
        return AnnualInterestRate;
    }

    Date getDateCreated(){
        System.out.println("Account Created on Date : " + this.DateCreated);
        return this.DateCreated;
    }

    double getMonthlyInterestRate(){
        System.out.println("Monthly Interest Rate : "+AnnualInterestRate/12);
        return AnnualInterestRate/12;
    }
    double getMonthlyInterest(){
        System.out.println("Monthly Interest : "+((balance*(AnnualInterestRate/12))/100));
        return ((balance*(AnnualInterestRate/12))/100);
    }

    //Mutators : used to set the value of a private variable    
    void setID(int ID){
        this.ID = ID;
    }
    void setBalance(double balance){
        this.balance = balance;
    }
    static void setAnnualInterestRate(double AnnualInterestRate){
        Account.AnnualInterestRate = AnnualInterestRate;
    }

    //method named withdrawal, it takes String array as an argument.
    void withdrawal(String args[]) {
        //checks if the of args is 0 or something else
        if(args.length==0){
          System.out.println("Withdrawal money is not specified");
        }
        else{
        try{
            //If the args array is not empty, the method attempts to parse 
            //the first element of the args array as a double value 
            //representing the withdrawal amount.
          double Amount = Double.parseDouble(args[0]);
          if (Amount <= this.balance) {
              this.balance -= Amount;
              System.out.println("Rs. "+Amount + " withdrawn from the account. New Balance: ="+this.balance);
          } else {
              System.out.println("Insufficient Balance");
          }
         }
         catch (Exception e) {
              System.out.println("Enter a valid Withdrawal amount !");
         }
      }
    }

    //method named deposit, it also takes String array as an argument.
    void deposit(String args[]) {

        if(args.length<1){
            System.out.println("Deposit money is not specified");
          }
        else{
        try{
            double amount = Double.parseDouble(args[1]);
            System.out.println(amount);
            this.balance += amount;
            System.out.println("Deposit successful. New balance : " + this.balance);
        }
        catch (Exception e) {
            System.out.println("Input a valid deposition amount");
        }
        }       
    }

    public class InnerClass {
        private String message;
        InnerClass(String Message) { 
        this.message = Message;
        }
        String getMessage() { 
        return this.message;
        }
    }
}

public class Bank{
    public static void main(String[] args) {
        Account acc=new Account(); 
        acc.setID(1);
        acc.setBalance(30000);
        acc.getID();
        acc.getBalance();
        acc.getDateCreated();
        Account.getAnnualInterestRate();
        acc.getMonthlyInterestRate();
        acc.getMonthlyInterest();

        acc.withdrawal(args);
        acc.deposit(args);

        Account.InnerClass inner = acc.new InnerClass("Thank You"); 
        System.out.println(inner.getMessage());
    }
}