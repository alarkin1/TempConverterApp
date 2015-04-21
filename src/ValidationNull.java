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
public class ValidationNull implements ValidationStrategy {

    ArrayList dataToValidate;
    
    public ValidationNull(ArrayList dataValidate) throws RuntimeException{
        this.dataToValidate = dataValidate;
    }

    @Override
    public final ArrayList validate() throws RuntimeException{
        for (Object value : dataToValidate) {
            if (value == null) {
                throw new NullPointerException("Please Enter A Value That Isn't Invisible!");
            }
        }
        return dataToValidate;
    }
}