package ro.ase.csie.cts.seminar10.strategy;

import ro.ase.csie.cts.seminar10.strategy.InterfataStrategieMarketing;

public class Jucator {
    int totalOreJucate;
    String nume;
    int clasaJucator;
    InterfataStrategieMarketing strategieMK = null;

    public Jucator(int totalOreJucate, String nume, int clasaJucator) {
        super();
        this.totalOreJucate = totalOreJucate;
        this.nume = nume;
        this.clasaJucator = clasaJucator;
    }

    public int getTotalOreJucate() {
        return totalOreJucate;
    }

    public String getNume() {
        return nume;
    }

    public int getClasaJucator() {
        return clasaJucator;
    }

    public InterfataStrategieMarketing getStrategieMK() {
        return strategieMK;
    }

    public void setStrategieMK(InterfataStrategieMarketing strategieMK) {
        this.strategieMK = strategieMK;
    }

    public void acordaPuncteBonus(){
        if(this.strategieMK != null){
            this.strategieMK.aplicaStrategieBonus(this);
        }
        else
        {
            throw new UnsupportedOperationException();
        }
    }
}
