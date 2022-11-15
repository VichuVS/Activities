package activity;
interface Printable { 
void print();}

interface Showable extends Printable { 
void show();}

class InterfaceInheritance implements Showable{
public void print() {
System.out.println("Welcome,Printable interface"); }
public void show() {
System.out.println("Hi, Showable interface"); }
public static void main(String ar[]) {
InterfaceInheritance t=new InterfaceInheritance();
t.print(); t.show(); } }
