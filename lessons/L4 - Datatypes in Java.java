package in.seahagen.lessons;

public class Main {

    public static void main(String[] args) {

		/* Number Types */

		// Mainly used
		int aNumber = 42; 						// Integer (or Whole Number) [-2,147,483,648 to 2,147,483,647]
		float aFloatingNumber = 13.37f; 		// Floating point number  [7 decimal point precision]

		// Sometimes used
		byte aTinyNumber = 100; 				// One byte (or 8 bits) stores numbers from [-128 to 127]
		short aSmallNumber = 30000;				// short stores numbers from [-32,768 to 32,767]
		long aLongNumber = 50000;				// Long (for really long numbers) [-9,223,372,036,854,775,808
												// to 9,223,372,036,854,775,807]
		double aMorePreciseNumber = 420.00005; 	// [15 decimal point precision]

		/* Booleans (Logic) | Testing conditions */

		boolean isThisCourseGreat = true;		// Store either true (1) or false (0)
		boolean isThisHTML = false;

		/* Characters */

		char aSingleCharacter = 'A';			// Stores a single Character. Can also include
												// special Characters like commas, dashes etc.

		/* Strings */

		String message = "Hello World";			// Store a sequence of characters.
    }
}
