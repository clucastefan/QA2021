package ro.ase.csie.cts.seminar13.Teste;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

import ro.ase.csie.cts.seminar13.Exceptii.ExceptieNote;
import ro.ase.csie.cts.seminar13.Exceptii.ExceptieNume;
import ro.ase.csie.cts.seminar13.Exceptii.ExceptieVarsta;
import ro.ase.csie.cts.seminar13.Modele.Student;

public class StudentTest {

    //text fixture
    static Student student;
    static ArrayList<Integer> note;
    static String numeInitial = "Gigel";
    static int varstaInitiala = 21;

    @BeforeClass
    public static void beforeClass() throws Exception {
        note = new ArrayList<>();
        note.add(9);
        note.add(7);
        note.add(10);
    }

    @AfterClass
    public static void afterClass() throws Exception {
        note.clear();
        note = null;
    }

    @org.junit.Before
    public void setUp() throws Exception {
        student = new Student(numeInitial,varstaInitiala,note);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        student = null;
    }

    @Ignore
    @Test
    public void test(){
        fail("Not implemented yet");
    }

    @Test
    public void testSetVarstaConformanceRight() throws ExceptieVarsta {

        int varstaNoua = 23;
        student.setVarsta(varstaNoua);
        assertEquals("Test cu valori corecte",varstaNoua,student.getVarsta());
    }

    @Test
    public void testSetNumeConformanceRight() {
        String numeNou = "Ana";
        try {
            student.setNume(numeNou);
            assertEquals("Test cu valori corecte",numeNou,student.getNume());
        } catch (ExceptieNume exceptieNume) {
            fail("Genereaza exceptie pentru valori corecte");
        }
    }

    @Test
    public void testSetVarstaErrorCondition(){
        int varstaNoua = Student.MIN_VARSTA * -1;
        try {
            student.setVarsta(varstaNoua);
            fail("Nu Genereaza exceptie pentru varsta in afara limitelor");
        } catch (ExceptieVarsta e) {
            assertTrue(true);
        }
    }

    @Test(expected = ExceptieNume.class)
    public void testSetNumeErrorCondition() throws ExceptieNume{
        String numeNou = "Io";
        student.setNume(numeNou);
    }

    @Test
    public void testGetNotaMinimaOrderingSetSortatCrescator() throws ExceptieNote {
        int notaMinima = 4;
        ArrayList<Integer> note = new ArrayList<>();
        for (int i =0;i<5;i++){
            note.add(i+notaMinima);
        }
        student.setNote(note);
        int notaMinimaCalculata = student.getNotaMinima();
        assertEquals("Test valori sortate crescator",notaMinima,notaMinimaCalculata);

    }

    @Test
    public void testGetNotaMinimaCardinalityZero() throws ExceptieNote {
        ArrayList<Integer> note = new ArrayList<>();
        student.setNote(note);
        int notaMinima = 0;
        int notaMinimaCalculata = student.getNotaMinima()  ;
        assertEquals("Test fara note",notaMinima,notaMinimaCalculata);
    }
    @Test
    public void testGetNotaMinimaCardinalityUnu() throws ExceptieNote {
        ArrayList<Integer> note = new ArrayList<>();
        note.add(Student.MAX_NOTA);

        student.setNote(note);

        int notaMinima = student.MAX_NOTA;
        int notaMinimaCalculata = student.getNotaMinima()  ;
        assertEquals("Test cu o singura note",notaMinima,notaMinimaCalculata);
    }

    @Test
    public void testGetNotaMinimaReferintaExistenceNoteNull() throws ExceptieNote {
        student.setNote(null);
        int notaMinima = 0;
        int notaMinimaCalculata = student.getNotaMinima();
        assertEquals("Test referinta null pentru note",notaMinima,notaMinimaCalculata);
    }

}