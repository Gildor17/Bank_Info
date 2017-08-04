package BankInfo;

import BankInfo.*;

import java.util.ArrayList;

/**
 * Created by Admin on 24.06.2017.
 */
public class AddUsers {

    public static Users volodia1 = new Users("", "Volodia1", "v01", AddLoan.volodia1CurrentLoans, AddLoan.volodia1AvailableLoans);
    public static Users tatiana1 = new Users("", "Tatiana1", "t01", AddLoan.tatiana1CurrentLoans, AddLoan.tatiana1AvailableLoans);
    public static Users iruna1 = new Users("", "Iruna1", "i01", AddLoan.iruna1CurrentLoans, AddLoan.iruna1AvailableLoans);
    public static Users ivan1 = new Users("", "Ivan1", "i01", AddLoan.ivan1CurrentLoans, AddLoan.ivan1AvailableLoans);

    static ArrayList<Users> users = new ArrayList<>();

    public static ArrayList addUsers () {

        users.add(volodia1);
        users.add(tatiana1);
        users.add(iruna1);
        users.add(ivan1);

        return users;
    }

    public static ArrayList<Users> getUsers() {
        return users;
    }
}
