package Programs;

import java.util.Scanner;

public class ExceptionalHandling {
    public static void main(String[] args) {
    	Scanner n = new Scanner(System.in);
        try {
            System.out.println("Enter any number: ");
            int num1 = n.nextInt();
            System.out.println("Enter another number: ");
            int num2 = n.nextInt();
            System.out.println("Total: "+(num1/num2));
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
