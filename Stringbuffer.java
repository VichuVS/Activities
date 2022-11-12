package myprojects;

public class Stringbuffer {
	public static void main(String[] args) {
		String s="Anudip";
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb);
		System.out.println(sb.toString());
		System.out.println(sb.insert(2, "R"));
		System.out.println(sb.capacity());
		System.out.println(sb.toString());
}}


