

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapAndHashTable {

    public static void main(String args[]){

        HashMap<String,Integer> hm1=new HashMap<>();
        hm1.put("key1",2);
        hm1.put("key1",null);
        System.out.println(hm1);

        Hashtable<String,Integer> ht1=new Hashtable<>();
        ht1.put("key1",2);
        ht1.put("key1",null);

        System.out.println(ht1);
    }

}

//        HashMap and Hashtable are both implementations of the Map interface in Java, but they have some differences:
//
//        Thread Safety:
//
//        Hashtable is synchronized, which means it is thread-safe. Multiple threads can access a Hashtable concurrently without the need for external synchronization.
//        HashMap is not synchronized by default. If multiple threads access a HashMap concurrently and at least one of the threads modifies the map structurally, it must be synchronized externally (e.g., using Collections.synchronizedMap(new HashMap())) to avoid concurrent modification exceptions. However, it's worth noting that since Java 8, ConcurrentHashMap is often preferred for concurrent use cases.
//        Null Keys and Values:
//
//        Hashtable does not allow null keys or values. Attempting to insert a null key or value will result in a NullPointerException.
//        HashMap allows one null key and any number of null values. It is permissible for a HashMap to have one key with the null value and multiple entries with null values.
//        Iterators:
//
//        The iterators returned by Hashtable and HashMap are fail-fast, meaning they will throw a ConcurrentModificationException if the map is structurally modified at any time after the iterator is created, by any means except through the iterator's own remove() method.
//        Here's an example illustrating the differences between Hashtable and HashMap:

