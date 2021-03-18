package ro.ase.csie.cts.seminar3.Faza3;

import ro.ase.csie.cts.seminar3.Exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.seminar3.Exceptii.ExceptieVechimeClient;
import ro.ase.csie.cts.seminar3.Faza3.Servicii.InterfataMarketing;
import ro.ase.csie.cts.seminar3.Faza3.Servicii.InterfataValidare;

public class Produs {

    InterfataMarketing serviciuMkt = null;
    InterfataValidare serviciuValidare = null;

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