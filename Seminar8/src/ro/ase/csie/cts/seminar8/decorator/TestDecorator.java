package ro.ase.csie.cts.seminar8.decorator;

public class TestDecorator {
    public static void main(String[] args) {
        SuperErou dragon = new Dragon("Dragon Albastru",1000);
        dragon.alearga();
        dragon.esteLovit(800);
        dragon.seVindeca(100);

        SuperErou dragon2 = new Dragon("Dragon Galben",1000);
        dragon2.alearga();
        dragon2.esteLovit(200);
        dragon2.seVindeca(100);

        //aplicam decoratori doar pe primul dragon
//        SuperErou dragonCuArmura = new DecoratorArmura(dragon,300);
//        dragonCuArmura.esteLovit(400);

        dragon = new DecoratorArmura(dragon,300);
        dragon.esteLovit(400);

        dragon = new DecoratorEsteRanit(dragon);
        dragon.esteLovit(400);
        dragon.alearga();

    }
}
