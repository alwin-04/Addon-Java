package bank;

import java.util.Scanner;

public class TestBank1 {
	public static void main(String[] args) {
		while(true)
		{
		Scanner s1=new Scanner(System.in);
		Bank1 b1=new Bank1();
		System.out.println("Welcome");
		System.out.println("press 1 for withdraw");
		System.out.println("press 2 for deposit");
		System.out.println("press 3 for balance enquiry");
		System.out.println("press 4 for pin change");
		
		int input=s1.nextInt();
		 int result1=0;
		int pin=b1.pin1();
		switch(input)
		{
		case 1:System.out.println("Enter the amount to withdraw:");
			   int withdrawAmt=s1.nextInt();
			   boolean result=b1.withdraw(withdrawAmt);
			   if(result==true)
			   {
				   System.out.println("Withdraw"+ withdrawAmt +" successfully");
			   }
			   else
			   {
				   System.out.println("insuffient balance amount to withdraw:");
				   
			   }
			   break;
		case 2: System.out.println("Enter the amount to Deposite");
			    int depositeAmt=s1.nextInt();
			    result1=b1.deposit(depositeAmt);
			    System.out.println("The Total balance is:"+result1);
			    break;
		case 3:System.out.println(b1.balance);
		      break;
		case 4:  
			System.out.println("Enter the current pin:");
		       int currentPin=s1.nextInt();
		       if(currentPin==pin)
		       {
		    	 System.out.println("Enter the new Password:");
		    	 int newPin=s1.nextInt();
		    	 pin=newPin;
		    	 System.out.println("your Pin has been changed" +pin);
		       }
		       else
		       {
		    	   System.out.println("Enter the Correct Passward:");
		    	   
		       }  
		
		}
		System.out.println("press 1 for continue or 2 for exit:");
		int val=s1.nextInt();
		if(val==1)
		{
			continue;
		}
		else
		{
			System.out.println("Thank you vist again🙏:");
			break;
			
		}
	}
  }				
}


