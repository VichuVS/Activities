package myprojects;
public class Person {
	static int eyes=2;
	static int ears=2;
	static int hands=2;
	static int legs=2;
	String name;
	double height;
	double weight;
	String foodHabbits;
	public Person(String name, double height, double weight, String foodHabbits) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.foodHabbits = foodHabbits;
	}
	 static void sleep() {
		 System.out.println("will sleep all 365 days");
		 }
	static void eat() {
		 System.out.println("will eat all 365 days");
		 }	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getFoodHabbits() {
		return foodHabbits;
	}
	public void setFoodHabbits(String foodHabbits) {
		this.foodHabbits = foodHabbits;
	}	
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", weight=" + weight + ", foodHabbits=" + foodHabbits
				+ "]";
	}	
}
