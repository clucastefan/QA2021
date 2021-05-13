package ro.ase.csie.cts.seminar10.chain;

public class TestChain {
    public static void main(String[] args) {
        ModulProcesareMesaj modulFiltru = new ModulFiltruRomana();
        ModulProcesareMesaj modulPrivat = new ModulMesajePrivate();
        ModulProcesareMesaj modulGrup = new ModulMesajeGrup();

        modulFiltru.setNext(modulPrivat);
        modulPrivat.setNext(modulGrup);

        ModulProcesareMesaj serverChat = modulFiltru;
        serverChat.procesareMesaj
                (new MesajChat("salut",3,"Gigel"));
        serverChat.procesareMesaj
                (new MesajChat("esti un jucator rau",3,"Gigel"));
        serverChat.procesareMesaj
                (new MesajChat("Salut tuturor",3,"@everyone"));
    }
}
