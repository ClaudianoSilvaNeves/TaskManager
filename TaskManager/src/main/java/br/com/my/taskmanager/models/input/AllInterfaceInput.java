package br.com.my.taskmanager.models.input;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
public record AllInterfaceInput(TextField name, ComboBox<String> type, TextField time, GridPane days){

}
