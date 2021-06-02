package in.seahagen.lessons;

public class Main {

    public static void main(String[] args)
	{
		/* BREAK and CONTINUE */

		for (int i = 0; i < 10; i++)
		{
			if(i == 4) continue; // for loop gets "called" again
			System.out.println(i);	// 0 to 3 and 5 to 9
		}

		for (int i = 0; i < 10; i++)
		{
			if(i == 5) break; // for loop stops
			System.out.println(i);	// 0 to 4
		}
    }
}

