package ro.ase.csie.cts.seminar12.memento;

import javax.swing.*;

public class SuperErou {
    String nume;
    int puncteViata;
    String magie;

    public SuperErou(String nume, int puncteViata, String magie) {
        this.nume = nume;
        this.puncteViata = puncteViata;
        this.magie = magie;
    }

    public void ataca(){
        System.out.println("Ataca");
    }

    public void esteLovit(int puncteViata){
        this.puncteViata -= puncteViata;
    }

    public void serVindeca(int puncteViata){
        this.puncteViata += puncteViata;
    }

    public MementoSuperErou salvare(){
        return new MementoSuperErou(nume,puncteViata,magie);
    }

    public void incarcaSalvare(MementoSuperErou mementoSuperErou){
        this.nume = mementoSuperErou.nume;
        this.puncteViata = mementoSuperErou.puncteViata;
        this.magie = mementoSuperErou.magie;
    }
}
