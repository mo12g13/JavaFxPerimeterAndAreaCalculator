package PerimeterandAreaCalculator;

import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

/**
 * Created by Momo Johnson on 10/21/2016.
 */
public class AreaPerimeterModule {


//A method that checks to make sure the textField isn't empty
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


     // A method that checks to make sure value can be converted to double.
    //If the input can't be converted to double, the is ask not to enter string.
    public boolean isDouble(TextField textField, String name){
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
