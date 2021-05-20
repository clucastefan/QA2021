package ro.ase.csie.cts.seminar12.observer;

import java.util.ArrayList;
import java.util.List;

public class ModulStareConexiuneServer {
    List<InterfataStatusConexiuneServer> module = new ArrayList<>();
    public void register(InterfataStatusConexiuneServer modul){
        this.module.add(modul);
    }
    public void unregister(InterfataStatusConexiuneServer modul){
        this.module.remove(modul);
    }

    public void detectieSchimbareStareConexiune(StareConexiune stareConexiune){
        if(stareConexiune == StareConexiune.ACTIVA){
            for(InterfataStatusConexiuneServer modul : module){
                modul.conexiuneActiva();
            }
        }
        if(stareConexiune == StareConexiune.INACTIVA){
            for(InterfataStatusConexiuneServer modul : module){
                modul.conexiuneIntrerupta();
            }
        }
    }
}
