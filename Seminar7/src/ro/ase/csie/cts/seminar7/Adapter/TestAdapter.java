package ro.ase.csie.cts.seminar7.Adapter;

import ro.ase.csie.cts.seminar7.FactoryMethod.CaracterDisney;
import ro.ase.csie.cts.seminar7.FactoryMethod.CaractereJoc;

import java.util.ArrayList;

public class TestAdapter {
    public static void main(String[] args) {
        //1. colectie caractere existente

        ArrayList<CaractereJoc> caractere = new ArrayList<>();
        caractere.add(new CaracterDisney("Donald"));

        //2.colectie caractere EA

        ArrayList<CaracterGenericEA> caractereEA = new ArrayList<>();
        caractereEA.add(new CaracterGenericEA());

        //3. folosind un adapter

        InterfataCaracterEA caracterEA = new CaracterGenericEA();
        AdapterEA2CaracterJoc adapt = new AdapterEA2CaracterJoc(caracterEA);
        caractere.add(adapt);
    }
}
