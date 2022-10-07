package Oops;

import java.util.LinkedList;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating object of the
        // class linked list
        LinkedList<String> ll = new LinkedList<String>();
 
        // Adding elements to the linked list
        ll.add("Sachin");
        ll.add("Ranjitha");
        ll.addLast("Arun");
        ll.addFirst("Ramesh");
        ll.add(2, "Harish");
         
        System.out.println(ll);
 
        ll.remove("Ranjitha");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();
 
        System.out.println(ll);
    }
}
	


