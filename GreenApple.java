package Ex4_2;

//Subclass of Apple
class GreenApple extends Apple{
	protected String colour;
	protected double price;
	private int serving;
	private	double totalWeight;

	
	//parameterized constructor
	public GreenApple(String name, String flavour, String type, String colour) {
		super(name,flavour,type);
		this.type = type;
		this.colour = colour;
	}
	
	//overriding toString method
	public String toString() {
		return ("Fruit\t\t\t: " + getName() + 
				"\nFlavour\t\t\t: " + flavour + 
				"\nType available\t\t: " + type +
				"\nColour\t\t\t: " + colour);
	}
	
	//overriding method
	public void juiceRecipe() {
		System.out.println("-----Green Apple Detox Juice Calculator-----");
		System.out.print("Enter number of servings: ");
		this.serving = s.nextInt();
		
		System.out.println("Ingredients needed: \n1. " + (this.serving *2) + "apples\n2. "+ (0.1 * this.serving) + "kg Spinach\n3. "+ (this.serving) +" Cucumber\n4. Lemon");
		System.out.println("----------Recipe----------");
		System.out.println("1. Wash all the ingredients and remove the apple core.\n2. Cut the apples.\n3. Blend the apples with spinach and cucumber.\n" +
							"4.Strain the juice and add some lemon juice.");	
		System.out.println("-----------------------------------------");

	}
	
	//overloading method - no argument
	public void showMessage() {
		System.out.println("THANK YOU FOR VISITING US.");
	}
	
	//overloading method - 1 argument
	public void showMessage(int serving) {
		System.out.println("THANK YOU FOR VISITING US.");
		System.out.println("Recipe of your " + serving + " servings of green apple detox juice\n>>>www.juice.com/greenAppleDetox");
	}
	
	//overloading method - 2 argument
	public void showMessage(int amount, double weight) {
		this.totalWeight = amount * weight;
		System.out.println("Stay healthy! You are carrying " + totalWeight + " kg of green apple");
		System.out.println("-----------------------------------------");
	}
}