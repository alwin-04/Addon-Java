package constructor;

import java.util.Scanner;

public class TestSimpleInterest {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the principal value:");
		int p=s1.nextInt();
		System.out.println("Enter the Interest Rate value:");
		int r=s1.nextInt();
		System.out.println("enter the time of years value:");
		int t=s1.nextInt();
		Simple_Intrest simpleInterest=new Simple_Intrest();
		int ans=simpleInterest.sI(p, r, t);
		System.out.println("the Simple Interst is "+ans);
		
	}

}
