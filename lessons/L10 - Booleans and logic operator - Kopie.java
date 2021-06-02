package in.seahagen.lessons;

public class Main
{
    public static void main(String[] args)
	{
		/* BOOLEAN AND LOGIC */
		boolean isGrounded = false;
		boolean x = 2 < 5; 		// true
		boolean y = 10 > 50; 	// false
		// < > >= <= == !=
		boolean b = 100 == 100;	// true (equals)
		boolean c = 50 != 51; 	// true (unequals)

		// AND (&&) OR (||) NOT (!)

		boolean b2 = x && y; 	// false (AND)
		boolean b3 = isGrounded || b; // true (OR)
		boolean b4 = !true; 	// false (NOT)

		boolean b5 = b2 && b4 || b3 && x || y || c;

    }
}
