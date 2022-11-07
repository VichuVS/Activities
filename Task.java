package myprojects;
public class Task {
	public static void main(String raj[]){
		Person p=new Person("A",163.5,75.28,"Non-Veg");
		Person p1=new Person("B",153.5,60.28,"Veg");		
		System.out.println(p);
		p.sleep();	
		System.out.println(p1);
		p.eat();
		}
}

