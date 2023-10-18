package br.com.my.taskmanager.models.data.create;

import br.com.my.taskmanager.exceptions.EmptyException;
import javafx.scene.control.ComboBox;

public class DataType {
    public String getType(ComboBox<String> comboBox) {
        String type = comboBox.getValue();
            if (type == null) {
                throw new EmptyException("Please select type");
            }
        return type;
    }
}
