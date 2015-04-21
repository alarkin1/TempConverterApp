/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validatorutil;

/**
 *
 * @author Alex
 */
public class ValidationUtility {

    
    /*All even methods do not return any value!  They instead throw an exception to the calling entity.  
    The methods that don't return a value can also be identified by looking at the parameters of the method.
    Methods that don't return anything have a message parameter!
    */
    
    public static final boolean notNullValidate(Object objToValidate) {
        if (objToValidate == null) {
            return false;
        }
        return true;
    }

    public static final boolean notNullValidate(Object objToValidate, String message) throws RuntimeException{
        if (message == null || message.isEmpty()) {
            throw new ValidatorUtilUserDefinedExceptions(ValidatorUtilInternalErrorMessages.NULL_OR_EMPTY_MESSAGE_ERROR_MESSAGE);
        }
        if (objToValidate == null) {
            throw new ValidatorUtilUserDefinedExceptions(message);
        }
        return true;
    }

    public static final boolean notLessThanMinValValidate(double val, double minVal) {
        if (val < minVal) {
            return false;
        }
        return true;
    }

    public static final boolean notLessThanMinValValidate(double val, double minVal, String message) throws RuntimeException {
        if (message == null || message.isEmpty()) {
            throw new ValidatorUtilUserDefinedExceptions(ValidatorUtilInternalErrorMessages.NULL_OR_EMPTY_MESSAGE_ERROR_MESSAGE);
        }
        if (val < minVal) {
            throw new ValidatorUtilUserDefinedExceptions(message);
        }
        return true;
    }

    public static final boolean notGreaterThanMaxValValidate(double val, double maxVal) {
        if (val > maxVal) {
            return false;
        }
        return true;
    }

    public static final boolean notGreaterThanMaxValValidate(double val, double maxVal, String message) throws RuntimeException {
        if (message == null || message.isEmpty()) {
            throw new ValidatorUtilUserDefinedExceptions(ValidatorUtilInternalErrorMessages.NULL_OR_EMPTY_MESSAGE_ERROR_MESSAGE);
        }
        if (val > maxVal) {
            throw new ValidatorUtilUserDefinedExceptions(message);
        }
        return true;
    }

    public static final boolean notMinValValidate(double val, double minVal) {
        if (val < minVal) {
            return false;
        }
        return true;
    }

    public static final boolean notMinValValidate(double val, double minVal, String message) throws RuntimeException {
        if (message == null || message.isEmpty()) {
            throw new ValidatorUtilUserDefinedExceptions(ValidatorUtilInternalErrorMessages.NULL_OR_EMPTY_MESSAGE_ERROR_MESSAGE);
        }
        if (val < minVal) {
            throw new ValidatorUtilUserDefinedExceptions(message);
        }
        return true;
    }

    public static final boolean isInt(String val) {
        try {
            Integer.parseInt(val);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static final boolean isInt(String val, String message) throws RuntimeException {
        if (message == null || message.isEmpty()) {
            throw new ValidatorUtilUserDefinedExceptions(ValidatorUtilInternalErrorMessages.NULL_OR_EMPTY_MESSAGE_ERROR_MESSAGE);
        }
        try {
            Integer.parseInt(val);
        } catch (NumberFormatException nfe) {
            throw new ValidatorUtilUserDefinedExceptions(message);
        }
        return true;
    }

    public static final boolean isDouble(String val) {
        try {
            Double.parseDouble(val);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static final boolean isDouble(String val, String message) throws RuntimeException {
        if (message == null || message.isEmpty()) {
            throw new ValidatorUtilUserDefinedExceptions(ValidatorUtilInternalErrorMessages.NULL_OR_EMPTY_MESSAGE_ERROR_MESSAGE);
        }
        try {
            Double.parseDouble(val);
        } catch (NumberFormatException nfe) {
            throw new ValidatorUtilUserDefinedExceptions(message);
        }
        return true;
    }

    public static final boolean isLong(String val) {
        try {
            Long.parseLong(val);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static final boolean isLong(String val, String message) throws RuntimeException {
        if (message == null || message.isEmpty()) {
            throw new ValidatorUtilUserDefinedExceptions(ValidatorUtilInternalErrorMessages.NULL_OR_EMPTY_MESSAGE_ERROR_MESSAGE);
        }
        try {
            Long.parseLong(val);
        } catch (NumberFormatException nfe) {
            throw new ValidatorUtilUserDefinedExceptions(message);
        }
        return true;
    }

    public static final boolean isWithinMinAndMaxRange(double val, double minRange, double maxRange) {
        if (minRange > val || val > maxRange) {
            return false;
        }
        return true;
    }

    public static final boolean isWithinMinAndMaxRange(double val, double minRange, double maxRange, String message) throws RuntimeException {
        if (message == null || message.isEmpty()) {
            throw new ValidatorUtilUserDefinedExceptions(ValidatorUtilInternalErrorMessages.NULL_OR_EMPTY_MESSAGE_ERROR_MESSAGE);
        }
        if (minRange > val || val > maxRange) {
            throw new ValidatorUtilUserDefinedExceptions(message);
        }
        return true;
    }
}