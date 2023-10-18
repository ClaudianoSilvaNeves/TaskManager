package br.com.my.taskmanager.models.data.create;

import br.com.my.taskmanager.exceptions.EmptyException;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;

public class DataDays {
    public String getDays(GridPane gridPane) {
        StringBuilder days = new StringBuilder();
        for (Node node : gridPane.getChildren()) {
            if (node instanceof CheckBox checkBox) {
                if (checkBox.isSelected()) {
                    if (!days.isEmpty()) {
                        days.append(", ");
                    }
                    days.append(checkBox.getText());
                }
            }
        }
        if (days.isEmpty()) {
            throw new EmptyException("Please select a day");
        }
        return String.valueOf(days);
    }
}
