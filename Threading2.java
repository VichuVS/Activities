package com.projects;

public class Threading2 implements Runnable{
    public void run() {
	System.out.println("Thread implements running" );}
	public static void main (String ar[]) {
	Threading2 t=new Threading2();
	t.run();}}


