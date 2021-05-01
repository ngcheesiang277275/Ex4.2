package Ex4_2;

//Main class
class FruitMain {
	public static void main(String[] args) {
		Fruit x = new Fruit("Fruit");
		System.out.println(x);
		x.juiceRecipe();
		
		System.out.println("\n\n-----WELCOME TO HAWAIIAN FRUIT SHOP-----");
		System.out.println("--------------Watermelon--------------");
		Watermelon a = new Watermelon("Watermelon", "Red", 22);
		System.out.println(a);
		a.juiceRecipe();
		a.calculatePrice(4.50);
		a.showMessage();
		a.showMessage(a.getServing());
		a.showMessage(a.getServing(), a.getWeight());
		
		System.out.println("\n\n------------------Apple------------------");
		Apple b = new Apple("Apple", "Sweet", "Red Apple & Green Apple");
		System.out.println(b);
		b.juiceRecipe();
		
		System.out.println("\n\n---------------Green Apple---------------");
		GreenApple c = new GreenApple("Green Apple", "Sour", "Granny Smith" , "Green");
		System.out.println(c);
		c.juiceRecipe();
		c.purchase(3.50);
		c.showMessage();
		c.showMessage(c.amount);
		c.showMessage(c.amount, 0.1);
		
		System.out.println("\n\n----------------Red Apple----------------");
		RedApple d = new RedApple("Red Apple", "Sweet", "Pink Lady" , "Red");
		System.out.println(d);
		d.juiceRecipe();
		d.purchase(4.50);
		d.showMessage();
		d.showMessage(d.amount);
		d.showMessage(d.amount, 0.1);
	}
}