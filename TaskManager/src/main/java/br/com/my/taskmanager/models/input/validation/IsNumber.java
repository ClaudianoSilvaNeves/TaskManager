package br.com.my.taskmanager.models.input.validation;

import br.com.my.taskmanager.exceptions.EmptyException;
import br.com.my.taskmanager.exceptions.treatment.Treatment;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class IsNumber implements Validation {
    @Override
    public void verify(TextField textField) {
        textField.setOnKeyTyped((KeyEvent event)-> {
            String character = event.getCharacter();
            try {
                if (!character.matches("[0-9]")) {
                    throw new EmptyException("Invalid value");
                }
            } catch (EmptyException e) {
                Treatment.treatment(textField, e);
            }
        });
    }
}
