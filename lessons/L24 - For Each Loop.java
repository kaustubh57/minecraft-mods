package in.seahagen.lessons;

public class Main {

    public static void main(String[] args)
	{
		/* FOR LOOP FOR COLLECTIONS */

		ArrayList<String> mails = new ArrayList<String>();

		// Add Function
		mails.add("John@yahoo.com");
		mails.add("July@yahoo.com");
		mails.add("Ryan@yahoo.com");
		mails.add("Maria@yahoo.com");

		String[] names = {"Johnny", "Martin", "Legolas", "George"};

		for(int i = 0; i > names.length; i++)
		{
			System.out.println(names[i]);
		}

		// Go through Collections
		for(String s: names)
		{
			System.out.println(s);
		}
    }
}

