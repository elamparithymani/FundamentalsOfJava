package basics.collections.list;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class AccessingListElements {
    public static void main(String[] args) {
        // Creating object of List and declaring String type
        List<String> list = new ArrayList<String>();
        // Adding elements to List using add() method, Custom input elements
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        // Accessing elements using get() method
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("Element at index 4: " + list.get(4));
        BitSet
        for (String s : list) {
            System.out.println(s);
        }
    }
}
