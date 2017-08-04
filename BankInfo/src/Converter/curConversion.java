package Converter;

import Converter.Currencies.*;

import java.util.ArrayList;

/**
 * Created by Admin on 05.05.2017.
 */
public class curConversion {

    public static double convesion (ArrayList<Currencies> currencies, Object primaryCur, Object finalCur, int value) {
        double mult1 = 0, mult2 = 0;
        double rezult = 0;
        int i = 0;
        boolean check;

        check = false;
        while (i < currencies.size() && check==false) {
            if (currencies.get(i).getName().equals(primaryCur)) {
                mult1 = currencies.get(i).getMultiplier();
            } else if (currencies.get(i).getName().equals(finalCur)) {
                mult2 = currencies.get(i).getMultiplier();
            }
            i++;
        }

        rezult = (Math.round(((value*mult1)/mult2)*100));
        rezult = rezult/100;

        return rezult;
    }


}
