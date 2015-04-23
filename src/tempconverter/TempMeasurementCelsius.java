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

    private TempEnum tempEnumId = TempEnum.CELSIUS;
    private String description = " degrees Celsius";

    @Override
    public final double convertTempFromCelsiusToThisType(double tempToConvert) {
        return tempToConvert;
    }

    @Override
    public final double convertTempFromThisTypeToCelsius(double tempToConvert) {
        return tempToConvert;
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
