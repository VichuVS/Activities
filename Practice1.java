package myprojects;
public class Practice1 {
	int x=100; 
	{System.out.println("Non-static block");}
	Practice1() {System.out.println("Constructor");}//constructor
public static void main(String args[]) {
		System.out.println("Main");
		Practice1 obj=new Practice1();// object creation
		}
}
