class R {
	static int x=m();
	static int m() {
		System.out.println("M method");
		return 0;
	}
	static { System.out.println("Static block"); }
public static void main(String ar[]){
	System.out.println("Main method");
}}

