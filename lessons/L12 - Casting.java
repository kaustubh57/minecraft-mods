package in.seahagen.lessons;

public class Main {

    public static void main(String[] args) {

        /* CASTING */

        int loan = 750;
        float interestRate = 0.0525f;

        float interest = loan * interestRate;
        System.out.println(interest);

        int x = (int)50.5f + (int)20.6f;
        int y = 50 + (int)'A';
        System.out.println(x);

    }
}

