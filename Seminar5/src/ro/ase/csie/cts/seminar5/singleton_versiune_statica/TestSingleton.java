package ro.ase.csie.cts.seminar5.singleton_versiune_statica;

public class TestSingleton {
    public static void main(String[] args) {
        ConexiuneBD conexiune1 = ConexiuneBD.conexiune;
        ConexiuneBD conexiune2 = ConexiuneBD.conexiune;

        if(conexiune1==conexiune2){
            System.out.println("cele 2 conexiuni sunt identice");
        }else{
            System.out.println("cele 2 conexiuni sunt diferite");
        }
    }
}
