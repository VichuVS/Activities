public class Access {
	static int x=10;
	static int y=20;	
	static {	System.out.println("This is static block"); 	} 	
	static void m(){
	System.out.println("Static Method"); }	
	public static void main(String ar[]) {
		System.out.println("Main");
			m();
		System.out.println(x);
		System.out.println(y);	
}}
