package com.projects;

public class Daemonthread  extends Thread{ 
		public void run(){ 
		 if(Thread.currentThread().isDaemon()){
		 System.out.println("Daemon thread works"); 
		 }else{ 
		System.out.println("User thread works");}} 
		public static void main(String[] ar){ 
		  Daemonthread t1=new  Daemonthread();
		  Daemonthread t2=new  Daemonthread();
		  Daemonthread t3=new  Daemonthread(); 
		 t1.setDaemon(true);
		 t2.setDaemon(true);
		 t3.setDaemon(false);
		 t1.start();
		 t2.start(); t3.start(); }}

