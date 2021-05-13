package ro.ase.csie.cts.seminar10.chain;

public class ModulMesajeGrup extends ModulProcesareMesaj{
    @Override
    public void procesareMesaj(MesajChat mesaj) {
        if(mesaj.destinatie.toLowerCase().equals("@everyone")){
            System.out.println("mesaj pentru grup : " + mesaj.text);
        }
        if(this.next != null){
            this.next.procesareMesaj(mesaj);
        }
    }
}
