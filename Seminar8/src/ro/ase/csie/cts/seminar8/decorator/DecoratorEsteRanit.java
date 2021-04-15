package ro.ase.csie.cts.seminar8.decorator;

public class DecoratorEsteRanit extends DecoratorErouAbstract{

    public static final int NIVEL_CRITIC = 200;

    public DecoratorEsteRanit(SuperErou erou) {
        super(erou);
    }

    @Override
    public void alearga() {
        if(this.erou.getPuncteViata() < NIVEL_CRITIC){
            System.out.println("Eroul este ranit critic. Nu mai poate alerga");
        }
        else
            this.erou.alearga();
    }
}
