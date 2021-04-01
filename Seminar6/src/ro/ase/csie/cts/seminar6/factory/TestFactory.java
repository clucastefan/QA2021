package ro.ase.csie.cts.seminar6.factory;

import java.util.ArrayList;

public class TestFactory {
    public static void main(String[] args) {
        //CaracterAbstract mickeyMouse = new CaracterDisney("rosu","Mickey Mouse");
        //CaracterAbstract spierMan = new CaracterMarvel("rosu",100);

        CaracterAbstract mickeyMouse = FactoryCaractere.getCaracter(TipCaracter.DISNEY,"Mickey Mouse");

        ArrayList<CaracterAbstract> caractere = new ArrayList<>();
    }
}
