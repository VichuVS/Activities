public class Declar {
	static int a;
	static int b;
			int x;
			int y;
	static void m(){
		a=100;
		b=200;
		Declar d=new Declar();
		d.x=300;
		d.y=400;
		System.out.println(+d.x+" "+d.y);
		}	
	public static void main(String ar[]) {
		System.out.println(+a+" "+b);
		m();
		System.out.println(+a+" "+b);
		Declar d1=new Declar();
		System.out.println(+d1.x+" "+d1.y);		
}}