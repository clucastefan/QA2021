package ro.ase.csie.cts.seminar5.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Caracter3D implements Cloneable {
    String fisierModel3d;
    String culoare;
    int intaltime;

    ArrayList<Integer> puncteGrafic = null  ;

    public Caracter3D(String fisierModel3d) {
        System.out.println("Se incarca modelul 3D din "+fisierModel3d);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.fisierModel3d = fisierModel3d;

        Random random = new Random();
        puncteGrafic = new ArrayList<>();
        for(int i=0;i<10;i++){
            puncteGrafic.add(random.nextInt(1000));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Puncte caracter 3D: ");
        for (int punct : this.puncteGrafic) {
            sb.append(punct + " ");
        }
        return sb.toString();
    }

    private Caracter3D(){}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //NU ASA
        //Caracter3D copie = new Caracter3D(this.fisierModel3d);
        Caracter3D copie = new Caracter3D();
        copie.culoare = this.culoare;
        copie.fisierModel3d = this.fisierModel3d;
        copie.intaltime = this.intaltime;
        copie.puncteGrafic= (ArrayList<Integer>) this.puncteGrafic.clone();

        return copie;
    }
}
