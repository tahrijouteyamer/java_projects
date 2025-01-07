// Mapping
import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        
        System.out.println(ageMap); // {Alice=30, Bob=25}
        
        System.out.println("Alice's age: " + ageMap.get("Alice")); // Alice's age: 30
    }
}
