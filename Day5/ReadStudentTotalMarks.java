package constructor;

import java.io.*;

public class ReadStudentTotalMarks {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\alwin\\OneDrive\\Desktop\\students.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;

            System.out.println("Student Name\tTotal Marks");
            System.out.println("-----------------------------");

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                int total = 0;

                for (int i = 1; i < parts.length; i++) {
                    total += Integer.parseInt(parts[i]);
                }

                System.out.println(name + "\t\t" + total);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
