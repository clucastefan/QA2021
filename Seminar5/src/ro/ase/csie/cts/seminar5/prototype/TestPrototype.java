package ro.ase.csie.cts.seminar5.prototype;

public class TestPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Caracter3D char1 =  new Caracter3D("model1.3d");
        //Caracter3D char3 =  new Caracter3D("model1.3d");

        Caracter3D char2 = (Caracter3D) char1.clone();
        System.out.println("Sfarsit");
    }
}
