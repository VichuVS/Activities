package activity;

interface Sayable {
void sayMore(String msg);

default void say() {
System.out.println("Hi, Default method");}}

class InterfaceDefault implements Sayable {
public void sayMore(String msg) { 
System.out.println(msg);}

public static void main (String ar[]) {
Sayable s=new InterfaceDefault();
s.say();
s.sayMore("Doing smart work is better than hardwork");}}
