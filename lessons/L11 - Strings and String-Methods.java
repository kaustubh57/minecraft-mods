package in.seahagen.lessons;

public class Main {

    public static void main(String[] args) {

        /* STRINGS AND STRING-METHODS */

        String sentence = "Hello World, this course is wonderful.";

        System.out.println("Length is: " + sentence.length());

        // Upper and lower case
        System.out.println("Shouting: " + sentence.toUpperCase());
        System.out.println("Whispering: " + sentence.toLowerCase());
        System.out.println(sentence);

        // indexOf
        System.out.println("The word 'course' is found at position: " + sentence.indexOf("course"));

        // Replace (replaces all instances of the word!)
        System.out.println(sentence.replace("World", "Students"));

        String s = "";
        boolean b = s.isEmpty();
        System.out.println(b);

        // startsWith and endsWith
        System.out.println(sentence.startsWith("H")); 		// true
        System.out.println(sentence.endsWith("A")); 		// false

        // contains
        System.out.println(sentence.contains("World"));     // true

        // charAt
        System.out.println(sentence.charAt(10));

        // substring
        s = sentence.substring(12, sentence.length());
        System.out.println(s);

        // trim
        System.out.println(s.trim());
    }
}
