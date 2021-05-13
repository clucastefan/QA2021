package ro.ase.csie.cts.seminar11.C0mmand;

public class TestCommand  {
    public static void main(String[] args) {
        ManagerTaskuri manager = new ManagerTaskuri();
        manager.adaugaTask(new TaskAsincron(new ModulAutosave(),"Salvare automata nivel",1));

        manager.adaugaTask(new TaskAsincron(new ModulUpdate(),"versiune 10.1",4));

        System.out.println("Jocul continua . .. ");
        manager.executaUrmatorulTask();
        System.out.println("Jocul continua");
        manager.executaUrmatorulTask();
        System.out.println("Jocul continua");

    }
}
