package myprojects;

class Example {
	void add(int a, int b) {
		System.out.println(+(a+b));
	}
	void add(double d1, double d2) { //overloading
		System.out.println(+(d1+d2));
	}
}
class Sample extends Example{
	void add(String s1, String s2) { //overriding
		System.out.println(s1+s2);
	}
}
public class Overload {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s=new Sample();
		s.add(10,20);
		s.add(2.2,7.8);
		s.add("Hello","");
}}