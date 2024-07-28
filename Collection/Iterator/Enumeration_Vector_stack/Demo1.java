package JAVA_KeyConcepts.Collection.Iterator.Enumeration_Vector_stack;

import java.util.*;
public class Demo1 {

        int x;

        Demo1(int x){
            this.x = x;
        }

        void printData(){
            System.out.println(x);
        }   
}

class VectorDemo{
    public static void main(String[] args) {

        Vector v = new Vector();
        v.addElement(new Demo1(10));
        v.addElement(new Demo1(20));
        v.addElement(new Demo1(30));
        v.addElement(new Demo1(40));
        v.addElement(new Demo1(50));

        System.out.println(v);
        
    }
}
