package in.seahagen.lessons;

public class Main {

    public static void main(String[] args)
	{
		/* JAVA METHODS */

		int num, factorial;
		num = 5;
		factorial = num;

		for (int i = num - 1; i >= 1; i--)
		{
			factorial *= i;
		}

		System.out.println("Factorial is: " + factorial);

		// With a Method
		System.out.println("Factorial is: " + Factorial(6));
	}

	public static int Factorial(int number)
	{
		int fact = number;

		for (int i = number - 1; i >= 1; i--)
			factorial *= i;

		return factorial;
	}
}

