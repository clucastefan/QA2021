package ro.ase.csie.cts.seminar12.observer;

public class TestObserver {
    public static void main(String[] args) {
        ModulStareConexiuneServer conexiuneServer = new ModulStareConexiuneServer();
        ModulNotificariUI notificariUI = new ModulNotificariUI();
        ModulSalvareAutomata backup = new ModulSalvareAutomata();

        conexiuneServer.detectieSchimbareStareConexiune(StareConexiune.ACTIVA);

        conexiuneServer.register(backup);
        conexiuneServer.register(notificariUI);

        conexiuneServer.detectieSchimbareStareConexiune(StareConexiune.INACTIVA);

        conexiuneServer.unregister(backup);
        conexiuneServer.detectieSchimbareStareConexiune(StareConexiune.ACTIVA);
    }
}
