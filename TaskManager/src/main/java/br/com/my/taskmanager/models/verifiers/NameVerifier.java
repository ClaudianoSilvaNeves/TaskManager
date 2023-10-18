package br.com.my.taskmanager.models.verifiers;

import br.com.my.taskmanager.models.data.create.Data;

public class NameVerifier implements Verifier {
    private Verifier nextVerifier;
    @Override
    public void nextVerifier(Verifier verifier) {
        this.nextVerifier = verifier;
    }

    @Override
    public void verify(Data data) {
        if (!data.getName().isEmpty()) {
            nextVerifier.verify(data);
        }
    }
}
