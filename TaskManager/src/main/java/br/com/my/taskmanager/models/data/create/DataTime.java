package br.com.my.taskmanager.models.data.create;

import br.com.my.taskmanager.exceptions.EmptyException;
import javafx.scene.control.TextField;

public class DataTime {
    public int getTime(TextField textField) {
        int time = 0;
        time = Integer.parseInt(textField.getText());
        if (time < 0 || time > 24) {
            throw new EmptyException("Invalid time");
        }
        return time;
    }
}
