package constructor;
//child
//sub
public class Sample1 extends One {
	
	public Sample1() {
		this(24);
		System.out.println("Child Default Constructor");
	}
	
	public Sample1(int age) {
		this("sam");
		System.out.println("Child int Parameterized Constructor:"+age);
		
	}
	public Sample1(String name) {
		super(2555);
		System.out.println("Child String Parameterized Constructor:"+name);
	}

public static void main(String[] args) {
	
	Sample1 S1 = new Sample1();
	}

}
