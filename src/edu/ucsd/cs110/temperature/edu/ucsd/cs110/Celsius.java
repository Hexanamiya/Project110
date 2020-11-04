package edu.ucsd.cs110.temperature.edu.ucsd.cs110;

public class Celsius extends Temperature{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius(getValue());
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(((getValue()*9)/5) + 32);
    }

    public String toString()
    {
        // TODO: Complete this method
        String s = Float.toString(getValue());
        s = s.concat(" C");
        return s;
    }
}
