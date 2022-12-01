package com.projects;

interface fun{
	void m();
	default void m1(){
		System.out.println("This is default");}
	static void m2() {
		System.out.println("This is static");}}
class FuncInterface implements fun{
	public void m() {
		System.out.println("This is func interface");}
	 public static void main(String[] args) {
	fun f=new  FuncInterface();
	;f.m1();fun.m2();f.m();}}