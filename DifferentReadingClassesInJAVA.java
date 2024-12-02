//Different reading classes in JAVA

//Using Scanner class

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read a whole line

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read an integer

        System.out.print("Enter your height: ");
        double height = scanner.nextDouble(); // Read a double

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);

        scanner.close(); // Close the scanner to release resources
    }
}

//Using BufferedReader and InputStreamReader

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = reader.readLine(); // Read a whole line of input

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(reader.readLine()); // Convert string input to integer

        System.out.print("Enter your height: ");
        double height = Double.parseDouble(reader.readLine()); // Convert string input to double

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }
}


//Using Console Class

import java.io.Console;

public class ConsoleExample {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.out.println("No console available");
            return;
        }

        String name = console.readLine("Enter your name: "); // Read a line of input
        String ageStr = console.readLine("Enter your age: ");
        int age = Integer.parseInt(ageStr); // Convert to integer

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


//Using DataInputStream

import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamExample {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);

        System.out.print("Enter your name: ");
        String name = dis.readLine(); // Deprecated but still works

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(dis.readLine()); // Convert string input to integer

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


//Using System.in with read()

import java.io.IOException;

public class SystemInExample {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter a character: ");
        int input = System.in.read(); // Read a single byte/character

        System.out.println("You entered: " + (char) input);
    }
}