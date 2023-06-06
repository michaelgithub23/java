
package org.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collection {
	
	public static void main(String[] args) {
		
		//create an object for list interface 
		//list -interface arraylist - class
		//pre defined imports
		
		List li = new ArrayList();
		
		li.add(10);
		li.add("java");
		li.add(11.23);
		li.add('m');
		li.add(false);
		li.add(10);
		li.add(null);
		
		//print all the values in list
		System.out.println(li);
		
		//to find the size of the value
	    int size = li.size();
	    System.out.println(size);
	    
	    //object -----super class of all the java classes
	    // to print value by passing the index
	    
	    Object object = li.get(3);
	    System.out.println(object);
	    
	    //to add the value by passing index
	    li.add(2,111);
	    System.out.println(li);
	    //to remove a value by passing index
	    li.remove(7);
	    System.out.println(li);
	    
	    //to replace a value by passing the index
	    
	    li.set(5,"sql");
	    System.out.println(li);
	    
	    
	    
	    //to find the index position of the given value
	    
	    int indexOf = li.indexOf(11.23);
	    System.out.println(indexOf);
	   
	    
	    //to find the last index position of the given value
	    
	   int lastIndexOf = li.lastIndexOf(11.23);
	   System.out.println(lastIndexOf);
	   
	   //to check that given value is present or not
	   boolean contains = li.contains("java");
	   System.out.println(contains);
	   
	   
	   List mi = new LinkedList();
	   mi.add(10);
	   mi.add("sql");
	   mi.add(200);
	   mi.add(134);
	   mi.add(1234);
	   
	   
	   
	  List ni = new Vector();
	  ni.add("sql");
	  ni.add(300);
	  ni.add(134);
	  ni.add(350);
	  ni.add("string");
	  
	  //to compare the list and remove common value
	  
	mi.removeAll(ni);
	System.out.println(mi);
	System.out.println(ni);
	
	
	
	 //to compare two list and retain common value
      
      ni.retainAll(mi);
     System.out.println(ni);
      System.out.println(mi);
      
      
      
	  //to add all the values from one list to another list
      
      List x = new ArrayList();
      x.addAll(li);
      x.addAll(mi);
     System.out.println(x);
      
     
	 //to literate all the values in list using normal for loop
     for (int i = 0; i < li.size(); i++) {
    	 
    	 Object object2 = li.get(i);
    	 System.out.println(object2);
    	 
    }
     
     //to literate all the values in list using enhanced for loop
     
     for (Object z : li) {
    	 
    	 System.out.println(z);
    	 
    	 
    	}
	  
     
     
     
	  
	  
	    
	
		
		
		
		
		
	   
	   
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
