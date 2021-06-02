package in.seahagen.lessons;

public class Main {

    public static void main(String[] args)
	{
		/* SWITCH STATEMENT */

		int x = 100;

		switch(x)
		{
			case 10: System.out.println("x is 10"); break;
			case 20: System.out.println("x is 20"); break;
			case 50: System.out.println("x is 50"); break;
			case 100: System.out.println("x is 100"); break;
			default:  System.out.println("I don't know what x is..."); break;
		}
    }
}

