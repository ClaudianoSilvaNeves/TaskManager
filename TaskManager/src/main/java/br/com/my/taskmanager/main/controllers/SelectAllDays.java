package br.com.my.taskmanager.main.controllers;

import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;

public class SelectAllDays {
    public static void allDays(GridPane gridPane) {
        CheckBox allCheckBox = (CheckBox) gridPane.getChildren().get(6);
        boolean allDaysSelected = allCheckBox.isSelected();
        for (int i = 0; i < gridPane.getChildren().size() - 1; i++) {
            CheckBox checkBox = (CheckBox) gridPane.getChildren().get(i);
            checkBox.setSelected(!allDaysSelected);
        }
    }
}
