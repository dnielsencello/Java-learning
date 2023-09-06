import java.sql.SQLOutput;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        java.util.Random rng = new java.util.Random();
// While loop
//        double value = rng.nextDouble();
//        while (value < 0.8) {
//            System.out.printf("The number is: %.2f\n", value);
//            value = rng.nextDouble();
//        }
//
//        System.out.printf("The final number is: %.2f\n", value);

// Do while loop
//        java.util.Scanner input = new java.util.Scanner(System.in);
//        boolean done = false;
//        double sum = 0;
//        do {
//            System.out.println("Enter a value ('end to quit'): ");
//            String userInput = input.next();
//
//            if (userInput.equalsIgnoreCase("end")) {
//                done = true;
//
//            }
//            else {
//                sum += Double.parseDouble(userInput);
//
//            }
//        } while (!done);
//
//        System.out.printf("The sum of your numbers is %.2f\n", sum);

// The for loop
//        java.util.Scanner input =  new java.util.Scanner(System.in);
//        System.out.print("How many times: ");
//        int howMany = input.nextInt();
//
//
//        for (int i = 0; i < howMany; i++ ) {
//            System.out.println("Welcome to Java!");
//        }
//        System.out.println("You will enjoy it!");
        // The greatest common divisor

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers");

        int n1 = input.nextInt();
        int n2 = input.nextInt();

        int gcd = 1; // initial guess
        int k = 2; // possible gcd
        while (k<= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;

            }
            k++;

        }
        System.out.printf("The gcd for %d and % d is %d", n1, n2, gcd);

    }
}
