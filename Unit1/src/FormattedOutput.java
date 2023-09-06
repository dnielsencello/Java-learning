public class FormattedOutput {
    public static void main(String[] args) {
        double interest = 123.45678;

        System.out.println("You have paid $" + interest + " in interest");

        System.out.printf("You have paid $%6.2f in interest", interest);

        System.out.printf("\nYou have paid $%10.2f in interest", interest);

        System.out.printf("\nYou have paid $%-10.2f in interest", interest);

        int count = 6;
        double amout = 45.46;
        System.out.printf("\nThe count is %d and the amount is %4.2f.\n", count, amout);


    }
}