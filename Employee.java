package activity;
record Employee(int EmpID, String Name, int Salary) {
Employee() {
this(12345,"A",55000); }
public static void main(String ar[]) {
	Employee e=new Employee(1234,"A",1500);
	Employee e1=new Employee(6789,"B",1500);
	Employee e2=new Employee(9876,"C",1500);
	Employee e3=new Employee(4321,"D",1500);
System.out.println(e);
System.out.println(e1);
System.out.println(e2);
System.out.println(e3);}}