package Ex4_2;

class Watermelon extends Fruit {
	private String colour;
	private int stock;
	private double weight;
	private int serving;
	private double weightNeeded;
	
	//parameterized constructor
	public Watermelon(String name, String colour, int stock) {
		super(name);
		this.colour = colour;
		this.stock = stock;
		System.out.println("Watermelon constructor is invoked");
	}
	
	//method
	public void calculatePrice(double pricePerKg) {
		System.out.println("-----------------Shop--------------------");
		System.out.printf("%-20s: ", "Enter Weight(kg)");
		weight = s.nextDouble();
		
		double finalPrice = weight * pricePerKg;
		System.out.printf("%-20s: RM%.2f%n", "Price per kg", pricePerKg);
		System.out.printf("%-20s: RM%.2f%n", ">>>Total price", finalPrice);
		System.out.println("-----------------------------------------");

	}
	
	//overriding toString method
	public String toString() {
		return ("Fruit\t\t: " + getName() + "\nColour\t\t: " + colour + "\nStock\t\t: " + stock + "\n");
	}
	
	//overriding method
	public void juiceRecipe() {
		System.out.println("-------Watermelon Juice Calculator-------");
		System.out.print("Enter number of servings: ");
		this.serving = s.nextInt();
		
		this.weightNeeded = this.serving * 0.5; 
		System.out.println("Ingredients needed: \n1. " + this.weightNeeded + "kg of watermelon\n2. Lime\n");
		System.out.println("----------Recipe----------");
		System.out.println("1. Slice the watermelon.\n2. Scoop and blend the watermelon.\n3. Squeeze some small limes for extra flavour.\n");
		System.out.println("-----------------------------------------");

	}
	
	//overloading method - no argument
	public void showMessage() {
		System.out.println("THANK YOU FOR VISITING US.");
	}
	
	//overloading method - 1 argument
	public void showMessage(int serving) {
		System.out.println("Recipe of your " + serving + " servings of watermelon juice\n>>>www.juice.com/watermelon");
	}
	
	//overloading method - 2 argument
	public void showMessage(int serving, double weight) {
		System.out.println("Stay healthy! You are carrying " + weight + " kg of watermelon");
		System.out.println("-----------------------------------------");

	}
	
	//accessor
	public int getServing() {
		return this.serving;
	}
	
	public double getWeight() {
		return this.weight;
	}

}