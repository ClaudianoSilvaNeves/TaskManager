package br.com.my.taskmanager.models.verifiers;

import br.com.my.taskmanager.models.data.create.Data;

public class ChainCheck {
    public void chainVerify(Data data) {
        Verifier nameVerifier = new NameVerifier();
        Verifier typeVerifier = new TypeVerifier();
        Verifier timeVerifier = new TimeVerifier();
        Verifier daysVerifier = new DaysVerifier();

        nameVerifier.nextVerifier(typeVerifier);
        typeVerifier.nextVerifier(timeVerifier);
        timeVerifier.nextVerifier(daysVerifier);

        nameVerifier.verify(data);
    }
}
