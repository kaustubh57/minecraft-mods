package in.seahagen.lessons;

public class main
{
	public static void Main(String[] args)
	{
		/* INHERITANCE */

		Dog fluffy = new Dog();

		fluffy.run();
		fluffy.eat();

		fluffy.bark();


		Cat whiskers = new Cat();

		whiskers.run();
		whiskers.eat();

		whiskers.meow();
	}
}

public class Animal
{
	// Proteced variable means it can be accessed by only its subclasses
	protected String species;

	public void run()
	{
		System.out.println(this.species + " is now running");
	}

	public void eat()
	{
		System.out.println(this.species + " is now eating");
	}
}

public class Dog extends Animal
{
	public Dog()
	{
		//
		this.species = "Dog";
	}

	public void bark()
	{
		System.out.println("Woof Woof");
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
}
