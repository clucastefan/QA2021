package ro.ase.csie.cts.seminar10.strategy;

import ro.ase.csie.cts.seminar10.strategy.InterfataStrategieMarketing;
import ro.ase.csie.cts.seminar10.strategy.Jucator;

public class StrategieJucatorNou implements InterfataStrategieMarketing {
    @Override
    public void aplicaStrategieBonus(Jucator jucator) {
        if(jucator.getTotalOreJucate() > 100){
            jucator.clasaJucator += 1;
            System.out.println("Strategie jucator nou");
        }
    }
}
