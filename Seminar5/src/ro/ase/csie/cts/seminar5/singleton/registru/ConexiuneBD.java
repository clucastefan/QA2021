package ro.ase.csie.cts.seminar5.singleton.registru;

import java.util.Hashtable;

public class ConexiuneBD {
    String ip;
    String denumire;

    private static Hashtable<String,ConexiuneBD> conexiuni = new Hashtable<>();

    public ConexiuneBD(String ip, String denumire) {
        super();
        this.ip = ip;
        this.denumire = denumire;
    }

    public static ConexiuneBD getConexiune(String ip,String denumire){
        ConexiuneBD conexiuneBD = conexiuni.get(ip);
        if(conexiuneBD == null){
            conexiuneBD = new ConexiuneBD(ip,denumire);
            conexiuni.put(ip,conexiuneBD);
        }
        return conexiuneBD;
    }
}
