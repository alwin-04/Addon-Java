package constructor;

import java.util.*;

public class NumberArray {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the Number of Elements");
		int getNum=s1.nextInt();
		ArrayList<Integer> n1 =new ArrayList<>();
		System.out.println("Enter "+getNum+" numbers");
		
		for(int i=0;i<getNum;i++)
		{
			int val=s1.nextInt();
			n1.add(val);
		}
		for(int i=n1.size()-1;i>=0;i--)
		{
			System.out.print(n1.get(i)+" ");
		}
	
			
		
	}

}
