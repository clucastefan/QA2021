package ro.ase.csie.cts.seminar6;

public class TestBuilder {
    public static void main(String[] args) {
        //1.Creare
        //SuperErou superErou = new SuperErou();

        //2.Initializare
        //3. . . .

//        SuperErou superErou1 = new SuperErou(null,
//                                            0,
//                                            false,
//                                            false,
//                                            null,
//                                            null,
//                                            null,
//                                            null);

        SuperErou superman = new SuperErou.SuperErouBuilder("Superman",100).build();
        SuperErou jokere = new SuperErou.SuperErouBuilder("Joker",200)
                .esteNegativ()
                .esteRanit()
                .setArmaDreapta(new Arma())
                .build();

    }
}
