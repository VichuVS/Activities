package myprojects;
interface interf {
	public void m();
	}
public class Interface implements interf {
	public void m() {
	System.out.println("Hello_method"); }
 public static void main(String args[]) {
	Interface i=new Interface();
		i.m();
		}} 