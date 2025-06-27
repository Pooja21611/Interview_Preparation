import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");  
        System.out.println("List: " + fruits);

        Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Red");  
        System.out.println("Set: " + colors);

        Map<Integer, String> students = new HashMap<>();
        students.put(1, "John");
        students.put(2, "Alice");
        students.put(1, "Bob");  
        System.out.println("Map: " + students);

        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        System.out.println("Students:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
