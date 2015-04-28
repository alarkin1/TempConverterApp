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
public class TempMeasurementFahrenheit implements TempMeasurementStrategy {

    private TempEnum tempEnumId;
    private String description;
    private String stringRepresntationOfStrategyObject;

    public TempMeasurementFahrenheit() {
        tempEnumId = TempEnum.FAHRENHEIT;
        description = " degrees Fahrenheit";
        stringRepresntationOfStrategyObject = "Fahrenheit";
    }

    @Override
    public final double convertTempFromCelsiusToThisType(double tempToThisType) {
        return (tempToThisType * 9 / 5) + 32;
    }

    @Override
    public final double convertTempFromThisTypeToCelsius(double tempFahrenheit) throws RuntimeException {
        double tempCelsius = 0;
        tempCelsius = (tempFahrenheit - 32) * 5 / 9;
        if (tempCelsius < GlobalVarsAndFinals.ABSOLUTE_ZERO_CELSIUS) {
            throw new RuntimeException(GlobalVarsAndFinals.BELOW_ABSOLUTE_ZERO_ERR_MESSAGE);
        }
        return tempCelsius;
    }

    @Override
    public final String getTempDescription() {
        return description;
    }

    @Override
    public final TempEnum getTempEnumId() {
        return tempEnumId;
    }

    @Override
    public final String toString() {
        return stringRepresntationOfStrategyObject;
    }

}
