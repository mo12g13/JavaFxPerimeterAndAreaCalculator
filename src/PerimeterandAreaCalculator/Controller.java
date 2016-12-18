package PerimeterandAreaCalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
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

    public void btnCalculate(ActionEvent e){
        if(isValidData()){
            double length = Double.parseDouble(txtLength.getText());
            double width = Double.parseDouble(txtWidth.getText());
            txtArea.setText(String.format("%.2f", (length*width)));
            txtPerimeter.setText(String.format("%.2f", (length*2)+(width*2)));
            txtLength.requestFocus();


        }

    }
    public void btnExit(ActionEvent e){
        System.exit(0);
    }

    public void btnClear(){
        //boolean checkValue = areaPerimeterModule.isCheckBoxSelected(chkHamburger, "Hamburger");

        txtPerimeter.setText("");
        txtArea.setText("");
        txtLength.setText("");
        txtWidth.setText("");
        txtLength.requestFocus();
    }

    private boolean isValidData(){
        if(!areaPerimeterModule.isPresent(txtLength, "Length")){
            return false;
        }
        if(!areaPerimeterModule.isValidData(txtLength, "Length")){
            return false;
        }

        if(!areaPerimeterModule.isPresent(txtWidth, "Width")){
            return false;
        }
        if(!areaPerimeterModule.isValidData(txtWidth, "Width")){
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
