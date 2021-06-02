package in.seahagen.lessons;

public class Main {

    public static void main(String[] args)
	{
		/* INTEGERS AND MATH-METHODS */
		int x = 100;
		int y = 225;

		// Maximum and Minimum
		System.out.println(Math.max(x, y)); // 250
		System.out.println(Math.min(x, y)); // 100

		// Square Root
		System.out.println(Math.sqrt(y)); 	// 15

		// Absolute Value
		System.out.println(Math.abs(-5000)); // 5000

		// ceil and floor
		System.out.println(Math.ceil(22.412f));  // 23
		System.out.println(Math.floor(22.412f)); // 22

		// pow
		System.out.println(Math.pow(10, 2)); // 10^2 = 100

		// Random Number
		System.out.println((int)(Math.random() * 100)); // random number from 0 to 100
    }
}

