package ro.ase.csie.cts.seminar12.observer;

public class ModulNotificariUI implements InterfataStatusConexiuneServer{
    @Override
    public void conexiuneIntrerupta() {
        System.out.println("Popup : Conexiune pierduta");
    }

    @Override
    public void conexiuneActiva() {
        System.out.println("Popup : Conexiune activa");
    }
}
