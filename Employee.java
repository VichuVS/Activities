package myprojects;

public class Employee {
	 double salary=40000;
	 }
	 class Test_Emp extends Employee{ 
		int bonus=5000;
	 public static void main(String args[]) {
		Test_Emp t=new Test_Emp();
		System.out.println(t.salary);
		System.out.println(t.bonus);
	 }
	 }    
