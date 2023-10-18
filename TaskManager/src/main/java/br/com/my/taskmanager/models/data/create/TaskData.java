package br.com.my.taskmanager.models.data.create;

import br.com.my.taskmanager.exceptions.EmptyException;
import br.com.my.taskmanager.exceptions.treatment.Treatment;
import br.com.my.taskmanager.models.input.AllInterfaceInput;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class TaskData implements Data {
    private String name;
    private String type;
    private String days;
    private int time;
    private boolean concluded = false;

    public TaskData(AllInterfaceInput allInterfaceInput) {
        try {
            this.name = new DataName().getName(allInterfaceInput.name());
        } catch (EmptyException e) {
            Treatment.treatment(allInterfaceInput.name(), e);
            throw e;
        }

        try {
            this.type = new DataType().getType(allInterfaceInput.type());
        } catch (EmptyException e) {
            Treatment.treatment(allInterfaceInput.type(), e);
            throw e;
        }

        try {
            this.days = new DataDays().getDays(allInterfaceInput.days());
        } catch (EmptyException e) {
            Treatment.treatment(allInterfaceInput, e);
            throw e;
        }

        try {
            this.time = new DataTime().getTime(allInterfaceInput.time());
        } catch (EmptyException | NumberFormatException e) {
            allInterfaceInput.time().setPromptText("Invalid time");
            throw e;
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getDays() {
        return this.days;
    }

    @Override
    public int getTime() {
        return this.time;
    }

    @Override
    public boolean getConcluded() {
        return this.concluded;
    }
}
