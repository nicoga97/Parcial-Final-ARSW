package com.parcial.Examen.Final.Model;

public class TemperatureUnit {

    public static int  FahrenheitToCelsius(int f){
        return (f-32)*(5/9);
    }

    public static int CelciusToFahrenheit(int c){
        return (c*(9/5))+32;
    }
}
