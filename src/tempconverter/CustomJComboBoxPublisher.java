/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconverter;

import Observer.Subscriber;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class CustomJComboBoxPublisher implements Observer.Publisher {

    private ArrayList<Subscriber> arrayListOfSubscribers;

    public CustomJComboBoxPublisher() {
        arrayListOfSubscribers = new ArrayList<>();
    }

    @Override
    public final void addSubscriber(Subscriber subscriberToAdd) throws RuntimeException{
        validatorutil.ValidationUtility.notNullValidate(subscriberToAdd, GlobalVarsAndFinals.NULL_SUBSCRIBER_TO_BE_ADDED_ERR_MESSAGE);
        arrayListOfSubscribers.add(subscriberToAdd);
    }

    //No empty string check could be a good idea!  An empty String could be used for Flow Control inside of the Subscribers!
    @Override
    public final void pushDataToObservers(ArrayList<String> arrayListOfStrings) throws RuntimeException{
        validatorutil.ValidationUtility.notNullValidate(arrayListOfStrings, GlobalVarsAndFinals.NULL_DATA_TO_BE_PUSHED_TO_SUBSCRIBERS);
        for (Subscriber subscriber : arrayListOfSubscribers) {
            subscriber.updateData(arrayListOfStrings);
        }
    }

    @Override
    public final void removeSubsriber(Subscriber subscriberToRemove) throws RuntimeException{
        validatorutil.ValidationUtility.notNullValidate(subscriberToRemove, GlobalVarsAndFinals.NULL_SUBSCRIBER_TO_BE_REMOVED_ERR_MESSAGE);
        arrayListOfSubscribers.remove(subscriberToRemove);
    }

}
