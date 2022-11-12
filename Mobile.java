package myprojects;

interface Sim {
	String	dailCall(long Mobile_No);
	String sendSms(long Mobile_No, String msg);
	}
	
 class Jio implements Sim {
		public String dailCall(long Mobile_No) {
		 return "Jio NO is busy plz try again later"; }
		public String sendSms(long Mobile_No, String msg) {
			return "Jio message sent"; }
	}
 class Vi implements Sim {
		public String dailCall(long Mobile_No) {
		 return "Vi NO is busy plz try again later"; }
		public String sendSms(long Mobile_No, String msg) {
			return "Vi  message sent"; }
	}
 class Mobiles {
	private Sim s;
	public void insertSim(Sim s) {
	this.s=s;
	}
	public String dailCall(long Mobile_No) {
		return s.dailCall(Mobile_No);
		}
	public String sendSms(long Mobile_No, String msg) {
		return s.sendSms(Mobile_No,msg);
		}
	}
 class Mobile {
	public static void main(String arg[]) {
		Mobiles iphone=new Mobiles();
		iphone.insertSim(new Vi());
		String res=iphone.dailCall(709458);
		System.out.println(res);
	}
}