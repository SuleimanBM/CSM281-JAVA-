public class Account {
    public String owner;
    public double balance;

    Account(String Owner, double balance){
        this.owner = Owner;
        this.balance = balance;
    }
    Account(){
        this.owner = "zzzzz";
        this.balance = 0.00;
    }

    public String deposit(double amount){
        this.balance += amount;
        return ("Your account has been credited with: "+amount+"\nAvailable balance: "+ this.balance);
    }
    public String withdraw(double amount){
        if(this.balance >= amount){
            this.balance -= amount;
            return("Your account has been debited with: "+amount+"\nAvailable balance: "+ this.balance);
        }else{
           return("Your balance is insufficient!");
        }
        
    }
}
