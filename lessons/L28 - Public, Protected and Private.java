package in.seahagen.lessons;

public class main
{
	public static void Main(String[] args)
	{
		/* ACCESS */

		Fruit banana = new Fruit();	// Fruit is the Class. Banana is the Object (also refered to as an INSTANCE of that class or object)
		banana.name = "Banana";

		Fruit apple = new Fruit("Apple", 10, "Red");
		System.out.println(apple.name);
	}
}

// Create a Sperate Class here!
public class Fruit
{
	private String name;
	protected int sugarContent;
	public String color;

	public Fruit(String n, int sugar, String color)
	{
		this.name = n;
		this.sugarContent = sugar;
		this.color = color;
	}
}

