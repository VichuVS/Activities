package com.projects;

import java.util.Vector;

public class VectorTest {
public static void main(String[] args) {
	Vector<String> v=new Vector <String>();
       v.add("Hello");
       v.add("how are you?");
       System.out.println(v);
       v.addElement("yes,Im fine.");
       v.addElement("How you been?");
       System.out.println("Vector test--"+v);}}
