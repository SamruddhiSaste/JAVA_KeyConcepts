package JAVA_KeyConcepts.Collection.List;

import java.util.*;
public class ListMethods{
    
    public static void main(String[] args) {
        
        List al = new ArrayList();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add("Sam");         // hetrogeneous data is allowed
        al.add("Ram");
        al.add(30.5);

        System.out.println(al);

        // add (int index , E element)
        al.add(4,"Sita");    // No Replace 
        al.add(6,"End");
        System.out.println(al);

        // contains (Object o)
        System.out.println(al.contains(50));   //false    return value boolean 
        System.out.println(al.contains("Sam")); //true    

        // get (int index)
        System.out.println(al.get(5));

        //isEmpty()
        System.out.println(al.isEmpty());    //checks if list is empty or not

        //remove(int index)
        System.out.println(al.remove(6));  // element/object is return value for remove
        System.out.println(al);

        // remove(Object o)
        System.out.println(al.remove("Sam"));
        System.out.println(al);

        //set (int index, E element)
        al.set(5, "replace 30.5");   //Replace
        System.out.println(al);

        //size()
        System.out.println(al.size());

        //clear()
        al.clear();
        System.out.println(al);


        //Ensurecapacity(int)
        /*
         * we can increase capacity at runtime using this method if we are using ArrayList()
         * if we are using ArrayList(int) then we have alredy given capacity
         */

        //trimtosize(int)
        /*
         * This method is used to decrease the size
         * 
         */ 
    }
}
