package com.syntax.class24;

public class CreditCard {
double balance, interest;
	
    public CreditCard(double balance){
        this.balance = balance;
    }
    
    protected double dailyInterest(){
        if(balance > 0){
            balance = balance * ((interest / 365) / 100);
            return balance;
        }else{
            return 0;
        }
    }
}
class Visa extends CreditCard{
    
	public Visa(double balance){
        super(balance);
    }
    
    @Override
     protected double dailyInterest(){
        if(balance > 0){
            balance = balance * 0.0076;
            return balance;
        }else{
            return 0;
        }
    }
}

class AX extends CreditCard{
	
    public AX(double balance){
        super(balance);
    }
    
}