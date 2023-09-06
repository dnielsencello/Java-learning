public class Loan {
    private double rate;
    private int termYears;
    private double amount;
    private java.util.Date loanDate;

    public Loan(double rate, int termYears, double amount) {
        this.rate = rate;
        this.termYears = termYears;
        this.amount = amount;
        this.loanDate = new java.util.Date();
    }

    public double getAnnualInterestRate() { return this.rate; }
    public double getTermLengthYears() { return this.termYears; }
    public double getLoanAmount() { return this.amount; }
    public java.util.Date getLoanDate() { return this.loanDate; }

    public double getMonthlyPayment() {
        double monthlyRate = this.rate / 1200;
        double payment = this.amount * monthlyRate /
                (1 - (1 / Math.pow(1 + monthlyRate, this.termYears * 12)));

        return payment;
    }

    public double getTotalPayment() {
        return getMonthlyPayment() * this.termYears * 12;
    }
}
