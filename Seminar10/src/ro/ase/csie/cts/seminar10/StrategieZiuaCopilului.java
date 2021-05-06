package ro.ase.csie.cts.seminar10;

public class StrategieZiuaCopilului implements InterfataStrategieMarketing{
    @Override
    public void aplicaStrategieBonus(Jucator jucator) {
        if(jucator.getClasaJucator() > 5){
            jucator.clasaJucator *=2;
            System.out.println("Strategie speciala");
        }
    }
}
