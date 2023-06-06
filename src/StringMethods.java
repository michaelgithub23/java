

public class StringMethods {

public static void main(String[] args) {
	
	//literal string string pool or string content RAM JVM Heap Memory
	String s1 = "java";
	String s2 = "java";
	String s3 = "programme";
	
	int id1 = System.identityHashCode(s1);
	System.out.println(id1);
	
	int id2 = System.identityHashCode(s2);
	System.out.println(id2);
	
	int id3 = System.identityHashCode(s3);
	System.out.println(id3);
	
	System.out.println("**********");
	
	
	
	//non literal string Ram jvm heap memory
	
	String s4 = new String ("selinium");
	String s5 = new String ("selinium");
	String s6 = new String ("project");
	
	int id4 = System.identityHashCode(s4);
	System.out.println(id4);
	
	int id5 = System.identityHashCode(s5);
	System.out.println(id5);
	
	int id6 = System.identityHashCode(s6);
	System.out.println(id6);
	
	
}


}


