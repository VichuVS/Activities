package myprojects;

public class Test1 {
	int x=75, y=50;
	void printXY() {
		System.out.println(+x+" "+y);// this.x	this.y
	}
	void setXY(int x, int y) {
		this.x=x;
		this.y=y ;
	}		
public static void main(String args[]){
	Test1 t=new Test1();
	Test1 t2=new Test1();
	t.setXY(75,85);
	t.printXY();
	t2.setXY(9,6);
	t2.printXY();
}
}

