package constructor;

import java.util.Scanner;

public class TestCalc {
				
	public static void main(String[] args)
	{
		while(true)
		{
		Scanner s1=new Scanner(System.in);
		int ans;
		int n1=0;
		int n2=0;
		System.out.println("Press 1 to addition:");
		System.out.println("press 2 to Subtration:");
		System.out.println("Press 3 to Multiplication:");
		System.out.println("Press 4 to Division:");
		System.out.println("Enter a value:");
		int num=s1.nextInt();
		Calculator2 b1=new Calculator2();
		if(num>0||num<5)
		{
			System.out.println("Enter the first Number:");
			n1=s1.nextInt();
			System.out.println("Enter the Second Number:");
			n2=s1.nextInt();
		}
		else
		{
			num=0;		
		}
		switch(num)
		{
		case 1:ans=b1.add1(n1, n2);
			   System.out.println(ans);
			   break;
		case 2:ans=b1.sub1(n1, n2);
			   System.out.println(ans);
			   break;
		case 3:ans=b1.mul1(n1, n2);
			   System.out.println(ans);
			   break;
		case 4:ans=b1.div1(n1, n2);
			   System.out.println(ans);
			   break;
		default:System.out.println("Enter a valid Number:");	   
			 			
		}
		System.out.println("Enter 1 to Continue Or 2 to exit:");
		int input=s1.nextInt();
		if(input==1)
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
