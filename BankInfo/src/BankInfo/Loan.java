package BankInfo;

/**
 * Created by Admin on 15.06.2017.
 */
public class Loan {

    private String name;
    private int loanMinValue, loanMaxValue, loanMinMonthLenght, loanMaxMonthLenght;
    private double percentBet, percentBetPMonth;

    public Loan(String name, int loanMinValue, int loanMaxValue, int loanMinMonthLenght, int loanMaxMonthLenght, double percentBet, double percentBetPMonth) {
        this.name = name;
        this.loanMinValue = loanMinValue;
        this.loanMaxValue = loanMaxValue;
        this.loanMinMonthLenght = loanMinMonthLenght;
        this.loanMaxMonthLenght = loanMaxMonthLenght;
        this.percentBet = percentBet;
        this.percentBetPMonth = percentBetPMonth;
    }

    public String getName() {
        return name;
    }

    public int getLoanMinValue() {
        return loanMinValue;
    }

    public int getLoanMaxValue() {
        return loanMaxValue;
    }

    public int getLoanMinMonthLenght() {
        return loanMinMonthLenght;
    }

    public int getLoanMaxMonthLenght() {
        return loanMaxMonthLenght;
    }

    public double getPercentBet() {
        return percentBet;
    }

    public double getPercentBetPMonth() {
        return percentBetPMonth;
    }
}
