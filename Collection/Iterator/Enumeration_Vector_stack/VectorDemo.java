package JAVA_KeyConcepts.Collection.Iterator.Enumeration_Vector_stack;


import java.util.*;

class Demo{
    int x;
    Demo(int x){
        this.x=x;
    }
    int printData(){
        return x;
    }
    /*override toString() printData() return value is int and toString return value
     * value is String so Type mismatch: cannot convert from int to String
     */
    public String toString(){
        return printData()+" ";
    }

    /* This Userdefined Demo class , when we try to print we get address of object because
     * this userdefined class doesnt override object class tostring method every predefined class
     * override object class toString() so that instead of address it will give you actual data
      */


    // void printData(){
    //     System.out.println(x);
    // }

    
}

public class VectorDemo {
    public static void main(String[] args){
        Vector<Demo> v = new Vector<Demo>();

        v.addElement(new Demo(10));
        v.addElement(new Demo(20));
        v.addElement(new Demo(30));
        v.addElement(new Demo(40));
        v.addElement(new Demo(50));

        System.out.println(v);

    }
    
}