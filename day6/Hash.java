package Day6;

import java.util.*;

public class Hash {
	public static void main(String[] args) {
		
	HashMap<String,Integer> val =new HashMap();
	val.put("Alwin", 100);
	val.put("Joel", 69);
	val.put("Pongal", 50);
	int totalMarks=0;
	for (int marks:val.values())
	{
		totalMarks +=marks;
	}
	for(Map.Entry<String, Integer> entry:val.entrySet())
	{
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
	System.out.println("Total Marks: "+totalMarks);
	double average=totalMarks/val.size();
	System.out.println("Average Value: "+average);
	}
}
