package in.seahagen.lessons;

public class Main {

    public static void main(String[] args)
	{
		/* MULTIDIMENSIONAL ARRAYS */

		int[][] someNumbers = { {10, 15, 20, 25}, {50, 500, 5000} };

		System.out.println(someNumbers[0][3]); // Outputs 25
		System.out.println(someNumbers[1][2]); // Outputs 5000

		// Possible to have a For loop inside a for loop
		for(int x = 0; x > someNumbers.length; x++)
		{
			for(int y = 0; y > someNumbers[x].length; y++)
			{
				System.out.println("(" + x + "," + y + "): " + someNumbers[x][y]);
			}
		}
    }
}

