import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAndLinkedList {

        public static void main(String[] args) {
            // Creating an ArrayList
            List<String> arrayList = new ArrayList<>();

            // Adding elements to the ArrayList
            arrayList.add("Apple");
            arrayList.add("Banana");
            arrayList.add("Orange");

            // Accessing elements by index
            System.out.println("Element at index 0: " + arrayList.get(0)); // Output: Apple

            // Iterating over the ArrayList using enhanced for-loop
            System.out.println("Iterating over the ArrayList:");
            for (String fruit : arrayList) {
                System.out.println(fruit);
            }
            List<String> linkedList = new LinkedList<>();

            // Adding elements to the LinkedList
            linkedList.add("Apple");
            linkedList.add("Banana");
            linkedList.add("Orange");

            // Accessing elements by index
            System.out.println("Element at index 1: " + linkedList.get(1)); // Output: Banana

            // Iterating over the LinkedList using enhanced for-loop
            System.out.println("Iterating over the LinkedList:");
            for (String fruit : linkedList) {
                System.out.println(fruit);
            }
        }

}




//    In both examples:
//
//        We create instances of ArrayList and LinkedList using the List interface.
//        We add elements to the lists using the add() method.
//        We access elements by index using the get() method.
//        We iterate over the lists using an enhanced for-loop.
//        ArrayList and LinkedList provide similar functionality for storing and accessing elements, but they have different performance characteristics for various operations. ArrayList provides fast random access, while LinkedList provides fast insertion and deletion at both ends of the list. Choose the appropriate implementation based on your specific requirements and performance considerations.