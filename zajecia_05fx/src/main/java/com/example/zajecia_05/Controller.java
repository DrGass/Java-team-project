package com.example.zajecia_05;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
    @FXML
    public TextField idName;
    public TextField idSurname;
    public TextField idAge;
    public TextArea idTextArea;
    public CheckBox idCheckBox;
    public Button idButton;
    public TextField idSpec;

    @FXML
    public void activateText(ActionEvent actionEvent){
        idSpec.setDisable(!idCheckBox.isSelected());
    }

    @FXML
    public void insertText(ActionEvent actionEvent) {
        String name = idName.getText();
        String surname = idSurname.getText();
        String age = idAge.getText();
        if (ValidationStr(idName) || ValidationStr(idSurname) || ValidationInt(idAge))
            return;
        if (idCheckBox.isSelected()){
            String Spec = idSpec.getText();
            if (ValidationStr(idSpec)) return;
            Student student = new Student(name, surname, age, Spec);
            idTextArea.setText(student.toString());
        }
        else {
            Person person = new Person(name,surname,age);
            idTextArea.setText(person.toString());
        }
    }

    public boolean ValidationStr(TextField textField){
        if (!textField.getText().matches("[a-zA-z_]+")){
            textField.setStyle("-fx-background-color: red;");
            return true;
        }
        else {
            textField.setStyle("-fx-background-color: white;");
            return false;
        }
    }

    public boolean ValidationInt(TextField textField){
        if (!textField.getText().matches("[0-9]+")){
            textField.setStyle("-fx-background-color: red;");
            return true;
        }
        else{
            textField.setStyle("-fx-background-color: white;");
            return false;
        }
    }


}