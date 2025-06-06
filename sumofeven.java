package project;

public class sumofeven {

	public static void main(String[] args) {
		 
		        int[] number = {1, 2, 3, 4, 5};
		        int sum = 0;

		        for (int i = 0; i < number.length-1; i++) {
		            System.out.println(number[i]);
		            if (number[i] % 2 == 0) { 
		            	
		                sum += number[i];
		            }
		        }

		
		        System.out.println("Sum of even numbers: " + sum);
		    }
		}

