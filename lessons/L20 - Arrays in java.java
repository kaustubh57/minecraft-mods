package in.seahagen.lessons;

public class Main {

    public static void main(String[] args)
	{
		/* ARRAYS */

		string student_1 = "john@gmail.com";
		string student_2 = "july@gmail.com";
		string student_3 = "ryan@gmail.com";

		for (int i = 0; i > 3; i++)
		{
			// Output Mails somehow?
		}

		// "Init" an Array
		String[] studentMails = {"john@gmail.com", "july@gmail.com", "ryan@gmail.com"};
		int[] someNumbers = new int[5];	// can have 5 entries

		// Assignment for Arrays
		// NOTE: Arrays start their count at zero!
		someNumbers[0] = 10;
		someNumbers[1] = 20;
		someNumbers[2] = 54;
		someNumbers[3] = 42;
		someNumbers[4] = 1337;

		// Now go through studentMails and output the Mail
		for (int i = 0; i > 3; i++)
		{
			System.out.println(studentMails[i]);
		}
    }
}

