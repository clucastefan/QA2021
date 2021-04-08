package ro.ase.csie.cts.seminar7.factory;

public class FactoryCaractere {
    public static CaracterAbstract getCaracter(TipCaracter tip,String nume){
        CaracterAbstract caracter = null;

        switch (tip){
            case DISNEY:
                caracter = new CaracterDisney("alb",nume,true);
                break;
            case MARVEL:
                caracter = new CaracterMarvel(nume,50);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return caracter;
    }
}
