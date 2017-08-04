package BankInfo;

import BankInfo.*;

import java.util.ArrayList;

/**
 * Created by Admin on 19.06.2017.
 */
public class AddLoan {

    public static Loan lite = new Loan("Легка", 100, 2000, 4, 12, 3, 0.4);
    public static Loan optimal = new Loan("Оптимальна", 1000, 10000, 6, 24, 2, 0.25);
    public static Loan extra1 = new Loan("Екстра-1", 2000, 12000, 12, 36, 4, 0.3);
    public static Loan extra2 = new Loan("Екстра-2", 3000, 25000, 8, 48, 5, 0.2);
    public static Loan widesize = new Loan("Обширна", 1000, 50000, 6, 36, 7, 0.5);

    public static ArrayList<Loan> volodia1AvailableLoans = new ArrayList<>();
    public static ArrayList<Loan> tatiana1AvailableLoans = new ArrayList<>();
    public static ArrayList<Loan> iruna1AvailableLoans = new ArrayList<>();
    public static ArrayList<Loan> ivan1AvailableLoans = new ArrayList<>();

    public static ArrayList<CurrentLoan> volodia1CurrentLoans = new ArrayList<>();
    public static ArrayList<CurrentLoan> tatiana1CurrentLoans = new ArrayList<>();
    public static ArrayList<CurrentLoan> iruna1CurrentLoans = new ArrayList<>();
    public static ArrayList<CurrentLoan> ivan1CurrentLoans = new ArrayList<>();

    public static void addAvailableLoans () {

            volodia1AvailableLoans.add(lite);
            volodia1AvailableLoans.add(extra1);
            volodia1AvailableLoans.add(extra2);

            tatiana1AvailableLoans.add(lite);
            tatiana1AvailableLoans.add(optimal);
            tatiana1AvailableLoans.add(extra1);

            iruna1AvailableLoans.add(lite);
            iruna1AvailableLoans.add(optimal);
            iruna1AvailableLoans.add(extra1);
            iruna1AvailableLoans.add(extra2);
            iruna1AvailableLoans.add(widesize);

            ivan1AvailableLoans.add(extra2);
            ivan1AvailableLoans.add(widesize);

    }

    public static CurrentLoan volodiaCurrentLoan1 = new CurrentLoan ("volodia1", 7200, 6, 17, 1200, 1.5);
    public static CurrentLoan tatianaCurrentLoan1 = new CurrentLoan ("tatiana1", 5000, 5, 25, 1000, 1);
    public static CurrentLoan tatianaCurrentLoan2 = new CurrentLoan ("tatiana2", 800, 2, 8, 400, 2);
    public static CurrentLoan irunaCurrentLoan1 = new CurrentLoan ("iruna1", 4800, 3, 18, 1600, 0.7);
    public static CurrentLoan ivanCurrentLoan1 = new CurrentLoan ("ivan1", 1500, 3, 12, 500, 1);
    public static CurrentLoan ivanCurrentLoan2 = new CurrentLoan ("ivan2", 8000, 4, 17, 2000, 1.2);

    public static void addCurrentLoans () {

        volodia1CurrentLoans.add(volodiaCurrentLoan1);
        tatiana1CurrentLoans.add(tatianaCurrentLoan1);
        tatiana1CurrentLoans.add(tatianaCurrentLoan2);
        iruna1CurrentLoans.add(irunaCurrentLoan1);
        ivan1CurrentLoans.add(ivanCurrentLoan1);
        ivan1CurrentLoans.add(ivanCurrentLoan2);

    }
}
