package BankInfo;

import java.util.ArrayList;

/**
 * Created by Admin on 24.06.2017.
 */
public class Users {
    private String name, login, password;
    private ArrayList<CurrentLoan> currentLoans;
    private ArrayList<Loan> availableLoans;

    public Users(String name, String login, String password, ArrayList<CurrentLoan> currentLoans, ArrayList<Loan> availableLoans) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.currentLoans = currentLoans;
        this.availableLoans = availableLoans;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<CurrentLoan> getCurrentLoans() {
        return currentLoans;
    }

    public ArrayList<Loan> getAvailableLoans() {
        return availableLoans;
    }
}
