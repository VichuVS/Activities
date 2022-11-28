package com.projects;
import java.util.Optional;
class OptionalClass {
public static void main(String ar[]) {
String[] s=new String[10];
s[5]="anudip foundation";
Optional checkNull=Optional.ofNullable(s[5]);
if(checkNull.isPresent()) {
String lowercaseString=s[5].toUpperCase();
System.out.println(lowercaseString);}
else System.out.println("String is not there");}}
