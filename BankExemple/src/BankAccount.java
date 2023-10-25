public class BankAccount {
    public int numAccount;
    protected String type;
    private String owner;
    private double balance;
    private boolean status;

    public BankAccount(){
        this.balance = 0;
        this.status = false;
    }

    public void openAccount(String type){
       this.setType(type);
       this.setStatus(true);
       if (type.equals("CC")){
           this.setBalance(50);
       } else if (type.equals("CP")) {
           this.setBalance(150);
       }
        System.out.println("Account opened successfully");
    }
    public void closeAccount(){
        if (this.getBalance() > 0 ){
            System.out.println("Account with money");
        } else if (this.getBalance() < 0) {
            System.out.println("Debit account");
        } else {
            this.setStatus(false);
            System.out.println("Account closed successfully");
        }

    }
    public void deposit(double value) {
        if (this.getStatus()) {
            this.setBalance(this.getBalance() + value);
            System.out.println("Deposit made successfully " + this.getOwner());
        } else {
            System.out.println("Impossible to deposit ");
        }
    }
    public void withdraw(double value){
        if (this.getStatus()){
          if (this.getBalance() >= value){
              this.setBalance(this.getBalance() - value);
              System.out.println("Withdrawal made " + this.getOwner());
          }else {
              System.out.println("Insufficient funds");
          }
        } else {
            System.out.println("Impossible to withdraw");
        }
    }
    public void monthlyPayment(){
        double v = 0;
        if (this.getType().equals("CC")){
            v = 12;
        } else if (this.getType().equals("CP")) {
            v = 20;

        } 
        if (this.getStatus()){
            if(this.getBalance() > v){
               this.setBalance(this.getBalance() - v);
                System.out.println("Monthly fee paid successfully");
            }
        }
    }
    public void CurrentState(){
        System.out.println("----------------------------------");
        System.out.println("Account: " + this.getNumAccount());
        System.out.println("Type: " + this.getType());
        System.out.println("Owner " + this.getOwner());
        System.out.println("Balance " + this.getBalance());
        System.out.println("Status " + this.getStatus());
    }

    public void setNumAccount(int numAccount) {
        this.numAccount = numAccount;
    }

    public int getNumAccount() {
        return numAccount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

