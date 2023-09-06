import java.util.Scanner;

public class Datatype {
    public static void main(String[] args) {
//The String Type, Concatenating Strings
//        String s1 = "This is a ";
//        String s2 = "String example.";
//        String s3 = s1 + s2;
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);

        Scanner input = new Scanner(System.in);
//Reading Strings from console
//        System.out.print("Enter three words: ");
//        String s1 = input.next();
//        String s2 = input.next();
//        String s3 = input.next();
//        System.out.println("The three words are: " + s1 + ", " + s2 + ", " + s3);

//        System.out.println("Enter a line of text: ");
//        String line = input.nextLine();
//        System.out.println("This is your line: " + line)
//Comparing Strings
//        System.out.println("Enter a word: ");
//        String userInput = input.next();
//
//
//        String s1 = "one";
//        String s2 = "one";
//
//        if(s1.equals(userInput)) {
//            System.out.println("The strings are equal");
//        }
//        else {
//            System.out.println("The strings are not equal");
//        }
        String numberAsString = "1234";
        int value = Integer.parseInt(numberAsString);

        value = value + 2;
        System.out.println("This is your number: " + value);

        String numberAsString2 = "1234.56";
        double value2 = Double.parseDouble(numberAsString2);
        value2 = value2 + 0.02;
        System.out.println("This is your other number: " + value2);

    }
}