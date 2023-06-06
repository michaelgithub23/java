package org.stringprog;

public class StringMethods1 {
	
	public static void main(String[] args) {
		
		String s1 ="java";
		String s2 ="Java";
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		System.out.println("*********");
		
		String s3 = new String("Java");
		String s4 = new String("Java");
		
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		System.out.println("***************");
		
//immutable string
		
		String s5 = "java";
		String s6 = "sql";
		
		
		
		String concat = s5.concat(s6);
		
		System.out.println(concat);
		System.out.println(System.identityHashCode(s5));
		System.out.println(System.identityHashCode(s6));
		
		
		System.out.println("*********");
		
//mutable string
		
		StringBuffer s7 = new StringBuffer("Java");
		StringBuffer s8 = new StringBuffer("sql");
		StringBuffer s9 = new StringBuffer("python");
		
		StringBuffer append = s7.append(s8);
		System.out.println(append);
		
		StringBuffer z = append.append(s7);
		System.out.println(z);
		
		System.out.println(System.identityHashCode(s9));
		System.out.println(System.identityHashCode(s8));
		System.out.println(System.identityHashCode(z));
		
//		StringBuffer reverse = s7.reverse();
//		System.out.println(reverse);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
