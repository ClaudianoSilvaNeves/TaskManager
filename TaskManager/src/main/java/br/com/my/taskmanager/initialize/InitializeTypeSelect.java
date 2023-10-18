package br.com.my.taskmanager.initialize;

import javafx.scene.control.ComboBox;

public class InitializeTypeSelect {
    public void typeSelect(ComboBox<String> comboBox) {
        if (comboBox.getItems().isEmpty()) {
            comboBox.getItems().addAll("Studies", "Exercises", "Leisure", "Work");
        }
    }
}
