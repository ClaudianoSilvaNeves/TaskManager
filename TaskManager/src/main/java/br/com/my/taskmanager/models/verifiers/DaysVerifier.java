package br.com.my.taskmanager.models.verifiers;

import br.com.my.taskmanager.models.data.create.Data;
import br.com.my.taskmanager.models.task.CreateTask;

public class DaysVerifier implements Verifier {
    private Verifier nextVerifier;
    @Override
    public void nextVerifier(Verifier verifier) {
    }

    @Override
    public void verify(Data data) {
        if (!data.getDays().isEmpty()) {
        }
    }
}
