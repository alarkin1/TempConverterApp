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
public class GlobalVarsAndFinals {

    public static final double ABSOLUTE_ZERO_CELSIUS = -257.15;
    public static final String UNHANDLED_TEMP_ERR_MESSAGE = "The temperature measurement being requested is not supported!";
    public static final String BELOW_ABSOLUTE_ZERO_ERR_MESSAGE = "You cannot get any colder than absolute zero!";
    public static final String NON_NUMERIC_TEMP_ENTERED_ERROR_MESSAGE = "You entered a non-numeric!";
    public static final String NULL_TEMP_ENTERED_ERROR_MESSAGE = "Enter a numeric value!";
    public static final String NULL_TEMP_STRAT_OBJ_ERROR_MESSAGE = "Cannot handle null TempMeasurement!";
    public static final String NULL_SUBSCRIBER_TO_BE_REMOVED_ERR_MESSAGE = "Null subscriber passed in to be removed!";
    public static final String NULL_SUBSCRIBER_TO_BE_ADDED_ERR_MESSAGE = "Null subscriber passed in to be added!";
    public static final String NULL_DATA_TO_BE_PUSHED_TO_SUBSCRIBERS = "Null data to be pushed to subscribers!";
    public static final String TEMP_OUTPUT_FORMAT = "#.00";
}
