package Set;

import java.util.ArrayList;
import java.util.HashSet;

/*
* The set interface and its methods.
* The HashSet class and its methods.
* The difference between an ArrayList and a HashSet.
* How to automatically sort a list in JAVA.
*/
public class HashSetDemo {
    public static void main(String[] args) {

        // An ArrayList of names (String)
        ArrayList <String> namesList = new ArrayList<>();
        System.out.println("ArrayList has " + namesList.size() + " size.");
        namesList.add("Aryan");
        namesList.add("Divyansh");
        namesList.add("Dheeraj");
        namesList.add("Dheeraj");
        namesList.add("Garvit");
        System.out.println("ArrayList has " + namesList.size() + " size.");
        System.out.println(namesList);

        // A HashSet of names (String)
        HashSet <String> namesSet = new HashSet<>();
        System.out.println("HashSet has " + namesSet.size() + " size.");
        namesSet.add("Divyansh");
        namesSet.add("Dhawan");
        namesSet.add("Dheeraj");
        namesSet.add("Dheeraj");
        namesSet.add("Garvit");
        System.out.println("HashSet has " + namesSet.size() + " size.");
        System.out.println(namesSet);

        /*
        * From this we can say that HashSet is also a dynamic data Structure
        or collection because the size HashSet is not static or fixed it can
        grow increase or shrink.
        * The order of storage of elements inside a HashSet is arbitrary or
        random we cannot predict the exact location of element inside a HashSet
        * The HashSet does not allow to store duplicate values or elements inside it.
        If we add duplicate element or value will be given to the HashSet then the
        HashSet will compare the element with all the elements inside it already. If
        it finds a match i.e., element that we are trying to add is already present
        inside a HashSet. The HashSet will completely ignore it.
        */
    }
}