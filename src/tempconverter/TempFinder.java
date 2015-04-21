/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconverter;

import java.util.Map;
import validatorutil.*;

/**
 *
 * @author Alex
 */
public class TempFinder {

    private Map<TempEnum, TempMeasurementStrategy> mapOfTempMeasurementStrategy;

    public TempFinder(Map mapOfTempMeasurementStrategy) throws RuntimeException {
        ValidationUtility.notNullValidate(mapOfTempMeasurementStrategy, "message!");
        this.mapOfTempMeasurementStrategy = mapOfTempMeasurementStrategy;
    }

    public TempFinder() {
    }

    public final TempMeasurementStrategy returnTempMeasurementOnTempEnum(TempEnum tempEnum) throws RuntimeException {
        TempMeasurementStrategy output = mapOfTempMeasurementStrategy.get(tempEnum);
        ValidationUtility.notNullValidate(output, "message!");
        return output;
    }

    public final void addTempMeasurementToMap(TempMeasurementStrategy tempMeasurementStrategy) throws RuntimeException {
        ValidationUtility.notNullValidate(tempMeasurementStrategy, "message!");
        mapOfTempMeasurementStrategy.put(tempMeasurementStrategy.getTempMeasurementEnum(), tempMeasurementStrategy);
    }
}
