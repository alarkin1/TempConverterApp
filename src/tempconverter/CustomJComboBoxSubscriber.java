/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconverter;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Alex
 */
public class CustomJComboBoxSubscriber extends JComboBox implements Observer.Subscriber {

    @Override
    public final void updateData(ArrayList<String> listOfStrings) {
        setMaximumRowCount(listOfStrings.size());
        //http://stackoverflow.com/questions/4747020/how-to-update-jcombobox-content-from-arraylist
        setModel(new DefaultComboBoxModel(listOfStrings.toArray()));
    }

}
