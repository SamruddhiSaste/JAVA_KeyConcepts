package JAVA_KeyConcepts.Collection.List;

import java.util.*;
public class ArrayListMethods extends ArrayList {

    public static void main(String[] args) {
        
        //ArrayList al = new ArrayList();   (not applicable in removeRange method)

        ArrayListMethods al = new ArrayListMethods();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(30);
        al.add(40);
        al.add(50);

        System.out.println(al);

        //indexOf(Object o)
        System.out.println(al.indexOf(30));   //2 (from top)

        //lastIndexOf(Object o)
        System.out.println(al.lastIndexOf(30));  //5

        //trimtosize()
        //System.out.println(al.trimToSize());    as its return value is void so we cant write it in sop
        al.trimToSize();

        // addAll(Collection <? extends E > c)
        ArrayList al1 = new ArrayList();
        al1.add("Kanha");
        al1.add("Kanha");
        al1.add("Kanha");

        al.addAll(al1);
        System.out.println(al);

        //removeRange(int fromIndex,int toIndex)
        //al.removeRange(3,7); //error 
        /* To solve-
         * we should extends our class ArrayList
         * make object of our class instead of ArrayList
         */
        al.removeRange(3,7);
        System.out.println(al);

        //removeAll (Collection <?> c)
        al.removeAll(al1);
        System.out.println(al);
    }
}

