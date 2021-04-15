package ro.ase.csie.cts.seminar8.composite;

public abstract class UnitateAbstractaJoc implements InterfataNPC {
    //Interfata nodurilor frunza este mostenita
    //Definim interfata specifica nodurilor copil

    public abstract void adaugaCaracter(UnitateAbstractaJoc unitate);
    public abstract void stergeCaracter(UnitateAbstractaJoc unitateAbstractaJoc);
    public abstract UnitateAbstractaJoc getCaracter(int index);



}
