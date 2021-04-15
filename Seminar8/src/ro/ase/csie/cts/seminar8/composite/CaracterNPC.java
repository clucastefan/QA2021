package ro.ase.csie.cts.seminar8.composite;

public class CaracterNPC extends UnitateAbstractaJoc {
    String tip;
    int putere;

    public CaracterNPC(String tip, int putere) {
        super();
        this.tip = tip;
        this.putere = putere;
    }

    @Override
    public void seDeplaseaza(int x, int y) {
        System.out.println(String.format("%s se deplateaza",tip));
    }

    @Override
    public void atacaJucator(int puncte) {
        System.out.println(String.format("%s ataca jucatorul",tip));

    }

    @Override
    public void seRetrage() {
        System.out.println(String.format("%s se retrage",tip));

    }

    //solutie cand nu sunt implementate in nivelul abstract

    @Override
    public void adaugaCaracter(UnitateAbstractaJoc unitate) {

    }

    @Override
    public void stergeCaracter(UnitateAbstractaJoc unitateAbstractaJoc) {

    }

    @Override
    public UnitateAbstractaJoc getCaracter(int index) {
        return null;
    }
}
