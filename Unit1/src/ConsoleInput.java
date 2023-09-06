
import java.util.Scanner;
public class ConsoleInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a circle radius: ");

        double radius = input.nextDouble();
        double area = radius * radius * 3.14159;

        System.out.println("The area of a circle with radius " + radius + " is " + area);
    }
}