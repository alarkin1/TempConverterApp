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
public interface TempMeasurementStrategy {

    public abstract double convertTempFromCelsiusToThisType(double tempToConvertTo);
    
    public abstract double convertTempFromThisTypeToCelsius(double tempToConvertFrom);
    
    public abstract String getTempDescription();
    
}
