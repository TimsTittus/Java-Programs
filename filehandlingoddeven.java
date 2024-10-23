import java.io.*;
import java.util.*;

public class file {
    public static void main(String[] args) {
        try {
            // Taking input from the user and writing to numbers.txt
            FileWriter writer = new FileWriter("numbers.txt");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter numbers separated by spaces:");
            String numbers = sc.nextLine();
            writer.write(numbers);
            writer.close();

            // Reading numbers from numbers.txt
            FileReader reader = new FileReader("numbers.txt");
            Scanner fileScanner = new Scanner(reader);

            // Writing even and odd numbers to respective files
            FileWriter evenWriter = new FileWriter("even.txt");
            FileWriter oddWriter = new FileWriter("odd.txt");

            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                if (num % 2 == 0) {
                    evenWriter.write(num + " ");
                } else {
                    oddWriter.write(num + " ");
                }
            }

            evenWriter.close();
            oddWriter.close();
            reader.close();

            System.out.println("Operation completed successfully!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}