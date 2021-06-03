package ro.ase.csie.cts.seminar13.Modele;

import org.junit.*;
import ro.ase.csie.cts.seminar13.Exceptii.ExceptieNote;
import ro.ase.csie.cts.seminar13.Exceptii.ExceptieVarsta;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest2 {
    //test fixture
    static Student student;
    static ArrayList<Integer> noteInitiale = new ArrayList<>();
    static String numeInitial;
    static int varstaInitiala;
    static int nrNoteInitiale;

    @BeforeClass
    public static void beforeClass() throws Exception {
        numeInitial = "Gigel";
        varstaInitiala = Student.MIN_VARSTA + 1;
        nrNoteInitiale = 3;
        for(int i=0;i<nrNoteInitiale;i++){
            noteInitiale.add(Student.MAX_NOTA-i);
        }
    }

    @AfterClass
    public static void afterClass() throws Exception {

    }

    @Before
    public void setUp() throws Exception {
        student = new Student(numeInitial,varstaInitiala,noteInitiale);
    }

    @After
    public void tearDown() throws Exception {
        student = null;
    }

    @Ignore
    @Test
    public void test(){
        fail("Not implemented yet");
    }

    @Test(expected = ExceptieVarsta.class)
    public void testSetVarstaRangeMinValue() throws ExceptieVarsta {
        int varstaNoua = Integer.MIN_VALUE;
        student.setVarsta(varstaNoua);
    }

    @Test(expected = ExceptieVarsta.class)
    public void testSetVarstaRangeRangeValoarePozitivaMare() throws ExceptieVarsta {
        int varstaNoua = 200;
        student.setVarsta(varstaNoua);
    }

    @Test
    public void testSetVarstaLimitaInferioara() throws ExceptieVarsta {
        int varstaNoua = Student.MIN_VARSTA;
        student.setVarsta(varstaNoua);
        int varstaStudent = student.getVarsta();
        assertEquals("Test pentru varsta minima",varstaNoua,varstaStudent);
    }

    @Test
    public void testSetVarstaLimitaSuperioara() throws ExceptieVarsta {
        int varstaNoua = Student.MAX_VARSTA;
        student.setVarsta(varstaNoua);
        int varstaStudent = student.getVarsta();
        assertEquals("Test pentru varsta maxima",varstaNoua,varstaStudent);
    }

    @Test
    public void testSetNoteReferenceShallowCopy() throws ExceptieNote {
        int[] noteStudent = new int[]{9,9,10};
        ArrayList<Integer> refNote = new ArrayList<>(Arrays.asList(9,9,10));

        student.setNote(refNote);
        refNote.set(0,5);

        int noteExistente[] = new int[student.getNrNote()];
        for(int i=0;i<student.getNrNote();i++){
            noteExistente[i] = student.getNota(i);
        }

        assertEquals("Test shallow copy pe note ", noteStudent, noteExistente);
    }

}