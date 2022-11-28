package com.projects;

public class Threading1 extends Thread {
	public void run(){
	System.out.println("Thread extends running");}
	public static void main(String ar[]){
	Threading1 t=new Threading1();
	t.run();}}



