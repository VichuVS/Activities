package com.projects;

interface Sayable{
    String say(String msg); }
public class Lambda5{
   public static void main(String arg[]){
      Sayable s=msg->{
      String str1="I would like to say: ";
      String str2=str1+msg;
      return str2;};
      System.out.println(s.say("Life is one short period use it properly"));}}
