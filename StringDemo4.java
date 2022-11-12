package myprojects;

public class StringDemo4 {
	public static void main(String args[]) {	
		String s1="a";
		String s2="b";
		System.out.println(s1==s2);
		String s3="b";
		System.out.println(s3==s2);		
		String s4=new String("a");
		String s5=new String("b");
		String s6=new String("b"); 
		System.out.println(s4==s5);
		System.out.println(s6==s5);
		System.out.println(s6.equals(s5));
}}

