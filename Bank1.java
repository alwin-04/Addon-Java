package bank;

public class Bank1 {
 int balance=1000;
 int pin=2005;
 public boolean withdraw(int withdrawamnt)
 {
	 if(withdrawamnt<=balance)
	 {
		 balance=balance-withdrawamnt;
		 return true;
	 }
	 else
	 {
		 return false;
	 }
 }
 public int deposit(int depositamount)
 {
	 balance+=depositamount;
	 return balance;
 }
 public int balanceEnquiry()
 {
	 return balance;
 }
 public int pin1() {
	 return pin;
 }
 
}
