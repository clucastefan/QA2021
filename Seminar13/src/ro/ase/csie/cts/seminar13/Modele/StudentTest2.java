package ro.ase.csie.cts.seminar13.Modele;

import org.junit.*;
import ro.ase.csie.cts.seminar13.Exceptii.ExceptieNote;
import ro.ase.csie.cts.seminar13.Exceptii.ExceptieVarsta;

import java.awt.*;
import java.util.*;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest2 {
    //test fixture
    static Student student;
    static ArrayList<Integer> noteInitiale = new ArrayList<>();
    static String numeInitial;
    static int varstaInitiala;
    static int nrNoteInitiale;
    static ArrayList<Integer> noteRandom;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        numeInitial = "Gigel";
        varstaInitiala = Student.MIN_VARSTA+1;
        nrNoteInitiale = 3;
        for(int i = 0; i < nrNoteInitiale; i++){
            noteInitiale.add(Student.MAX_NOTA-i);
        }

        noteRandom = new ArrayList<>();
        int nrNote = (int) 1e6;
        Random random = new Random();
        for (int i = 0; i < nrNote; i++) {
            noteRandom.add(random.nextInt(Student.MAX_NOTA)+1);
        }
    }

    @Before
    public void setUp() throws Exception {
        student = new Student(numeInitial,varstaInitiala,noteInitiale);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(expected =  ExceptieVarsta.class)
    public void testSetVarstaRangeMinValue() throws ExceptieVarsta {
        int varstaNoua = Integer.MIN_VALUE;
        student.setVarsta(varstaNoua);

    }

    @Test(expected =  ExceptieVarsta.class)
    public void testSetVarstaRangeValoarePozitivaMare() throws ExceptieVarsta {
        int varstaNoua = 200;
        student.setVarsta(varstaNoua);

    }

    @Test
    public void testSetVarstaBoundaryLimitaInferioara() throws ExceptieVarsta {
        int varstaNoua = Student.MIN_VARSTA;
        student.setVarsta(varstaNoua);
        int varstaStudent = student.getVarsta();
        assertEquals("Test pentru varsta minima",varstaNoua,varstaStudent);
    }

    @Test
    public void testSetVarstaBoundaryLimitaSuperioara() throws ExceptieVarsta {
        int varstaNoua = Student.MAX_VARSTA;
        student.setVarsta(varstaNoua);
        int varstaStudent = student.getVarsta();
        assertEquals("Test pentru varsta maxima",varstaNoua,varstaStudent);
    }

    @Test
    public void testSetNoteReferenceShallowCopy() throws ExceptieNote {
        int noteStudent[] = new int[]{9,9,10};
        ArrayList<Integer> referintaNote = new ArrayList<>(Arrays.asList(9, 9, 10));

        student.setNote(referintaNote);
        referintaNote.set(0,5);

        int noteExistente[] = new int[student.getNrNote()];
        for(int i = 0; i < student.getNrNote(); i++){
            noteExistente[i] = student.getNota(i);
        }
        assertArrayEquals("Test shallow copy pe setNote",noteStudent,noteExistente);
    }

    @Test
    public void testGetMediePerformance() throws ExceptieNote {
        ArrayList<Integer> note = new ArrayList<>();
        int nrNote = (int) 1e6;
        Random random = new Random();
        for (int i = 0; i < nrNote; i++) {
            note.add(random.nextInt(Student.MAX_NOTA)+1);
        }

        student.setNote(note);

        long tStart = System.currentTimeMillis();
        student.getMedie();
        long tFinal = System.currentTimeMillis();

        long durata = tFinal - tStart;
        if(durata<=100){
            assertTrue(true);
        }
        else{
            fail("Calculul mediei dureaza mai mult de 10 milisecunde");
        }
    }

    @Test(timeout = 20)
    public void testGetMediePerformance2() throws ExceptieNote {
        student.setNote(noteRandom);
        student.getMedie();
    }

    @Test
    public void testSetVarstaInverse() throws ExceptieVarsta{
        int varstaNoua = varstaInitiala +1;
        student.setVarsta(varstaNoua);
        assertNotEquals("Set nu modifica valoarea atributului",varstaInitiala,student.getVarsta());
    }

    @Test
    public void setGetNotaMinima() throws ExceptieNote{
        ArrayList<Integer> note = new ArrayList<>();
        Random random = new Random();
        note.add(random.nextInt(Student.MAX_NOTA)+1);
        note.add(random.nextInt(Student.MAX_NOTA)+1);
        note.add(random.nextInt(Student.MAX_NOTA)+1);

        student.setNote(note);

        int notaMinima = student.getNotaMinima();

        for(int i=0;i< student.getNrNote();i++){
            if(notaMinima> student.getNota(i)){
                fail("Minimul nu este calculat corect");
            }
        }
        assertTrue(true);
    }

    @Test
    public void testGetNotaMinimaCrossCheck() throws ExceptieNote {
        ArrayList<Integer> note = new ArrayList<>();
        Random random = new Random();
        note.add(random.nextInt(Student.MAX_NOTA)+1);
        note.add(random.nextInt(Student.MAX_NOTA)+1);
        note.add(random.nextInt(Student.MAX_NOTA)+1);

        student.setNote(note);

        int notaMinima = Collections.min(note);
        int notaMinimaCalculata = student.getNotaMinima();

        assertEquals("Nota minima nu este ok",notaMinima,notaMinimaCalculata);
    }

}