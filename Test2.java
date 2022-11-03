package myprojects;

public class Test2 {
	int a=10, b=20;
	void m(int a){
		System.out.println(a);//10
		a=50;
		System.out.println(a);//50
	}
public static void main(String args[]){
	Test2 t=new Test2();
	//System.out.println(t.a);//10
	t.m(t.a);
}
}

