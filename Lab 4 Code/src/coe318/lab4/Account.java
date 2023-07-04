package coe318.lab4;

class Account {
   
    private String name; 
    private int number;
    private double initialBalance; 
   
    public Account(String name, int number, double initialBalance){
        this.name = name;
        this.number = number;
        this.initialBalance = initialBalance; 
    }

    public String getName(){
        return this.name;
    }
    
    public int getNumber(){
        return this.number;
    }

    public double getBalance(){
        return this.initialBalance;
    }

    public boolean withdraw(double amount){
        if ((amount > 0) && (amount <= this.initialBalance)){
            this.initialBalance -= amount;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean deposit(double amount){
        if (amount > 0 ){
            this.initialBalance += amount;
            return true;
        }
        else {
            return false; 
        }
    }
   
    @Override

    public String toString(){
        return "(" + getName() + ", " + getNumber() + ", " + String.format("$%.2f", getBalance()) + ")";
    }
}