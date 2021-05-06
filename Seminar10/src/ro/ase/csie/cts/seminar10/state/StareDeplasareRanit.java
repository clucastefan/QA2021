package ro.ase.csie.cts.seminar10.state;

public class StareDeplasareRanit implements InterfataModDeplasare{
    @Override
    public void seMisca(SuperErou erou) {
        System.out.println(erou.nume + "se deplaseaza mai incet deoarece este ranit");
    }
}
