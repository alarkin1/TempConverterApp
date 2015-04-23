/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconverter;

import Observer.Publisher;
import Observer.Subscriber;
import java.util.LinkedHashMap;
import validatorutil.*;

/**
 *
 * @author Alex
 */
public class TempConverterService {

    public static final String NON_NUMERIC_TEMP_ENTERED_ERROR_MESSAGE = "You entered a non-numeric!";
    public static final String NULL_TEMP_ENTERED_ERROR_MESSAGE = "Enter a numeric value!";
    public static final String NULL_TEMP_STRAT_OBJ_ERROR_MESSAGE = "Cannot handle null TempMeasurement!";
    private double newTemp;
    private Publisher customJComboBoxPublisher;
    private TempMeasureArrayListToStringArrayListFactory tempMeasureArrayListToStringArrayListFactory;
    private LinkedHashMap<TempEnum, TempMeasurementStrategy> mapOfAllTempMeasurements;
    private TempMeasurementStrategyFactory tempMeasurementStrategyFactory;
    private TempMeasurementStrategy fromTempType;
    private TempMeasurementStrategy toTempType;

    public TempConverterService() {
        tempMeasureArrayListToStringArrayListFactory = new TempMeasureArrayListToStringArrayListFactory();
        tempMeasurementStrategyFactory = new TempMeasurementStrategyFactory();
        mapOfAllTempMeasurements = new LinkedHashMap<>();
        customJComboBoxPublisher = new CustomJComboBoxPublisher();
    }

    public final void convertTempAndReturnConvertedTemp(String tempToConvertStr) throws RuntimeException {
        ValidationUtility.notNullValidate(tempToConvertStr, NULL_TEMP_ENTERED_ERROR_MESSAGE);
        ValidationUtility.isDouble(tempToConvertStr, NON_NUMERIC_TEMP_ENTERED_ERROR_MESSAGE);
        double tempToConvert = Double.valueOf(tempToConvertStr);
        newTemp = toTempType.convertTempFromCelsiusToThisType(fromTempType.convertTempFromThisTypeToCelsius(tempToConvert));
    }

    public final void setFromTempType(TempEnum fromTempEnum) throws RuntimeException {
        this.fromTempType = tempMeasurementStrategyFactory.returnTempMeasurmentStrategyViaEnum(fromTempEnum, mapOfAllTempMeasurements);
    }

    public final void setToTempType(TempEnum toTempEnum) throws RuntimeException {
        this.toTempType = tempMeasurementStrategyFactory.returnTempMeasurmentStrategyViaEnum(toTempEnum, mapOfAllTempMeasurements);
    }

    public final String getToTempDescription() {
        return toTempType.getTempDescription();
    }

    public final double getConvertedTemp() {
        return newTemp;
    }

    public final void addTempMeasurement(TempMeasurementStrategy newTempMeasurementStrategy) throws RuntimeException {
        ValidationUtility.notNullValidate(newTempMeasurementStrategy, NULL_TEMP_STRAT_OBJ_ERROR_MESSAGE);
        mapOfAllTempMeasurements.put(newTempMeasurementStrategy.getTempEnumId(), newTempMeasurementStrategy);
        customJComboBoxPublisher.pushDataToObservers(tempMeasureArrayListToStringArrayListFactory.extractStringRepresntationsFromMap(mapOfAllTempMeasurements));
    }

    public final void removeTempMeasurement(TempMeasurementStrategy newTempMeasurementStrategy) throws RuntimeException {
        ValidationUtility.notNullValidate(newTempMeasurementStrategy, NULL_TEMP_STRAT_OBJ_ERROR_MESSAGE);
        mapOfAllTempMeasurements.remove(newTempMeasurementStrategy.getTempEnumId(), newTempMeasurementStrategy);
        customJComboBoxPublisher.pushDataToObservers(tempMeasureArrayListToStringArrayListFactory.extractStringRepresntationsFromMap(mapOfAllTempMeasurements));
    }

    public final void addSubscriberToJComboBoxPublisher(Subscriber subscriber) {
        customJComboBoxPublisher.addSubscriber(subscriber);
    }

    public final void removeSubscriberFromJComboBoxPublisher(Subscriber subscriber) {
        customJComboBoxPublisher.removeSubsriber(subscriber);
    }
}
