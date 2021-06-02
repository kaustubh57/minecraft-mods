package in.seahagen.lessons;

public class main
{
	public static void Main(String[] args)
	{
		/* STATIC KEYWORD */

		Animal a = new Animal();
		System.out.println(Animals.numAnimals);

		Animal ab = Animals.generateAnimal();
		System.out.println(Animals.numAnimals);
	}
}

public class Animal
{
    public String species;
    public static int numAnimals = 0;

    public Animal()
    {
        numAnimals++;
    }

    public static Animal generateAnimal()
    {
        return new Animal();
    }

    public void run()
    {
        System.out.println(this.species + " is running");
    }

    public void eat()
    {
        System.out.println(this.species + " is eating");
    }
}
