package in.seahagen.lessons;

public class Main {

    public static void main(String[] args)
	{
		/* HASH MAP */

		// Hash Map maps a Key to a specific Value (KeyValuePair)
		HashMap<String, String> capitals = new HashMap<String, String>();

		capitals.put("Mexico", "Mexico City");
		capitals.put("Germany", "Berlin");
		capitals.put("France", "Paris");
		capitals.put("USA", "Washington DC");

		// Output the HashMap
		System.out.println(capitals);

		// Access by giving the Key ("Germany"), the Value ("Berlin") is returned
		System.out.println(capitals.get("Germany"));

		// Remove an Item
		capitals.remove("France");

		// The size of the HashMap
		System.out.println(capitals.size());

		// "Special" For Loop for HashMap
		for(String s : capitals.keySet()) // s is now a key!
		{
			System.out.println("With key " + s " we can unlock value: " + capitals.get(s));
		}
    }
}

