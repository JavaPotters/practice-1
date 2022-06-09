package com.ironhack.practice_1.Classes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureHelperTest {

    private TemperatureHelper temperatureHelper;

    @BeforeEach
    void setUp() {
        System.out.println("Setup");
        temperatureHelper = new TemperatureHelper();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Tear Down");
    }

    @Test
    void fahrenheitToCelsius() {
        assertEquals(0, temperatureHelper.fahrenheitToCelsius(32));
        assertEquals(-17.78, temperatureHelper.fahrenheitToCelsius(0));
        assertEquals(-35.56, temperatureHelper.fahrenheitToCelsius(-32));
    }

    @Test
    void fahrenheitToKelvin() {
        assertEquals(273.15, temperatureHelper.fahrenheitToKelvin(32));
        assertEquals(255.37, temperatureHelper.fahrenheitToKelvin(0));
        assertEquals(237.59, temperatureHelper.fahrenheitToKelvin(-32));
    }

    @Test
    void celsiusToFahrenheit() {
        assertEquals(89.6, temperatureHelper.celsiusToFahrenheit(32));
        assertEquals(32, temperatureHelper.celsiusToFahrenheit(0));
        assertEquals(-25.6, temperatureHelper.celsiusToFahrenheit(-32));
    }

    @Test
    void celsiusToKelvin() {
        assertEquals(305.15, temperatureHelper.celsiusToKelvin(32));
        assertEquals(273.15, temperatureHelper.celsiusToKelvin(0));
        assertEquals(241.15, temperatureHelper.celsiusToKelvin(-32));
    }

    @Test
    void kelvinToFahrenheit() {
        assertEquals(-402.07, temperatureHelper.kelvinToFahrenheit(32));
        assertEquals(-459.67, temperatureHelper.kelvinToFahrenheit(0));
        assertEquals(-517.27, temperatureHelper.kelvinToFahrenheit(-32));
    }

    @Test
    void kelvinToCelsius() {
        assertEquals(-241.15, temperatureHelper.kelvinToCelsius(32));
        assertEquals(-273.15, temperatureHelper.kelvinToCelsius(0));
        assertEquals(-305.15, temperatureHelper.kelvinToCelsius(-32));
    }
}