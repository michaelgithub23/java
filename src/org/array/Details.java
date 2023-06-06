package org.array;

import java.util.function.LongBinaryOperator;

public class Details {
	
	public static void main(String[] args) {
		
	//	 array systex
		int a[] = new int[5];
		
//left side  index right value
		a[0] = 10;
		a[1] =20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		a[2] =100;
		
		//to print particular value in array
		System.out.println(a[2]);
		
		//find the length of given array
		int length = a.length;
		System.out.println(length);
		
		
		//to ilerate all the values in array using normal for loop
		
		for  (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		
		//to ilerate all the values in array using enhanced for loop
		//jdk 1.5 version
		
		
		 for (int x : a) {
			System.out.println(x);
			
			
		}
		
		
		
		
		
	}
	
	
	
	

}
