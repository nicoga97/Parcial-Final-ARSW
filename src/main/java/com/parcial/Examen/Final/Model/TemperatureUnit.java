package com.parcial.Examen.Final.Model;

public class TemperatureUnit {

    public static float  FahrenheitToCelsius(float f) {

        return (f-32)*((float)5/(float)9);
    }

    public static float CelciusToFahrenheit(float c){
        return (c*((float)9/(float)5))+(float)32;
    }
}
