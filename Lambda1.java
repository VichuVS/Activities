package com.projects;

interface Drawable {
public void draw(); }
  public class Lambda1 {
     public static void main(String args[]) {
    	Drawable d=()->System.out.println("Drawing");
	    d.draw();}}
