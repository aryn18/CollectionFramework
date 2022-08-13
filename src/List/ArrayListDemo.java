package List;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        /*
        * The List <E> Interface <- The ArrayList<E> class.
        * The ArrayList <E> Class behaves like an array at first.
        * But, it overcomes the disadvantage of an array.
        * An array is static! i.e. once the size of an array is defined, it cannot change grow or shrink!
        *  But, an ArrayList can grow or shrink as needed. */

        //an arraylist of integers
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(34);
        list.add(4);

        System.out.println(list);
        list.remove(1);
        System.out.println(list);

        ArrayList<Friend> friends = new ArrayList<>();
        Friend friend = new Friend("Aryan", 112233345566L);
        Friend friend1 = new Friend("Ary", 1234567890222L);
        friends.add(friend);
        friends.add(friend1);
    }
}

class Friend{
    private String name;
    private long contactNumber;

    public Friend(String name, long contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }
}