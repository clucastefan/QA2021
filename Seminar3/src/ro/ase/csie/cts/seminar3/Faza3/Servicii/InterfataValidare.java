package ro.ase.csie.cts.seminar3.Faza3.Servicii;

import ro.ase.csie.cts.seminar3.Exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.seminar3.Exceptii.ExceptieVechimeClient;

public interface InterfataValidare {
    public void validarePret(float pretInitial) throws ExceptiePretInvalid;
    public void validareVechimeClient(int vechimeClientInAni) throws ExceptieVechimeClient;

}
