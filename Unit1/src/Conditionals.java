import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.print("Enter a radius: ");
//        double radius = input.nextDouble();
//
//        if (radius > 0) {
//            double area = radius * radius * 3.14159;
//            System.out.println("Area for the circle is " + area);
//        }
//        else {
//            System.out.println("Can't compute the area of a circle with 0 or negative radius");
//            System.out.println("Enter a new radius value: ");
//        }
        System.out.println("Enter a raw test score (0 - 100): ");
        double rawScore = input.nextDouble();

        if (rawScore >= 90) {
            System.out.println("A");
        }
        else if (rawScore >= 80) {
            System.out.println("B");
        }
        else if (rawScore >= 70) {
            System.out.println("C");
        }
        else if (rawScore >= 60) {
            System.out.println("D");
        }
        else {
            System.out.println("You SUCK");
        }
    }
}
