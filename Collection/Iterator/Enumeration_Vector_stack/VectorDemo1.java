package JAVA_KeyConcepts.Collection.Iterator.Enumeration_Vector_stack;

import java.util.*;
class Demo1 {

        int x;

        Demo1(int x){
            this.x = x;
        }

        void printData(){
            System.out.println(x);
        }   
}

public class VectorDemo1{
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
