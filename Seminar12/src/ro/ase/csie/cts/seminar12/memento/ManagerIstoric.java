package ro.ase.csie.cts.seminar12.memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerIstoric {
    List<MementoSuperErou> salvari = new ArrayList<>();

    public void adaugaSalvare(MementoSuperErou mementoSuperErou){
        this.salvari.add(mementoSuperErou);
    }

    public MementoSuperErou getUltimaSalvare() {
        if (this.salvari.size() > 0) {
            MementoSuperErou ultimaSalvare = this.salvari.get(this.salvari.size()-1);
            this.salvari.remove(ultimaSalvare);
            return ultimaSalvare;
        }
        else {
            return null;
        }
    }
}
