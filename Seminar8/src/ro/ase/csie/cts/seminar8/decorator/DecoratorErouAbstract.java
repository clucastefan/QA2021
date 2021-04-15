package ro.ase.csie.cts.seminar8.decorator;

public abstract class DecoratorErouAbstract extends SuperErou{

    SuperErou erou = null;

    @Override
    public int getPuncteViata() {
        return this.erou.puncteViata;
    }

    public DecoratorErouAbstract(SuperErou erou) {
        super(erou.nume, erou.puncteViata);
        this.erou=erou;
    }

    @Override
    public void alearga() {
        this.erou.alearga();
    }

    @Override
    public void esteLovit(int puncte) {
        this.erou.esteLovit(puncte);
    }

    @Override
    public void seVindeca(int puncte) {
        this.erou.seVindeca(puncte);
    }
}
