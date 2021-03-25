package ro.ase.csie.cts.seminar5.singleton;

public class ConexiuneBD {
    String ip;
    String denumire;

    //versiune eager
    //private static ConexiuneBD conexiuneBD = new ConexiuneBD("10.0.0.1","cts");
    private static ConexiuneBD conexiuneBD = null;

    private ConexiuneBD(){

    }

    private ConexiuneBD(String ip, String denumire) {
        System.out.println("Apel Constructor");
        this.ip = ip;
        this.denumire = denumire;
    }

    //versiune lazy
    public static synchronized ConexiuneBD getConexiuneBD(){
        if(conexiuneBD == null){
            conexiuneBD = new ConexiuneBD("10.0.0.1","cts");
        }
        return conexiuneBD;
    }
}
