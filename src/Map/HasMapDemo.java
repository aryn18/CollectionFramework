package Map;
/*
* The Map Interface and its methods.
* The HashMap class and its methods.
* How is the HashMap class different from the Arraylist class and the HashSet class.
*/

import java.util.*;

/*
* The map interface also a generic interface, but we can see that
unlike the list interface and set interface  the map interface has
two type parameters the k for key and v for value. Also, we can see that is not child
of the collection interface like the list and set interface. But, we still count the
map interface as a part of the collection framework in java.
*/
public class HasMapDemo {
    public static void main(String[] args) {
        // The HashMap is created when, we want to associate two values together
        // A key and value "PAIR".
        // Example: The Roll number of a student, and we want to store the marks of the same student
        // Roll numbers as key and marks as values
        // Roll number  stored as Integer and marks stored as double
        // (Key, Value):(Roll number, Marks)
        HashMap<Integer, Double> hashMap = new HashMap<>();

        //HashMap<Key    , Value>
        //HashMap<Wrapper, Wrapper>
        //HashMap<Wrapper, Wrapper>
        //HashMap<Wrapper, Pre-Defined Class>
        //HashMap<Pre-Defined Class, Wrapper>
        //HashMap<Pre-Defined Class, Pre-Defined Class>
        //HashMap<Wrapper, Custom-Defined Class>
        //HashMap<Custom-Defined Class, Wrapper>
        //HashMap<Custom-Defined Class, Pre-Defined Class>
        //HashMap<Pre-Defined Class, Custom-Defined Class>
        //HashMap<Custom-Defined Class, Custom-Defined Class>
        //HashMap<Wrapper/Pre-Defined/Custom, HashMap<K, V>>

        // to add an element to the map, we use the put() method, and the element is called an "entry".

        hashMap.put(1,23.4);
        hashMap.put(2,14.5);
        hashMap.put(3,34.6);
        hashMap.put(4,56.3);
        hashMap.put(5,70.0);
        hashMap.put(6,02.5);
        hashMap.put(6,02.5);

        System.out.println(" The size of the hashMap: " + hashMap.size());
        System.out.println(hashMap);

        hashMap.remove(4);
        System.out.println(hashMap);
        System.out.println("Marks of Roll number 2 are: " + hashMap.get(2));

        /* ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (Integer integer: list) {

        }
        for (Integer integer: set) {

        }*/

        // 1. Store all entries of the map in a set.
        Set<Map.Entry<Integer, Double>> entries = hashMap.entrySet(); // ctrl + shift + p
        // 2. Create an iterator on the set of all entries
        Iterator<Map.Entry<Integer, Double>> iterator = entries.iterator();

        // while the iterator can find a next element entry inside the hashmap
        while(iterator.hasNext()){
            var singleEntry = iterator.next();
            if(singleEntry != null){
                System.out.println(singleEntry.getValue());
            }
        }
    }
}
