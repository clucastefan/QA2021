package ro.ase.csie.cts.seminar3.Faza3.Servicii;

public class StrategieMarketing2021 implements InterfataMarketing{

    @Override
    public float getDiscountFidelitate(int vechimeClientInAni) {
        return (vechimeClientInAni > VECHIME_CLIENT_MAXIMA) ? DISCOUNT_CLIENT_MAXIM : (float)vechimeClientInAni/100;
    }
}
