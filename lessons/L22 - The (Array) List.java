package in.seahagen.lessons;

public class Main {

    public static void main(String[] args)
	{
		/* ARRAY LIST */

		// Remember Arrays
		String[] studentMails = {"john@gmail.com", "july@gmail.com", "ryan@gmail.com"};

		List<String> mails = new ArrayList<String>();

		// Add Function
		mails.add("John@yahoo.com");
		mails.add("July@yahoo.com");
		mails.add("Ryan@yahoo.com");
		mails.add("Maria@yahoo.com");

		System.out.println(mails);
		System.out.println(mails.get(0));

		mails.set(0, "John@gmail.com");

		// Remove an Item
		mails.remove(1);

		// Get the Size of the List
		mails.size();

		// Clearing the whole List
		mails.clear();

		// Add Function
		mails.add("E@yahoo.com");
		mails.add("A@yahoo.com");
		mails.add("T@yahoo.com");
		mails.add("F@yahoo.com");
		mails.add("D@yahoo.com");

		// Sorts (?)
		Collections.sort(mails);
    }
}

