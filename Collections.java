import java.util.*;

public class Collections {
    public static void main(String[] args) {

        // ========== 1. ArrayList ==========
        System.out.println("----- ArrayList Example -----");

        ArrayList<String> list = new ArrayList<>();

        // Add 10 elements
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");

        // Add one more element
        list.add("Eleven");

        // Iterate using Iterator
        System.out.println("Iterating ArrayList:");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Add at specific index
        list.add(2, "Hello");

        // Remove element by value
        list.remove("Five");

        // Remove element at index
        list.remove(4);

        // Update element at index
        list.set(0, "UpdatedOne");

        // Get element at index
        System.out.println("Element at index 3: " + list.get(3));

        // Check if contains element
        System.out.println("Contains 'Six'? " + list.contains("Six"));

        // Get size
        System.out.println("Size of ArrayList: " + list.size());

        // Clear all elements
        list.clear();
        System.out.println("ArrayList after clearing: " + list);


        // ========== 2. HashMap ==========
        System.out.println("\n----- HashMap Example -----");

        HashMap<Integer, String> map = new HashMap<>();

        // Add 10 entries
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Charlie");
        map.put(4, "David");
        map.put(5, "Eva");
        map.put(6, "Frank");
        map.put(7, "Grace");
        map.put(8, "Henry");
        map.put(9, "Ivy");
        map.put(10, "Jack");

        // Insert one more entry
        map.put(11, "Harsha");

        // Get value by key
        System.out.println("Value at key 3: " + map.get(3));

        // Clone the map
        HashMap<Integer, String> copyMap = new HashMap<>(map);
        System.out.println("Copied Map: " + copyMap);

        // Check if key exists
        System.out.println("Contains key 5? " + map.containsKey(5));

        // Check if value exists
        System.out.println("Contains value 'Grace'? " + map.containsValue("Grace"));

        // Check if map is empty
        System.out.println("Is map empty? " + map.isEmpty());

        // Get map size
        System.out.println("Size of map: " + map.size());

        // Print all keys
        System.out.println("Keys: " + map.keySet());

        // Print all values
        System.out.println("Values: " + map.values());

        // Remove an entry
        map.remove(2);
        System.out.println("Map after removing key 2: " + map);

        // Copy all entries to another map
        HashMap<Integer, String> anotherMap = new HashMap<>();
        anotherMap.putAll(map);
        System.out.println("Another copied map: " + anotherMap);


        // ========== 3. HashSet ==========
        System.out.println("\n----- HashSet Example -----");

        HashSet<String> set = new HashSet<>();

        // Add 10 elements
        set.add("Red");
        set.add("Green");
        set.add("Blue");
        set.add("Yellow");
        set.add("Pink");
        set.add("Purple");
        set.add("Black");
        set.add("White");
        set.add("Gray");
        set.add("Orange");

        // Add one more
        set.add("Brown");

        // Print set
        System.out.println("HashSet elements: " + set);

        // Remove element
        set.remove("Black");

        // Check if contains
        System.out.println("Contains 'Green'? " + set.contains("Green"));

        // Size
        System.out.println("Size of set: " + set.size());

        // Iterate set
        System.out.println("Iterating set:");
        for (String color : set) {
            System.out.println(color);
        }

        // Clear set
        set.clear();
        System.out.println("Set after clearing: " + set);
    }
}
