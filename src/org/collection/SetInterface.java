package org.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class SetInterface {
	

	public static void main(String[] args) {
		
		Set S = new TreeSet();
		
		S.add(10);
		S.add(5);
		S.add(12);
		S.add(22);
		S.add(9);
		
		//To print all the values in set
		
		System.out.println(S);
		
		//to get size of the set
		
	    int size = S.size();
	    System.out.println(size);
	    //to check that the given  value in present or not
	    
	    boolean contains = S.contains(22);
	    System.out.println(contains);
	    
	    //to remove a value in set
	     S.remove(9);
		System.out.println(S);
		
		//using enhanced loop for iteration
		
		for (Object object : S) {
			
			System.out.println(object);
			
			
		}
		
        List li = new ArrayList();
        
    	li.add(5);
		li.add(88);
		li.add(65);
		li.add(12);
		li.add(21);
		li.add(9);
	
		
		System.out.println(li);
		// to add all the value form set from list
		
//		List li1 = new ArrayList();
//		li.addAll(S);
//		System.out.println(li);
		
		
//		S.removeAll(li);
//		System.out.println(S);
//		
		S.retainAll(li);
		System.out.println(S);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
