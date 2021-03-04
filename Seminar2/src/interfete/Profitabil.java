package interfete;

public interface Profitabil {
    //clasa abstracta care contine doar metodate abstracte si ontine atribute statice abstracte

    public static final int MAX_PROCENT_DOBANDA = 5;

    public abstract void adaugaDobanda(double procentDobanda);
}
