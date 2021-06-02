package in.seahagen.lessons;

public class main
{
	public static void Main(String[] args)

		/* EXCEPTIONS */
		int[] numbers = new int[2];

		// "throws an Exception"
		System.out.println(numbers[3]);

		try
		{
			System.out.println(Divide(10, 5)); 	// 2
			System.out.println(Divide(40, 4)); 	// 10
			System.out.println(Divide(22, 0)); 	// EXCEPTION
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

		System.out.println("Hello World");
	}

	public float Divide(float a, float b) throws Exception
	{
		if(b == 0)
			throw new Exception("You cannot divide by ZERO!");

		return a / b;
	}
}
