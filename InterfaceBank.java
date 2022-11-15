package activity;
interface Bank {
double rateOfInterest(); }
 
class IB implements Bank{
public double rateOfInterest() { return 9.15; } }

class BOI implements Bank {
public double rateOfInterest() { return 12.5; } }

class InterfaceBank {
public static void main(String args[]) {
Bank b=new IB();
System.out.println(b.rateOfInterest());
Bank b1=new BOI();
System.out.println(b1.rateOfInterest()); }}

