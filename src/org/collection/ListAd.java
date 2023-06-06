package org.collection;

import java.util.ArrayList;
import java.util.List;

public class ListAd {

	public static void main(String[] args) {
		
		
		List<Integer>li = new ArrayList();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(10);
		li.add(15);
		li.add(40);
		li.add(55);
		
		System.out.println(li);
		
		List<Integer>evenNum = new ArrayList();
		List<Integer>oddNum = new ArrayList();
		
		for (int i = 0; i < li.size(); i++) {
			
			int number = li.get(i);
			if (number%2==0) {
				evenNum.add(number);
				}
			else {
				oddNum.add(number);
				
			}
			}
		System.out.println("Even Numbers");
		
		for (int i = 0; i < evenNum.size(); i++) {
			
			System.out.println(evenNum.get(i));
			
		}
		
		System.out.println("odd numbers");
	    
		for (int i = 0; i < oddNum.size(); i++) {
			
		System.out.println(oddNum.get(i));
		
		}
		
		
		
		
		
		
	}

}
