package com.ironhack.practice_1.Classes;

public class TemperatureHelper {

    private double temperatureFahrenheit;
    private double temperatureCelsius;
    private double temperatureKelvin;

    // Constructor method
    public TemperatureHelper() {

    }

    public double getTemperatureFahrenheit() {
        return temperatureFahrenheit;
    }

    public void setTemperatureFahrenheit(double temperatureFahrenheit) {
        this.temperatureFahrenheit = temperatureFahrenheit;
    }

    public double getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public void setTemperatureCelsius(double temperatureCelsius) {
        this.temperatureCelsius = temperatureCelsius;
    }

    public double getTemperatureKelvin() {
        return temperatureKelvin;
    }

    public void setTemperatureKelvin(double temperatureKelvin) {
       if (temperatureKelvin >= 0) {
            this.temperatureKelvin = temperatureKelvin;
        } else {
            this.temperatureKelvin = 0;
        }
    }

    // Methods

    public double fahrenheitToCelsius (double temperatureFahrenheit) {
        double temperatureCelsius;
        temperatureCelsius = (temperatureFahrenheit-32)*(5.0/9.0);
        return Math.round(temperatureCelsius*100.0)/100.0;
    }

    public double fahrenheitToKelvin (double temperatureFahrenheit) {
        double temperatureKelvin;
        temperatureKelvin = ((temperatureFahrenheit-32)*(5.0/9.0)) + 273.15;
        return Math.round(temperatureKelvin*100.0)/100.0;
    }

    public double celsiusToFahrenheit (double temperatureCelsius) {
        double temperatureFahrenheit;
        temperatureFahrenheit = (temperatureCelsius*(9.0/5.0))+32;
        return Math.round(temperatureFahrenheit*100.0)/100.0;
    }

    public double celsiusToKelvin (double temperatureCelsius) {
        double temperatureKelvin;
        temperatureKelvin = (temperatureCelsius+273.15);
        return Math.round(temperatureKelvin*100.0)/100.0;
    }

    public double kelvinToFahrenheit (double temperatureKelvin) {
        double temperatureFahrenheit;
        temperatureFahrenheit = ((temperatureKelvin-273.15)*(9.0/5.0))+32;
        return Math.round(temperatureFahrenheit*100.0)/100.0;
    }

    public double kelvinToCelsius (double temperatureKelvin) {
        double temperatureCelsius;
        temperatureCelsius = (temperatureKelvin-273.15);
        return Math.round(temperatureCelsius*100.0)/100.0;
    }

}

