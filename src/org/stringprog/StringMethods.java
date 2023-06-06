package org.stringprog;

public class StringMethods {
	
	public static void main(String[] args) {
		
		//           012346........n-1
		String s1 = "java programme";
		int length = s1.length();
		System.out.println(length);
		
		String uppercase = s1.toUpperCase();
		System.out.println(uppercase);
		
		String lowercase = s1.toLowerCase();
		System.out.println(lowercase);
		
		//string methods are case sensitive
		int indexof = s1.indexOf('v');
		System.out.println(indexof);
		
		int indexof1 = s1.indexOf('a');
		System.out.println(indexof1);
		
		int lastindexof = s1.lastIndexOf('a');
		System.out.println(lastindexof);
		
		char giri = s1.charAt(2);
		System.out.println(giri);
		
		boolean equals = s1.equals("JAVA PROGRAMME");
		System.out.println(equals);
		
		String s2 = "java programme";
		boolean equals2 = s2.equals(s2);
		System.out.println(equals2);
		
		boolean ignorecase = s1.equalsIgnoreCase("JAVA PROGRAMME");
		System.out.println(ignorecase);
		System.out.println("**********");
		
		
	    boolean contains = s2.contains("pro");
		System.out.println(contains);
		
	    String replace =s2.replace("java","selinium");
	    System.out.println(replace);
	    
	    boolean Startwith = s2.startsWith("java");
	    System.out.println(Startwith);
	    
	    boolean endwith = s2.endsWith("java");
	    System.out.println(endwith);
	    
	    boolean empty = s2.isEmpty();
	    System.out.println(empty);
	    
	    String trim = s2.trim();
	    System.out.println(trim);
	    
	    
	    String s3 = "044-788765";
	    String[]split = s3.split("-");
	    String sp1 = split[0];
	    String sp2 = split[1];
	    System.out.println(sp1);
	    System.out.println(sp2);
	    
	    String substring = s2.substring(2);
	    System.out.println(substring);
	    
	    //0123444.......n-1
	    
	    String substring1 = s2.substring(2, 8);
	    System.out.println(substring1);
	    
	    
	    }

}
