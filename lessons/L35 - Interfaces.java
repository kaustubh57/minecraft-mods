package in.seahagen.lessons;


public class main
{
	public static void Main(String[] args)
	{
		/* INTERFACES */

		ITalkable fluffy = new Dog();
		fluffy.Talk();
	}
}

// Create this as a new Interface
public interface ITalkable
{
    void Talk();
}

public class Dog extends Animal implements ITalkable
{
	public Dog()
	{
		this.species = "Dog";
	}

	public void bark()
	{
		System.out.println("Woof Woof");
	}

	public void run()
	{
		System.out.println("Dog is running");
	}

	public void eat()
	{
		System.out.println(this.species + " is now eating a steak!");
	}

    @Override
    public void Talk()
    {
        System.out.println("This Dog really likes you");
    }
}
