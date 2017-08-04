package Converter.Currencies;

/**
 * Created by Admin on 05.05.2017.
 */
public class Currencies {
    private String name;
    private String key;
    private double multiplier;

    Currencies (String name, String key, double multiplier) {
        this.name = name;
        this.key = key;
        this.multiplier = multiplier;
    }

    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }

    public double getMultiplier() {
        return multiplier;
    }
}
