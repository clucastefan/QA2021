package ro.ase.csie.cts.seminar3.Faza3.Servicii;

import ro.ase.csie.cts.seminar3.Exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.seminar3.Exceptii.ExceptieVechimeClient;

public class ServiciuValidari implements InterfataValidare{
    @Override
    public void validarePret(float pretInitial) throws ExceptiePretInvalid {
        if(pretInitial<=0){
            throw new ExceptiePretInvalid();
        }
    }

    @Override
    public void validareVechimeClient(int vechimeClientInAni) throws ExceptieVechimeClient {
        if(vechimeClientInAni < 0){
            throw new ExceptieVechimeClient();
        }
    }
}
