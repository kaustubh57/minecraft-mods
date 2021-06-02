package in.seahagen.lessons;

public class Main {

    public static void main(String[] args) {

        /* INTEGERS AND ARITHMETIC OPERATORS */
        int first = 100;
        int second = 200;

        // addition
        int addition = first + second; // 300
        System.out.println(addition);
        int sum = addition + 200 + 500; // 1000
        System.out.println(sum);


        // subtraction
        int sub = first - second; // -100
        System.out.println(sub);

        // multiply
        int mul = 4 * first;    // 400
        System.out.println(mul);


        // divide
        int div = second / first; // 2
        System.out.println(div);

        // Modulus (Remainder)
        int remainder = 25 % 2; // 1
        System.out.println(remainder);
        int anotherRem = 115 % 10;  // 5
        System.out.println(anotherRem);

        // Increment and Decrement
        int i = 1;
        i = i + 1; // 2
        i += 1; // 3
        i++; // 4
        i--; // 3

        i += 10; // 13
        // -= *= /= %=
    }
}
