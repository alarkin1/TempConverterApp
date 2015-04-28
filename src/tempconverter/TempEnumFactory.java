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
public class TempEnumFactory {

    public final TempEnum returnTempEnumViaStringParam(String tempStr) throws IllegalArgumentException {
        TempEnum output = null;
        try {
            output = TempEnum.valueOf(tempStr.toUpperCase());
        } catch (IllegalArgumentException iae) {
            throw new IllegalArgumentException(GlobalVarsAndFinals.UNHANDLED_TEMP_ERR_MESSAGE);
        }
        return output;
    }
}
