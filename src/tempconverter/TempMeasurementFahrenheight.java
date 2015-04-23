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

    private TempEnum tempEnumId = TempEnum.FAHRENHEIGHT;
    private String description = " degrees Fahrenheight";
    
    @Override
    public final double convertTempFromCelsiusToThisType(double tempToConvertTo) {
        return (tempToConvertTo  *  9/5) + 32;
    }

    @Override
    public final double convertTempFromThisTypeToCelsius(double tempToConvertFrom) {
        return (tempToConvertFrom - 32) * 5/9;
    }

    @Override
    public final String getTempDescription() {
        return description;
    }

    @Override
    public final TempEnum getTempEnumId() {
        return tempEnumId;
    }
    
}
