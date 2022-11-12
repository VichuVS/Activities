package myprojects;
class A{ //parent
	 int a=75;
	 void m() {
	 System.out.println("A class method"); }
	 }
	 class B extends A{ // child
	 int b=100;
	 void m() {
	 System.out.println("B class method"); }
	 }
	 class Inheritance{
	 public static void main(String[] args) {
	 B a=new B();// child class object
	  System.out.println(a.b);
	  a.m();
	  System.out.println(a.a);
	  a.m();
	 }
	 }