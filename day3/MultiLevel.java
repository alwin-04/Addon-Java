package Day3;

public class MultiLevel {
	public void grandFather()
	{
		System.out.println();
	}
	

}
class SubClass1 extends MultiLevel
{
	public void father()
	{
		System.out.println();
	}
	
	
}
class SubClass2 extends SubClass1 
{
	public void son()
	{
		System.out.println();
	}
	
}
 
