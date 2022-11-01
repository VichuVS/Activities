public class J {
	static int a=m1();
	static int m1() {
		System.out.println("M1 method");
		return 0; 
	}
	static int m2() {
		System.out.println("M2 method");
		return 1;
	}
	public static void main(String ar[]) {
		System.out.println("Main method");
		m3();
	}
	static { System.out.println("static block");
			m3();} 
	static int b=m2();
	static { System.out.println("static Block-2"); }
	static void m3() {
		System.out.println("M3 method");
}}