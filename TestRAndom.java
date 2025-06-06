package Day2;

import java.util.Scanner;

public class TestRAndom {
 public static void main(String[] args) {
	 Scanner s1 =new  Scanner(System.in);
	 System.out.println("Enter your phone number");
	 long number =s1.nextLong();
	 long num=1234567890;
	long otp= RandomOTP.oTP();
	 if(number==num)
	 {
		 System.out.println(otp);
	 }
	 else
	 {
		 System.out.println("invalid");
	 }
       
	 
}
}
