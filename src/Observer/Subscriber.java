/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public interface Subscriber {
    public abstract void updateData(ArrayList<String> listOfStrings);
}