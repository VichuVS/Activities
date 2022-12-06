package com.projects;

import java.util.Stack;

public class StackTest {
public static void main(String[] args) {
	Stack<Integer> s=new Stack<Integer>();
	System.out.println(s.empty());
	s.push(11);
	s.push(22);
	System.out.println(s.get(0));
	System.out.println(s.get(1));
	System.out.println(s.empty());}}
