package br.com.my.taskmanager.models.verifiers;

import br.com.my.taskmanager.models.data.create.Data;

public interface Verifier {
    void nextVerifier(Verifier verifier);
    void verify(Data data);
}
