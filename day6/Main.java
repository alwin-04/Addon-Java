package Day6;

public class Main extends Thread {
	private String name;
	public Main(String name)
	{
		this.name=name;
	}
public void run()
{
	for(int i=1;i<=5;i++)
	{
		System.out.println(name);
	}try
	{
		Thread.sleep(500);
	}
	catch(Exception e)
	{
		System.out.println();
	}
 }
}
