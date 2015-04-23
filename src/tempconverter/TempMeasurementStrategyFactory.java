/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconverter;

import java.util.LinkedHashMap;
import validatorutil.*;
/**
 *
 * @author Alex
 */
public class TempMeasurementStrategyFactory {

    public final TempMeasurementStrategy returnTempMeasurmentStrategyViaEnum(TempEnum tempEnum, LinkedHashMap<TempEnum, TempMeasurementStrategy> allTempMeasurementStrategies) throws RuntimeException {
        TempMeasurementStrategy output = allTempMeasurementStrategies.get(tempEnum);
        System.out.println(allTempMeasurementStrategies);
        ValidationUtility.notNullValidate(output, "Temperature Unsupported!");
        return output;
    }
}
