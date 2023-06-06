package org.singleton;

public class Sample {
	
	public static void main(String[] args) {
		
	Employee getobject = Employee.getobject();
	getobject.add();
	System.out.println(System.identityHashCode(getobject));
	
		Employee getobject2 = Employee.getobject();
		System.out.println(System.identityHashCode(getobject2));
	}
	
	
	
	

}
