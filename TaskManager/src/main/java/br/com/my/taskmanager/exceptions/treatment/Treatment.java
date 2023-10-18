package br.com.my.taskmanager.exceptions.treatment;

import br.com.my.taskmanager.models.input.AllInterfaceInput;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Treatment {
    public static void treatment(TextField textField, Exception e) {
        textField.getParent().requestFocus();
        textField.setPromptText(e.getMessage());
        textField.clear();
    }

    public static void treatment(ComboBox<String> comboBox, Exception e) {
        comboBox.setPromptText(e.getMessage());
    }

    public static void treatment(AllInterfaceInput allInterfaceInput, Exception e) {
        HBox hBox = (HBox) allInterfaceInput.days().getParent().getParent();
        VBox vbox = (VBox) hBox.getChildren().get(0);
        int i = vbox.getChildren().size();
        Label label =  (Label) vbox.getChildren().get(i - 1);
        label.setVisible(true);
        label.setText(e.getMessage());
    }
}
