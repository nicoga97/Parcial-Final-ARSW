package com.parcial.Examen.Final.Services;

import com.parcial.Examen.Final.Model.TemperatureUnit;
import org.springframework.stereotype.Service;

@Service
public class UnitConverterServiceStub implements  UnitConverterService{

    @Override
    public float convertCelciusToFahrenheit(float c) throws UnitConverterServiceException {
        float convertedValue;
        try{
            convertedValue=TemperatureUnit.CelciusToFahrenheit(c);
        }catch (Exception e){
            throw new UnitConverterServiceException("An error has ocurred while converting the value: "+e.getMessage());
        }

        return convertedValue ;
    }

    @Override
    public float convertFahrenheitToCelsius(float f) throws UnitConverterServiceException {
        float convertedValue;
        try{
            convertedValue=TemperatureUnit.FahrenheitToCelsius(f);

        }catch (Exception e){
            throw new UnitConverterServiceException("An error has ocurred while converting the value: "+e.getMessage());
        }
        return convertedValue;
    }
}
