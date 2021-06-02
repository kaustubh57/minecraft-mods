package in.seahagen.lessons;

public class Main
{
	public static void Main(String[] args)
	{
		/* METHOD OVERLOADING */

		System.out.println(Multiply(10, 3));

		System.out.println(Multiply(5, 2, 4));

		System.out.println(Multiply(3.5f, 12.4f));
	}

	public static int Multiply(int a, int b)
	{
		return a * b;
	}

	public static int Multiply(int a, int b, int c)
	{
		return a * b * c;
	}

	public static float Multiply(float a, float b)
	{
		return a * b;
	}
}

