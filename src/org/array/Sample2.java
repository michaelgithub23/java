package org.array;

//2D array
public class Sample2 {
	public static void main(String[] args) {
// DataType variableName[][]=new DataType[size][size]();
		
	int a[][] = new int[2][2];
	
	a[0][0] = 10;
	a[0][1] = 20;
	a[1][0] = 30;
	a[1][1] = 40;
	
	System.out.println(a[0][0]);
	
	int length = a.length;
	System.out.println(length);
	
	
	System.out.println("==========");
		
	// Nested loop
	
	for (int i = 0; i < a.length; i++) {//row
		
	for (int j = 0; j < a.length; j++) {// column
		
		System.out.println(a[i][j]);
		}	
		}
	
	System.out.println("===========");
	
	//for each loop
	
	for (int[] is : a) {//row
		
	for (int i : is) {//column
		System.out.println(i);
	}	
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
