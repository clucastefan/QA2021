package ro.ase.csie.cts.seminar5.singleton;

public class TestSingleton {

    public static void main(String[] args) {
//        ConexiuneBD conexiune1 = new ConexiuneBD("10.0.0.1","cts");
//        ConexiuneBD conexiune2 = new ConexiuneBD("10.0.0.1","cts");

        ConexiuneBD conexiune1 = ConexiuneBD.getConexiuneBD();
        ConexiuneBD conexiune2 = ConexiuneBD.getConexiuneBD();

        if(conexiune1==conexiune2){
            System.out.println("cele 2 conexiuni sunt identice");
        }else{
            System.out.println("cele 2 conexiuni sunt diferite");
        }

        ModulUI modulUI = new ModulUI();
        ModulProfil modulProfil = new ModulProfil();

    }

}
