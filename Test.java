package myprojects;

public class Test {
	int x=75, y=50;
	void m() {
		System.out.println(+x+" "+y);// this.x	this.y
	}
	void m2() {
		int x=5, y=9;
		System.out.println(+x+" "+y);
	}		
public static void main(String args[]){
	Test t=new Test();
	Test t2=new Test();
	t.m();
	t2.m();	
	t.m2();
	t2.m2();
}
}
