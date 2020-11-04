package edu.ucsd.cs110.temperature.edu.ucsd.cs110;

public class Fahrenheit extends Temperature{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius(((getValue() - 32) * 5)/9);
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(getValue());
    }

    public String toString()
    {
        // TODO: Complete this method
        String s = Float.toString(getValue());
        s = s.concat(" F");
        return s;
    }
}
