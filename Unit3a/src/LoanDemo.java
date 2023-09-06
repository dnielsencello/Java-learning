import java.util.Scanner;

public class LoanDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter annual interest rate: ");
        double interestRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        Loan myLoan = new Loan(interestRate, numberOfYears, loanAmount);
        reportLoan(myLoan);
    }

    public static void reportLoan(Loan loan) {
        System.out.println();
        System.out.printf("The loan was created on    : %s\n", loan.getLoanDate());
        System.out.printf("   Monthly Payment         : %.2f\n", loan.getMonthlyPayment());
        System.out.printf("   Total Payment           : %.2f\n", loan.getTotalPayment());
    }
}
