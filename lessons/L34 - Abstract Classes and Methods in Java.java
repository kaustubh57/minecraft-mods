package in.seahagen.lessons;


public class main
{
	public static void Main(String[] args)
	{
		/* ABSTRACT CLASSES AND METHODS */

		Dog fluffy = new Dog();

		fluffy.run();
		fluffy.eat();

		fluffy.bark();

		Cat whiskers = new Cat();
		// Cat whiskers2 = new Animal(); // 2 - Not gonna work

		whiskers.run();
		whiskers.eat();

		whiskers.meow();
	}
}

// An Abstract class cannot have an instance | "Type of Animal"
// An abstract class can have implemented methods
public abstract class Animal
{
	protected String species;

	public void run()
	{
		System.out.println(this.species + " is now running");
	}

	// Abstract method is an unimplemented method
	public abstract void eat();
}

public class Dog extends Animal
{
	public Dog()
	{
		this.species = "Dog";
	}

	public void bark()
	{
		System.out.println("Woof Woof");
	}

	public void eat()
	{
		System.out.println(this.species + " is now eating a steak!");
	}
}

public class Cat extends Animal
{
	public Cat()
	{
		this.species = "Cat";
	}

	public void meow()
	{
		System.out.println("Meow");
	}

	public void eat()
	{
		System.out.println(this.species + " is now drinking some milk!");
	}
}
