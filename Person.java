package activity;
record Person(String Name, double Weight, double Height, String Foodhabbit) {
Person() {
this("A",62.35,75,"Non-Veg"); }
public static void main(String ar[]) {
Person p=new Person("A",62.3,75,"Non-Veg");
Person p1=new Person("B",60.3,65,"Veg");
Person p2=new Person("C",55.5,55,"Veg");
Person p3=new Person("D",66.5,85,"Non-Veg");
System.out.println(p);
System.out.println(p1);
System.out.println(p2);
System.out.println(p3);}}
