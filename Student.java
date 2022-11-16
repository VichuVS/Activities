package activity;
record Student(int Rollno, String Name, int Fee) {
Student() {
this(111,"A",1500); }
public static void main(String ar[]) {
Student s=new Student(111,"A",1500);
Student s1=new Student(112,"B",1500);
Student s2=new Student(113,"C",1500);
Student s3=new Student(114,"D",1500);
System.out.println(s);
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);}}

