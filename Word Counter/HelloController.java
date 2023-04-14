package com.example.ficha3;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.Arrays;

public class HelloController {
    @FXML
    private Button button;
    @FXML
    private CheckBox isCapital;
    @FXML
    private TextArea text;
    @FXML
    private TextField wordToSearch;
    @FXML
    private Label counter;

    @FXML
    protected void onHelloButtonClick() {

        long count = Arrays.stream(text.getText().split("\\s+"))
                .filter(x -> ((isCapital.isSelected()) ? x.equalsIgnoreCase(wordToSearch.getText()): x.equals(wordToSearch.getText())))
                .count();
        counter.setText(String.valueOf(count));
    }
}