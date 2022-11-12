package myprojects;

public class Stringmethod1 {
	public static void main(String arg[]) { 
	String s1="abc";
	System.out.println(s1);
	
	String s2="def ";
	System.out.println(s2);
	
	String s3=new String();
	System.out.println(s3);
	
	String s4=new String("ghi");
	System.out.println(s4);
	
	String s5=new String(s1);//String copy
	System.out.println(s5);
	
	String s6=s2;
	System.out.println(s6);
	
	char[] ch={'a','b','c','d','e','f'};
	System.out.println(ch);
	
	String s7=new String(ch);
	System.out.println(s7);
	
	String s8=new String(ch, 1,3);
	System.out.println(s8);	
	
	String s9=null;
	System.out.println(s9);
}}