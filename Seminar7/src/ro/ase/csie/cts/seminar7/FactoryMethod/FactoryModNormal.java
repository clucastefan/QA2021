package ro.ase.csie.cts.seminar7.FactoryMethod;

public class FactoryModNormal extends FactoryAbstractCaracter{
    @Override
    public CaractereJoc getCaracter(TipCaracter tip, String nume) {
        CaractereJoc caracter = null;
        switch(tip){
            case DISNEY:
                caracter = new CaracterDisney(nume);
                break;
            case MARVEL:
                caracter = new CaracterMarvel(nume,300);
                break;
            case DC:
                caracter = new CaracterDCComics(nume);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return caracter;
    }
}
