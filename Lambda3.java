package com.projects;

interface Writable{
	void write(String s);}
	public class Lambda3{
		public static void main(String[] args) {
			Writable w=(String s)->System.out.println(s);
             w.write("Interface with Lambda");				
			}}