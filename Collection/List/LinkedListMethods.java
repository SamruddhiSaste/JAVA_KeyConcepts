package JAVA_KeyConcepts.Collection.List;

import java.util.*;
public class LinkedListMethods {

    public static void main(String[] args) {
        
        LinkedList ll = new LinkedList();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add("Lakhan");

        System.out.println(ll);

        // addFirst(E e)
        ll.addFirst(5);
        System.out.println(ll);

        //addLast(E e)
        ll.addLast(50);
        System.out.println(ll);

        //Offer(Object o)
        //return value - boolean,add object in List
        System.out.println(ll.offer("Sam"));
        System.out.println(ll.offerFirst("Shubhangi"));
        System.out.println(ll.offerLast("Ram"));
        //System.out.println(ll.offer("Lakhan"));
        System.out.println(ll);
 
        //Contains
        System.out.println(ll.contains("Sahlini"));  // return value bollean
       
        //size return_value: int
        System.out.println(ll.size());

        //peek only return object ,not remove from list
        System.out.println(ll.peek());
        System.out.println(ll);
        System.out.println(ll.peekLast());

        //poll return and remove object 
        System.out.println(ll.poll());
        System.out.println(ll);
        System.out.println(ll.pollLast());
        System.out.println(ll);

        //push add element at first
        ll.push("Shalini");
        System.out.println(ll);

        //pop remove first element 
        ll.pop();
        System.out.println(ll);


        // remove elements first occurance 
        //(if the same element is present number of times in list so that numbers first occurance get removed)
        System.out.println(ll.removeFirstOccurrence(10));
        System.out.println(ll);

    }
    
}
