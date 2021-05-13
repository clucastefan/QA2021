package ro.ase.csie.cts.seminar10.chain;

public abstract class ModulProcesareMesaj {
    ModulProcesareMesaj next = null;
    public abstract void procesareMesaj(MesajChat mesaj);

    public void setNext(ModulProcesareMesaj next) {
        this.next = next;
    }
}
