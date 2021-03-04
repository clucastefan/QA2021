package ro.ase.csie.cts.seminar2.modele;

import ro.ase.csie.cts.seminar2.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.csie.cts.seminar2.exceptii.ExceptieTransferIlegal;

public abstract class cont {
    public abstract double getBalanta();
    public abstract void alimenteaza(Double valoare);
    public abstract void extrage(Double valoare)throws ExceptieFonduriInsuficiente;
    public abstract void transfer(cont destinatie, Double valoare) throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal;
}
