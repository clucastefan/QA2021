package ro.ase.csie.cts.seminar6.FactoryMethod;

public class FactoryMod4Kids extends FactoryAbstractCaracter{
    @Override
    public CaractereJoc getCaracter(TipCaracter tip, String nume) {
        CaractereJoc caracter = null;
        switch(tip){
            case DISNEY:
                caracter = new CaracterDisney4Kids();
                break;
            case MARVEL:
                caracter = new CaracterMarvel4Kids();
                break;
            case DC:
                caracter = new CaracterDCComics4Kids();
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return caracter;
    }
}
