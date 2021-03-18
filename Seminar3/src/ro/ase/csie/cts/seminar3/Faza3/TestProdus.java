package ro.ase.csie.cts.seminar3.Faza3;

import ro.ase.csie.cts.seminar3.Exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.seminar3.Exceptii.ExceptieVechimeClient;
import ro.ase.csie.cts.seminar3.Faza3.Servicii.InterfataMarketing;
import ro.ase.csie.cts.seminar3.Faza3.Servicii.InterfataValidare;
import ro.ase.csie.cts.seminar3.Faza3.Servicii.ServiciuValidari;
import ro.ase.csie.cts.seminar3.Faza3.Servicii.StrategieMarketing2021;

import java.util.ArrayList;

public class TestProdus {

    public static ArrayList<Object> servicii = new ArrayList<>();

    public void startUp(){
        InterfataMarketing serviciuMarketing = new StrategieMarketing2021();
        InterfataValidare serviciuValidare = new ServiciuValidari();

        servicii.add(serviciuValidare);
        servicii.add(serviciuMarketing);
    }

    public static void main(String[] args) {
        Produs produs = new Produs(new StrategieMarketing2021(), new ServiciuValidari());
        try {
            float pretFinal = produs.getPretFinal(TipProdus.DISCOUNT,100,12);
            System.out.println("Pretul final este " + pretFinal);

            produs.setStrategieMarketing(new InterfataMarketing() {
                @Override
                public float getDiscountFidelitate(int vechimeClientInAni) {
                    return 0.3f;
                }
            });
            pretFinal = produs.getPretFinal(TipProdus.DISCOUNT,100,12);
            System.out.println("Pretul final este " + pretFinal);

        } catch (ExceptiePretInvalid exceptiePretInvalid) {
            exceptiePretInvalid.printStackTrace();
        } catch (ExceptieVechimeClient exceptieVechimeClient) {
            exceptieVechimeClient.printStackTrace();
        }

    }
}
