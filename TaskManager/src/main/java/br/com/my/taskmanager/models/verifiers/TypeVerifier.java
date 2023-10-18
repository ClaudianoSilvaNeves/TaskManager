package br.com.my.taskmanager.models.verifiers;

import br.com.my.taskmanager.models.data.create.Data;

public class TypeVerifier implements Verifier {
    private Verifier nextVerifier;
    @Override
    public void nextVerifier(Verifier verifier) {
        this.nextVerifier = verifier;
    }

    @Override
    public void verify(Data data) {
        if (!data.getType().isEmpty()) {
            nextVerifier.verify(data);
        }
    }
}
