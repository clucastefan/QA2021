package ro.ase.csie.cts.seminar12.memento;

import java.util.Date;

public class MementoSuperErou {
    String nume;
    int puncteViata;
    String magie;

    Date dateSalvare;

    public MementoSuperErou(String nume, int puncteViata, String magie) {
        this.nume = nume;
        this.puncteViata = puncteViata;
        this.magie = magie;
        this.dateSalvare = new Date();
    }
}
