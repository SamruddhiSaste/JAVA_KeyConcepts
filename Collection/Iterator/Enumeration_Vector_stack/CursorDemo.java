package JAVA_KeyConcepts.Collection.Iterator.Enumeration_Vector_stack;

import java.util.*;

public class CursorDemo {
    public static void main(String[] args) {
        
        Vector v = new Vector();

        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        v.addElement(50);
        v.addElement(60);

        System.out.println(v);

        Enumeration cursor = v.elements();

        //System.out.println(cursor.nextElement());

        while(cursor.hasMoreElements()){
            System.out.println(cursor.nextElement());
        }

    }
}
