package ro.ase.csie.cts.seminar3.Faza3;

import ro.ase.csie.cts.seminar3.Exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.seminar3.Exceptii.ExceptieVechimeClient;
import ro.ase.csie.cts.seminar3.Faza3.Servicii.InterfataMarketing;
import ro.ase.csie.cts.seminar3.Faza3.Servicii.InterfataValidare;
import ro.ase.csie.cts.seminar3.Faza3.Servicii.ServiciuValidari;
import ro.ase.csie.cts.seminar3.Faza3.Servicii.StrategieMarketing2021;

public class Produs {

    InterfataMarketing serviciuMkt = null;
    InterfataValidare serviciuValidare = null;

    public Produs(InterfataMarketing mk, InterfataValidare validare){
        if(mk == null){
            throw new NullPointerException();
        }
        if(validare == null){
            throw new NullPointerException();
        }

        this.setStrategieMarketing(mk);
        this.serviciuValidare = validare;
    }

    public Produs(){
        for (Object serviciu : TestProdus.servicii){
            if(serviciu instanceof InterfataMarketing){
                this.serviciuMkt = (InterfataMarketing) serviciu;
            }
        }
        if(this.serviciuMkt == null){
            throw new NullPointerException();
        }
    }

    public void setStrategieMarketing(InterfataMarketing strategieMarketing){
        if(strategieMarketing == null){
            throw new NullPointerException();
        }
        this.serviciuMkt = strategieMarketing;
    }

    public static float getPretCuDiscount(float pretInitial, float discount) {
        return pretInitial - (discount * pretInitial);
    }

    public float getPretFinal(TipProdus tipProdus, float pretInitial, int vechimeClientInAni)
            throws ExceptiePretInvalid, ExceptieVechimeClient
    {

        serviciuValidare.validarePret(pretInitial);
        serviciuValidare.validareVechimeClient(vechimeClientInAni);

        float discountFidelitate =
                (tipProdus == TipProdus.NOU) ? 0:serviciuMkt.getDiscountFidelitate(vechimeClientInAni);

        float discount = TipProdus.DISCOUNT.getDiscount();
        float valoareDiscountTipProdus = getPretCuDiscount(pretInitial,discount);
        float pretFinal = valoareDiscountTipProdus *(1 - discountFidelitate);

        return pretFinal;
    }
}