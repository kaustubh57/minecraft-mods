package in.seahagen.lessons;

public class main
{
	public static void Main(String[] args)
	{
		/* POLYMORPHISM - SAME METHODS ON SUPER AND SUBCLASS AND HAVE THEM BE DIFFERENT */

		Dog fluffy = new Dog();

		fluffy.run();
		fluffy.eat();

		fluffy.bark();

		Cat whiskers = new Animal();

		whiskers.run();
		whiskers.eat();

		whiskers.meow();
	}
}

public class Animal
{
	protected String species;

	public void run()
	{
		System.out.println(this.species + " is now running");
	}

	public void eat()
	{
		System.out.println(this.species + " is now eating something");
	}
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
