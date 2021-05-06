package ro.ase.csie.cts.seminar10.chain;

import java.util.Locale;

public class ModulFiltruRomana extends ModulProcesareMesaj{
    public static final String[] dictionar = new String[]{"rau","violent","neprietenos"};
    @Override
    public void procesareMesaj(MesajChat mesaj) {
        boolean esteValid = true;
        for(String cuvant : dictionar){
            if(mesaj.text.toLowerCase().contains(cuvant)){
                esteValid = false;
                break;
            }
        }
        if(esteValid && this.next != null)
            this.next.procesareMesaj(mesaj);
    }
}
