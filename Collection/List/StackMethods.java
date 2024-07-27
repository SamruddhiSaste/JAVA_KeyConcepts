package JAVA_KeyConcepts.Collection.List;

import java.util.*;
public class StackMethods {
    public static void main(String[] args) {
        
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println(s);

        //peek()
        System.out.println(s.peek());  
        System.out.println(s);

        //pop
        System.out.println(s.pop());
        System.out.println(s);

        // push (object element )

        //search(object element)
        /*
         *      |            |
         *      |____________|
         *      |____30______| 1     the numbers in stack given like this
         *      |____20______| 2
         *      |____10______| 3
         */
        System.out.println(s.search(30));
        System.out.println(s.search(20));
        
    }
}

