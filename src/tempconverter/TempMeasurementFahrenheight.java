/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconverter;

/**
 *
 * @author Alex
 */
public class TempMeasurementFahrenheight implements TempMeasurementStrategy{

    private String description = " degrees Fahrenheight";
    
    @Override
    public double convertTempFromCelsiusToThisType(double tempToConvertTo) {
        return (tempToConvertTo  *  9/5) + 32;
    }

    @Override
    public double convertTempFromThisTypeToCelsius(double tempToConvertFrom) {
        return (tempToConvertFrom * 5/9) + 32;
    }

    @Override
    public String getTempDescription() {
        return description;
    }
    
}
