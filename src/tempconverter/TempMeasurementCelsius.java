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
public class TempMeasurementCelsius implements TempMeasurementStrategy {

    private String description = " degrees Celsius";

    @Override
    public double convertTempFromCelsiusToThisType(double tempToConvert) {
        return tempToConvert;
    }

    @Override
    public double convertTempFromThisTypeToCelsius(double tempToConvert) {
        return tempToConvert;
    }

    @Override
    public String getTempDescription() {
        return description;
    }
}
