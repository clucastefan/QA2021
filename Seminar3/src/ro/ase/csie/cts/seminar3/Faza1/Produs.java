package ro.ase.csie.cts.seminar3.Faza1;

import ro.ase.csie.cts.seminar3.Exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.seminar3.Exceptii.ExceptieVechimeClient;

public class Produs {

    public static final int VECHIME_CLIENT_MAXIMA = 10;
    public static final float DISCOUNT_CLIENT_MAXIM = 0.15f;

    public float getPretFinal(TipProdus tipProdus, float pretInitial, int vechimeClientAni) throws ExceptiePretInvalid, ExceptieVechimeClient {
        if(pretInitial <= 0){
            throw  new ExceptiePretInvalid();
        }
        if(vechimeClientAni < 0){
            throw new ExceptieVechimeClient();
        }

        float pretFinal = 0;
        float discoutFidelitate = (vechimeClientAni > VECHIME_CLIENT_MAXIMA) ? DISCOUNT_CLIENT_MAXIM : (float)vechimeClientAni/100;
        float discount = TipProdus.NOU.getDiscount();

        switch (tipProdus){
            case NOU:
                pretFinal = pretInitial;
                break;

            case DISCOUNT:
                discount = TipProdus.DISCOUNT.getDiscount();
                pretFinal = (pretInitial - (discount * pretInitial)) - discoutFidelitate * (pretInitial - (discount * pretInitial));
                break;

            case STOC_LIMITAT:
                discount = TipProdus.STOC_LIMITAT.getDiscount();
                pretFinal = (pretInitial - (discount * pretInitial)) - discoutFidelitate * (pretInitial - (discount * pretInitial));
                break;

            case VECHI:
                discount = TipProdus.VECHI.getDiscount();
                pretFinal = (pretInitial - (discount * pretInitial)) - discoutFidelitate * (pretInitial - (discount * pretInitial));
                break;

            default:
                throw new UnsupportedOperationException("Un simbol din enumerare nu este procesat");
        }

//        if (tipProdus == TipProdus.NOU)
//        {
//            pretFinal = pretInitial;
//        }
//        else if (tipProdus == TipProdus.DISCOUNT)
//        {
//            float discount = TipProdus.DISCOUNT.getDiscount();
//            pretFinal = (pretInitial - (discount * pretInitial)) - discoutFidelitate * (pretInitial - (discount * pretInitial));
//        }
//        else if (tipProdus == TipProdus.STOC_LIMITAT)
//        {
//            float discount = TipProdus.STOC_LIMITAT.getDiscount();
//            pretFinal = (pretInitial - (discount * pretInitial)) - discoutFidelitate * (pretInitial - (discount * pretInitial));
//        }
//        else if (tipProdus == TipProdus.VECHI)
//        {
//            float discount = TipProdus.VECHI.getDiscount();
//            pretFinal = (pretInitial - (discount * pretInitial)) - discoutFidelitate * (pretInitial - (discount * pretInitial));
//        }

        return pretFinal;
    }
}