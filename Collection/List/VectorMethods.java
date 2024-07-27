package JAVA_KeyConcepts.Collection.List;


import java.util.*;
public class VectorMethods {
    public static void main(String[] args) {

        Vector v = new Vector<>();
        v.addElement(10);    // vector method
        v.add(20);             // method inherited from list
        v.add(30);
        v.add(40);
 
        /* 
        v.add(40);
        v.add(40);              after removing comment the capacity will change
        v.add(40);
        v.add(40);              internally capacity = currentcapacity * 2
        v.add(40);
        v.add(40);
        v.add(40);
        v.add(40);
        */

        System.out.println(v);
        System.out.println(v.capacity());
        
    }
}
