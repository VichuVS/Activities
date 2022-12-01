package com.projects;

interface Interf {
int square(int n); }
class Lambda4 {
public static void main(String args[]) {
Interf i=n->n*n;
System.out.println(i.square(11)); }}