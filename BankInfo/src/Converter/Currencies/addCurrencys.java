package Converter.Currencies;

import java.util.ArrayList;

/**
 * Created by Admin on 05.05.2017.
 */
public class addCurrencys {

    public static ArrayList createArray () {

        Currencies dollar = new Currencies("Доллар", "usd", 26.025695);
        Currencies euro = new Currencies("Євро", "eur", 29.068099);
//        Currencies rybel = new Currencies("rybel", "rub", 0.3);
        Currencies grivna = new Currencies("Гривня", "uah", 1);
        Currencies zlotui = new Currencies("Злотий", "PLN", 6.85536);
        Currencies Jena = new Currencies("Єна", "JPY", 0.2339108);
        Currencies Tenge = new Currencies("Теньге", "KZT", 0.079436);

/***
 <txt>Теньге</txt>
 <rate>0.079436</rate>
 <cc>KZT</cc>

 ***/

        ArrayList<Currencies> currens = new ArrayList<>();
        currens.add(dollar);
        currens.add(euro);
//        currens.add(rybel);
        currens.add(grivna);
        currens.add(zlotui);
        currens.add(Jena);
        currens.add(Tenge);

        return currens;
    }

}
