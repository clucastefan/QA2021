package ro.ase.csie.cts.seminar7.Facade;

public class TestFacade {
    public static void main(String[] args) {
        //1.creare conexiune
        ConexiuneServerJoc conexiuneServerJoc = new ConexiuneServerJoc();
        conexiuneServerJoc.conectare();

        //2.login player
        Player player = new Player();
        player.login(conexiuneServerJoc);

        //3.obtinem proofilul
        ProfilPlayer profil = player.getProfil();

        //4.obtinem datele
        String dateProfil = profil.getProfil();

        //prin Facade
        String dateProfil2 = FacadeApiJoc.getProfil("player1","1234");
    }
}
