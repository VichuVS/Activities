package com.projects;

import java.util.HashSet;
import java.util.Iterator;

public class Hash {
public static void main(String[] args) {
	HashSet<String> h=new HashSet<String>();
	h.add("A");
	h.add("B");
	h.add("C");
	Iterator<String> i= h.iterator();
	while (i.hasNext()) {
		System.out.println(i.next());}
			//for each method
	   System.out.println("Hash elements--"+h);
		h.forEach(names->System.out.println(names));
		System.out.println("Method reference--"+h);
		h.forEach(System.out::println);}}

