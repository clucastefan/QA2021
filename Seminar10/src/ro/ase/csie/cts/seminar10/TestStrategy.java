package ro.ase.csie.cts.seminar10;

public class TestStrategy {
    public static void main(String[] args) {
        Jucator jucator = new Jucator(150,"Gigel",7);
        jucator.setStrategieMK(new StrategieJucatorNou());

        jucator.acordaPuncteBonus();

        jucator.setStrategieMK(new StrategieZiuaCopilului());

        jucator.acordaPuncteBonus();

        System.out.println(jucator.getClasaJucator());
    }
}
