package ro.ase.csie.cts.seminar6.factory;

public class CaracterDisney extends CaracterAbstract {
    String culoare;
    boolean okPentruCopiiMici;

    public CaracterDisney(String culoare,String nume,boolean ok) {
        this.nume = nume;
        this.culoare = culoare;
    }

    @Override
    public void alearga() {
        System.out.println("Alearga . . . ");
    }

    @Override
    public void sare() {
        System.out.println("Sare . . . ");
    }
}
