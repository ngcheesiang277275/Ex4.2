package Ex4_2;

//Subclass of Fruit
class Apple extends Fruit{
	protected String flavour;
	protected String type;
	protected int amount;
	private int serving;
	private int numOfApple;

	
	//parameterized constructor
	public Apple(String name, String flavour, String type) {
		super(name);
		this.flavour = flavour;
		this.type = type;
		System.out.println("Apple constructor is invoked");
	}
	
	//method
	public void purchase(double price) {
		System.out.println("-----------------Shop--------------------");
		System.out.println("-----BUY 5 OR MORE FOR 20% DISCOUNT-----");
		System.out.printf("%-20s: RM%.2f%n", "Price per unit", price);
		System.out.printf("%-20s: ", "Enter amount");
		amount = s.nextInt();
		
		double priceApple = amount * price;
		System.out.printf("%-20s: RM%.2f%n", ">>>Total price", priceApple);	
		
		if(amount >= 5) {
			double discountPriceApple = priceApple * 0.90;
			System.out.printf("%-20s: RM%.2f%n", ">>>Final price", discountPriceApple);	

		}else {
			System.out.printf("%-20s: RM%.2f%n", ">>>Final price", priceApple);	
		}
		
		System.out.println("-----------------------------------------");

	}
	
	//overriding toString method
	public String toString() {
		return ("Fruit\t\t\t: " + getName() + 
				"\nFlavour\t\t\t: " + flavour + 
				"\nType available\t\t: " + type + "\n");
	}
	
	//overriding method
	public void juiceRecipe() {
		System.out.println("----------Apple Juice Calculator----------");
		System.out.print("Enter number of servings: ");
		this.serving = s.nextInt();
		
		this.numOfApple = this.serving * 3; 
		System.out.println("Ingredients needed: \n1. " + this.numOfApple + "apples\n2. Sugar\n3. "+ (0.25* this.serving) + " cup of water\n");
		System.out.println("----------Recipe----------");
		System.out.println("1. Wash and remove the core.\n2. Cut the apples.\n3. Blend the apples and add water.\n" +
							"4.Strain the apple juice and add some sugar.");	
		System.out.println("-----------------------------------------");

	}
	
}