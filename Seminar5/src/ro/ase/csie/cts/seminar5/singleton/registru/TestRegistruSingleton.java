package ro.ase.csie.cts.seminar5.singleton.registru;

public class TestRegistruSingleton {
    public static void main(String[] args) {
        ConexiuneBD conexiuneBD1 = ConexiuneBD.getConexiune("10.0.0.1","cts");
        ConexiuneBD conexiuneBD2 = ConexiuneBD.getConexiune("10.0.0.1","cts");
        ConexiuneBD conexiuneBD3 = ConexiuneBD.getConexiune("127.0.0.1","test");

        if(conexiuneBD1==conexiuneBD2){
            System.out.println("cele 2 conexiuni sunt identice");
        }else{
            System.out.println("cele 2 conexiuni sunt diferite");
        }

        if(conexiuneBD1==conexiuneBD3){
            System.out.println("cele 2 conexiuni sunt identice");
        }else{
            System.out.println("cele 2 conexiuni sunt diferite");
        }
    }
}
