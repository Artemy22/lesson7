/*
3. Create Map vehicles : vehicles.put("BMW", 5);, print
 */

import java.util.HashMap;
import java.util.Map;

public class Lesson73 {
    public static void main(String[] args) {

        Map<String, Integer> vehicles = new HashMap<String, Integer>();

        vehicles.put("BMW", 5);
        vehicles.put("Bogdan", 13);
        vehicles.forEach((k, v) -> {
            System.out.println("Key: " + k + " Value: " + v);
        });
    }
}