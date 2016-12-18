package PerimeterandAreaCalculator;

import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

/**
 * Created by Momo Johnson on 10/21/2016.
 */
public class AreaPerimeterModule {



   public boolean isPresent(TextField textField, String name){
        if(textField.getText().equals("")){
            Alert alert = new Alert(Alert.AlertType.ERROR);


            alert.setTitle("Input Error!!");
            alert.setContentText(name + " is a required field");

            alert.showAndWait();
            textField.requestFocus();
            textField.clear();
            return false;
        }else {
            return true;
        }

    }
    public  boolean isCheckBoxSelected(CheckBox checkBox, String name)
    {

        if(checkBox.isSelected())
        {

            return  true;
        }
        else {
            return false;
        }
    }
    public boolean isValidData(TextField textField, String name){
        try {
            if (Double.parseDouble(textField.getText()) > 0) {
                return true;
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR, name + "must be number above zero");
                textField.requestFocus();
                textField.clear();
                return false;
            }
        }catch (NumberFormatException exe){
            Alert alert = new Alert(Alert.AlertType.ERROR, name + " shouldn't be a letter");
            alert.showAndWait();
            textField.requestFocus();
            textField.clear();
            return false;
        }

    }

}
