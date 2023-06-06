package org.singleton;

public class Employee {
	
  static Employee object;
  
  private Employee() {
}

public static Employee getobject() {
   
	if (object==null) {
		System.out.println("Before object creation:"+System.identityHashCode(object));

		object = new Employee();
		
		System.out.println("After object creation:"+System.identityHashCode(object));
	}
	return object;
	}

  public void add() {
	  System.out.println("Hello");

}
  public static void main(String[] args) {
	
	  Employee getobject = getobject();
	  
	 getobject.add();
	 System.out.println(System.identityHashCode(getobject));
	 
	 
	 Employee getobject2 = getobject();
	 System.out.println(System.identityHashCode(getobject2));
	 
	 Employee getobject3 = getobject();
	 System.out.println(System.identityHashCode(getobject3));
	 
	 
	 
	 
	 
	 
	 
	  
}
  
}




