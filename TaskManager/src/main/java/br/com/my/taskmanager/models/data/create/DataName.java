package br.com.my.taskmanager.models.data.create;

import br.com.my.taskmanager.exceptions.EmptyException;
import javafx.scene.control.TextField;

public class DataName {
    public String getName(TextField textField) {
        String name = textField.getText();
        if (name.isEmpty()) {
            throw new EmptyException("Name fields is required");
        }
        return name;
    }
}
