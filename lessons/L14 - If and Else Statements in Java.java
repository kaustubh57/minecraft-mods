package in.seahagen.lessons;

public class Main {

    public static void main(String[] args)
	{
		/* IF and ELSE Statements */

		int x = 100;
		int y = 1000;
		boolean isGoodCourse = true;

		if(x > y) // false
		{
			System.out.println("x is bigger than y");
		}
		else
		{
			System.out.println("x is NOT bigger than y");
		}

		if(isGoodCourse)
			System.out.println("Yeah, it's good course");

		if(isGoodCourse == true)
			System.out.println("It's really Good, my dudes!");


		if(x < 50)
			System.out.println("x is smaller than 50.");
		else if(x >= 50 && x < 100)
			System.out.println("x is bigger than 50, but smaller than 100.");
		else
			System.out.println("x is 100 or bigger!");

    }
}

