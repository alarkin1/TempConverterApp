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

    private TempEnum tempEnumId;
    private String description;
    private String stringRepresntationOfStrategyObject;

    public TempMeasurementCelsius() {
        tempEnumId = TempEnum.CELSIUS;
        description = " degrees Celsius";
        stringRepresntationOfStrategyObject = "Celsius";
    }

    @Override
    public final double convertTempFromCelsiusToThisType(double tempCelsius) throws RuntimeException {
        if (tempCelsius < GlobalVarsAndFinals.ABSOLUTE_ZERO_CELSIUS) {
            throw new RuntimeException(GlobalVarsAndFinals.BELOW_ABSOLUTE_ZERO_ERR_MESSAGE);
        }
        return tempCelsius;
    }

    @Override
    public final double convertTempFromThisTypeToCelsius(double tempCelsius) throws RuntimeException {
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
