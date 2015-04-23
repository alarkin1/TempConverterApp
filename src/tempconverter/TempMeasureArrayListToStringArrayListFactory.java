/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconverter;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author Alex
 */
public class TempMeasureArrayListToStringArrayListFactory {

    public final ArrayList<String> extractStringRepresntationsFromMap(Map<TempEnum, TempMeasurementStrategy> mapOfTempMeasurementStratObj) {
        ArrayList<TempMeasurementStrategy> listOfTempMeasureStratObjects = new ArrayList<>(mapOfTempMeasurementStratObj.values());
        ArrayList<String> listOfTempMeasureStratObjectToString = new ArrayList<>();
        for (TempMeasurementStrategy stratObj : listOfTempMeasureStratObjects) {
             listOfTempMeasureStratObjectToString.add(stratObj.toString());
        }
        return listOfTempMeasureStratObjectToString;
    }
}
