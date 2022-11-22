package activity;
record Vehicle(String Car_name, String Fuel_type, int Cost) {
	Vehicle() {
this("A","Diesel",500000); }
public static void main(String ar[]) {
	Vehicle v=new Vehicle("Maruti","Diesel",700000);
	Vehicle v1=new Vehicle("Kia","Diesel",800000);
	Vehicle v2=new Vehicle("BMW","Diesel",6000000);
	Vehicle v3=new Vehicle("AUDI","Diesel",5500000);
System.out.println(v);
System.out.println(v1);
System.out.println(v2);
System.out.println(v3);}}
