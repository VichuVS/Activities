package myprojects;
public class Practice {
	int x=75; // Non-static variable
	void m(){// Non-static method
	System.out.println("Non-static M method");}
		{ System.out.println("Non-static block");
		}// Non-static block	
 Practice() {System.out.println("Constructor");}//constructor
public static void main(String args[]) {
		System.out.println("Main");
		Practice obj=new Practice();// object creation
		obj.m();
		System.out.println(obj.x);
		}   
}
