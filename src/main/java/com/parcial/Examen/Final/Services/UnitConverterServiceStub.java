package com.parcial.Examen.Final.Services;

import com.parcial.Examen.Final.Model.TemperatureUnit;
import org.springframework.stereotype.Service;

@Service
public class UnitConverterServiceStub implements  UnitConverterService{

    @Override
    public int convertCelciusToFahrenheit(int c) throws UnitConverterServiceException {
        int convertedValue;
        try{
            convertedValue=TemperatureUnit.CelciusToFahrenheit(c);
        }catch (Exception e){
            throw new UnitConverterServiceException("An error has ocurred while converting the value: "+e.getMessage());
        }

        return convertedValue ;
    }

    @Override
    public int convertFahrenheitToCelsius(int f) throws UnitConverterServiceException {
        int convertedValue;
        try{
            convertedValue=TemperatureUnit.FahrenheitToCelsius(f);
        }catch (Exception e){
            throw new UnitConverterServiceException("An error has ocurred while converting the value: "+e.getMessage());
        }
        return convertedValue;
    }
}
