package ro.ase.csie.cts.seminar10.chain;

import java.util.Locale;

public class ModulMesajePrivate extends ModulProcesareMesaj{
    @Override
    public void procesareMesaj(MesajChat mesaj) {
        if(!mesaj.destinatie.toLowerCase().equals("@everyone")){
            System.out.println
                    ("mesaj privat pentru: " +
                            mesaj.destinatie +
                            " : " + mesaj.text) ;
        }
        else{
            if(this.next != null){
                this.next.procesareMesaj(mesaj);
            }
        }
    }
}
