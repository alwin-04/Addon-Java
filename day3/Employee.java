package Day3;

public class Employee {
	public void salary(String job,int salary)
	{
		System.out.println("Your Job "+job);
		System.out.println("Your Salary "+salary);
		
	}
	public void salary(String job,int salary,int workingHour)
	{
		System.out.println("Your Job "+job);
		System.out.println("Your Salary "+salary*workingHour);
	}
	public void salary(String job,int salary,int  workingHour,double bonus)
	{
		System.out.println("Your Job "+job);
		System.out.println("Your Salary "+salary*workingHour*bonus);
	}		

}
 class TestEmployee
 {
	 public static void main(String[] args) {
		
	
	 Employee employee =new Employee();
	 employee.salary("JavaDeveloper", 0);
 }
 }
