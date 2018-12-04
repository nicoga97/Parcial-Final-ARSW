package com.parcial.Examen.Final.RestControllers;

import com.parcial.Examen.Final.Services.UnitConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class UnitConverterAPIController {


    @Autowired
    private UnitConverterService service;


    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/FahrenheitToCelsius/{f}", method = RequestMethod.GET)
    public ResponseEntity<?> manejadorConverterFahrenheitToCelsius(@PathVariable("f") int f) {
        try {

            return new ResponseEntity<>(service.convertFahrenheitToCelsius(f), HttpStatus.ACCEPTED);
        } catch (Exception ex) {

            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/CelciusToFahrenheit/{c}", method = RequestMethod.GET)
    public ResponseEntity<?> manejadorConverterCelciusToFahrenheit(@PathVariable("c") int c) {
        try {

            return new ResponseEntity<>(service.convertCelciusToFahrenheit(c), HttpStatus.ACCEPTED);
        } catch (Exception ex) {

            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
