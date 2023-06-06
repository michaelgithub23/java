package org.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetMethods {
	
	public static void main(String[] args) {
		
		
		Set s = new TreeSet();
		
		s.add("leo");
		s.add("sam");
		s.add("raj");
		s.add("100");
		s.add("dency");
		s.add("aravindh");
		s.add("kim");
		
		System.out.println(s);
		
		//to get the size of the value
		
		int size = s.size();
		System.out.println(size);
		
		boolean contains = s.contains("aravindh");
		System.out.println(contains);
		
		boolean remove = s.remove("sam");
		System.out.println(remove);
		System.out.println(s);
		
		for (Object object : s) {
			
			System.out.println(object);
			
		}
		
		
		List l = new ArrayList();
		l.add("Ram");
		l.add("kim");
		l.add("javith");
		l.add("aravindh");
	
		
		System.out.println(l);
		
		
		//to add all the values
		s.addAll(l);
		System.out.println(s);
		
		s.removeAll(l);
		System.out.println(s);
		
		s.retainAll(l);
		System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
