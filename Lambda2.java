package com.projects;

class Lambda2 {
public static void main(String ar[]) {
   Runnable r=()->{
  for(int i=0; i<3; i++) {
   System.out.println("Child thread");}};
   Thread t=new Thread(r);
   t.start();
 for(int i=0;i<10; i++) {
   System.out.println("Main Thread");}}}