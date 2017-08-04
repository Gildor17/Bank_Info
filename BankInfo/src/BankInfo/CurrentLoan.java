package BankInfo;

/**
 * Created by Admin on 24.06.2017.
 */
public class CurrentLoan {

    private String name;
    private int loanValueLeft, loanMonthLeft, loanPayDate, loanMonthlyPayValue;
    private double percentPenaltyBet;

    public CurrentLoan(String name, int loanValueLeft, int loanMonthLeft, int loanPayDate, int loanMonthlyPayValue, double percentPenaltyBet) {
        this.name = name;
        this.loanValueLeft = loanValueLeft;
        this.loanMonthLeft = loanMonthLeft;
        this.loanPayDate = loanPayDate;
        this.loanMonthlyPayValue = loanMonthlyPayValue;
        this.percentPenaltyBet = percentPenaltyBet;
    }

    public String getName() {
        return name;
    }

    public int getLoanValueLeft() {
        return loanValueLeft;
    }

    public int getLoanMonthLeft() {
        return loanMonthLeft;
    }

    public int getLoanPayDate() {
        return loanPayDate;
    }

    public int getLoanMonthlyPayValue() {
        return loanMonthlyPayValue;
    }

    public double getPercentPenaltyBet() {
        return percentPenaltyBet;
    }
}
