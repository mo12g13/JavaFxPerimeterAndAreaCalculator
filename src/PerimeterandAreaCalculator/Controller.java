package PerimeterandAreaCalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable{
    private int getNumber;

    @FXML
    private TextField txtWidth;
    @FXML
    private Button btnCalculate;
    @FXML
    private TextField txtLength;
    @FXML
    private TextField txtArea;
    @FXML
    private TextField txtPerimeter;
    @FXML
    private Button btnExit;

    private AreaPerimeterModule areaPerimeterModule = new AreaPerimeterModule();
    //An action event that calculates the perimeter and area
    public void btnCalculate(ActionEvent e){
        if(isValidData()){
            double length = Double.parseDouble(txtLength.getText());
            double width = Double.parseDouble(txtWidth.getText());
            txtArea.setText(String.format("%.2f", (length*width)));
            txtPerimeter.setText(String.format("%.2f", (length*2)+(width*2)));
            txtLength.requestFocus();
        }

    }
    //An action event that clears the form
    public void btnExit(ActionEvent e){
        System.exit(0);
    }

    //An action event that clears the value in various control
    public void btnClear(){
        txtPerimeter.setText("");
        txtArea.setText("");
        txtLength.setText("");
        txtWidth.setText("");
        txtLength.requestFocus();
    }
    // A method that validates the input entered by the user
    private boolean isValidData(){
        if(!areaPerimeterModule.isPresent(txtLength, "Length")){
            return false;
        }
        if(!areaPerimeterModule.isDouble(txtLength, "Length")){
            return false;
        }

        if(!areaPerimeterModule.isPresent(txtWidth, "Width")){
            return false;
        }
        if(!areaPerimeterModule.isDouble(txtWidth, "Width")){
            return false;
        }
        return true;
    }




    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnCalculate.setDefaultButton(true);
        btnExit.setCancelButton(true);

            txtLength.textProperty().addListener(a->{
                txtPerimeter.setText("");
                txtArea.setText("");
            });
        txtWidth.textProperty().addListener(e->{
            txtArea.setText("");
            txtPerimeter.setText("");
        });


    }
}
