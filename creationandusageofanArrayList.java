import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of String type
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Displaying the elements in the ArrayList
        System.out.println("Fruits in the ArrayList: " + fruits);

        // Accessing an element from the ArrayList
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // Modifying an element in the ArrayList
        fruits.set(1, "Blueberry");
        System.out.println("Fruits after modification: " + fruits);

        // Removing an element from the ArrayList
        fruits.remove("Mango");
        System.out.println("Fruits after removal: " + fruits);

        // Checking the size of the ArrayList
        System.out.println("Total number of fruits: " + fruits.size());
    }
}
