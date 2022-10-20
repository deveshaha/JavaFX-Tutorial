package com.example.javafx_tutorial;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {

    public TextField txt1;

    public Button btnOk;
    public TextArea txtArea;

    @FXML
    private void onClick(ActionEvent actionEvent){
        String input = txt1.getText();
        txtArea.setText(input);
    }

}