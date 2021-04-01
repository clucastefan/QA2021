package ro.ase.csie.cts.seminar6.factory;

import java.nio.charset.CharacterCodingException;

public class CaracterMarvel extends CaracterAbstract {

    int putere;

    public CaracterMarvel(String nume,int putere) {
        this.putere = putere;
        this.nume = nume;
    }

    @Override
    public void alearga() {

    }

    @Override
    public void sare() {

    }
}
