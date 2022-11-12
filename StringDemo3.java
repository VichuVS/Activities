package myprojects;

public class StringDemo3 {
	StringDemo3() {
		System.out.println("default constructor");
		}
	StringDemo3(int a) {
		System.out.println("Parameterized integer");
		}
	StringDemo3(String s) {
		System.out.println("Parameterized string");
		}
		public static void main(String[] args) {
			StringDemo3 s1=new StringDemo3();
			StringDemo3 s2=new StringDemo3(50);
			StringDemo3 s3=new StringDemo3("welcome");
		}
}
