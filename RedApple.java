package Ex4_2;

//Subclass of Apple
class RedApple extends Apple{
	protected String colour;
	protected double price;
	private int serving;
	private int numOfApple;
	private double totalWeight;

	
	//parameterized constructor
	public RedApple(String name, String flavour,String type, String colour) {
		super(name,flavour,type);
		this.colour = colour;
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
		System.out.println("-----Apple Carrot Juice Calculator-----");
		System.out.print("Enter number of servings: ");
		this.serving = s.nextInt();
		
		this.numOfApple = this.serving * 2; 
		System.out.println("Ingredients needed: \n1. " + this.numOfApple + "apples\n2. Lemon\n3. Carrot\n");
		System.out.println("----------Recipe----------");
		System.out.println("1. Wash and remove the core.\n2. Cut the apples.\n3. Blend the apples with carrot.\n" +
							"4.Strain the juice and add some lemon juice for extra flavour.");	
		System.out.println("-----------------------------------------");

	}
	
	//overloading method - no argument
	public void showMessage() {
		System.out.println("THANK YOU FOR VISITING US.");
	}
	
	//overloading method - 1 argument
	public void showMessage(int serving) {
		System.out.println("Recipe of your " + serving + " servings of apple carrot juice\n>>>www.juice.com/applecarrot");
	}
	
	//overloading method - 2 argument
	public void showMessage(int amount, double weight) {
		this.totalWeight = amount * weight;
		System.out.println("Stay healthy! You are carrying " + this.totalWeight + " kg of red apple");
		System.out.println("-----------------------------------------");
	}
}