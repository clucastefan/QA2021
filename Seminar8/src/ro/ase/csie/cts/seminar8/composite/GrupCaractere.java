package ro.ase.csie.cts.seminar8.composite;

import java.util.ArrayList;

public class GrupCaractere extends UnitateAbstractaJoc{
    ArrayList<UnitateAbstractaJoc> unitati = new ArrayList<>();

    @Override
    public void seDeplaseaza(int x, int y) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void atacaJucator(int puncte) {
        for(UnitateAbstractaJoc unitate : unitati)
            unitate.atacaJucator(puncte);
    }

    @Override
    public void seRetrage() {
        for(UnitateAbstractaJoc unitate : unitati)
            unitate.seRetrage();
    }

    @Override
    public void adaugaCaracter(UnitateAbstractaJoc unitate) {
        this.unitati.add(unitate);
    }

    @Override
    public void stergeCaracter(UnitateAbstractaJoc unitateAbstractaJoc) {
        this.unitati.remove(unitateAbstractaJoc);
    }

    @Override
    public UnitateAbstractaJoc getCaracter(int index) {
        return this.unitati.get(index);
    }
}
