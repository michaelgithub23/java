package constructor;

public class Sample {
	
	public Sample() {
		
	System.out.println("Default Constructor");
		
	}
	
    public Sample(int age) {
		
	System.out.println("int Parameterized Constructor:"+age);
		

}
public Sample(String name) {
		
		System.out.println("String Parameterized Constructor:"+name);
		

}

 public static void main(String[] args) {
	
	 Sample S = new Sample();
	 Sample S1 = new Sample(25);
	 Sample S2 = new Sample("sam");
	 
	 
}






}

