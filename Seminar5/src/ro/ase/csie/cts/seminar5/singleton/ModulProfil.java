package ro.ase.csie.cts.seminar5.singleton;

public class ModulProfil {
    public ModulProfil(){
        //ConexiuneBD conexiuneBD = new ConexiuneBD("10.0.0.1","superGame");
        ConexiuneBD conexiune1 = ConexiuneBD.getConexiuneBD();
    }
}
