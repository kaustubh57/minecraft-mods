package in.seahagen.lessons;

public class main
{
	public static void Main(String[] args)
	{
		/* GETTERS AND SETTERS */

		Fruit banana = new Fruit();	// Fruit is the Class. Banana is the Object (also refered to as an INSTANCE of that class or object)
		banana.setName("Banana");

		Fruit apple = new Fruit("Apple", 10, "Red");
		System.out.println(apple.getName());
	}
}

// Create a Sperate Class here!
public class Fruit
{
    private String name;
    private int sugarContent;
    private String color;

    public Fruit()
    {

    }

    public Fruit(String name, int sugarContent, String color)
    {
        this.name = name;
        this.sugarContent = sugarContent;
        this.color = color;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public int getSugarContent()
    {
        return sugarContent;
    }

    public void setSugarContent(int sugarContent)
    {
        this.sugarContent = sugarContent;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
}

