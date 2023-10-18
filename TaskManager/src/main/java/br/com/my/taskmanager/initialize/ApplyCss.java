package br.com.my.taskmanager.initialize;

import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;

public class ApplyCss {
    public void Fonts (GridPane gridPane) {
        for (Node node : gridPane.getChildren()) {
            if (node instanceof CheckBox) {
                LoadCss loadCss = new LoadCss();
                node.getStyleClass().add("allCheckBoxes");
            }
        }
    }
}
