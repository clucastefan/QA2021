package ro.ase.csie.cts.seminar7.Adapter;

import ro.ase.csie.cts.seminar7.FactoryMethod.CaractereJoc;

public class AdapterEA2CaracterJoc extends CaractereJoc {

    InterfataCaracterEA caracterEA;

    public AdapterEA2CaracterJoc(InterfataCaracterEA caracterEA) {
        this.caracterEA = caracterEA;
    }

    @Override
    public void seDeplaseaza() {

        caracterEA.move();
    }
}
