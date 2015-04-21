/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconverter;

import validatorutil.*;

/**
 *
 * @author Alex
 */
public class TempConverterService {

    public static final String NON_NUMERIC_TEMP_ENTERED_ERROR_MESSAGE = "You entered a non-numeric!";
    public static final String NULL_TEMP_ENTERED_ERROR_MESSAGE = "Enter a numberic value!";
    private TempMeasurementStrategy fromTempType;
    private TempMeasurementStrategy toTempType;
    private double newTemp;

    public final void convertTempAndReturnConvertedTemp(String tempToConvertStr) throws RuntimeException {
        ValidationUtility.notNullValidate(tempToConvertStr, NULL_TEMP_ENTERED_ERROR_MESSAGE);
        ValidationUtility.isDouble(tempToConvertStr, NON_NUMERIC_TEMP_ENTERED_ERROR_MESSAGE);
        double tempToConvert = Double.valueOf(tempToConvertStr);
        newTemp = toTempType.convertTempFromCelsiusToThisType(fromTempType.convertTempFromThisTypeToCelsius(tempToConvert));
    }

    public final void setFromTempType(TempMeasurementStrategy fromTempType) throws RuntimeException {
        if (ValidationUtility.notNullValidate(fromTempType)) {
            this.fromTempType = fromTempType;
        }
    }

    public final void setToTempType(TempMeasurementStrategy toTempType) throws RuntimeException {
        if (ValidationUtility.notNullValidate(toTempType)) {
            this.toTempType = toTempType;
        }
    }

    public final String getToTempDescription() {
        return toTempType.getTempDescription();
    }

    public double getConvertedTemp() {
        return newTemp;
    }

}
