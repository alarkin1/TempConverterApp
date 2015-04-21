/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class ValidationMinNum implements ValidationStrategy {

    ValidationStrategy validationStrategy;
    int minNum = 0;

    public ValidationMinNum(int minNum, ValidationStrategy validationStrategy) throws RuntimeException {
        if (validationStrategy == null) {
            throw new NullPointerException("Error message!");
        }
        this.minNum = minNum;
        this.validationStrategy = validationStrategy;
    }

    @Override
    public ArrayList validate() throws RuntimeException {
//        for (Object value : dataToValidate) {
//            if (value == null) {
//                throw new NullPointerException("Please Enter A Value That Isn't Invisible!");
//            }
//        }
        return validationStrategy.validate();
    }

}
