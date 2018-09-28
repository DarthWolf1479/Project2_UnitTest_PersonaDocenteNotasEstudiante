import junit.framework.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Adolfo on 27/09/2018.
 */
public class DocenteTest {

    @Test
    public void verifyTheAgeMethod(){
        Docente docente = new Docente();
        docente.setFechaNac(1990);
        int expectResult = 28;
        int actualResult = docente.getEdad();
        Assert.assertEquals("ERROR! Edad calculada incorrectamente", expectResult, actualResult);

    }

    @Test
    public void verifyTheSortNotaMethod() {
        Docente d = new Docente();
        Estudiante[] e = { new Estudiante(), new Estudiante(), new Estudiante(), new Estudiante(),new Estudiante() };
        Nota[] n = { new Nota(), new Nota(), new Nota(),new Nota(),new Nota() };
        n[0].setNota1(95);
        n[0].setNota2(95);
        n[0].setNota3(95);

        n[1].setNota1(90);
        n[1].setNota2(90);
        n[1].setNota3(90);

        n[2].setNota1(70);
        n[2].setNota2(70);
        n[2].setNota3(70);

        n[3].setNota1(50);
        n[3].setNota2(50);
        n[3].setNota3(50);

        n[4].setNota1(10);
        n[4].setNota2(10);
        n[4].setNota3(10);

        e[0].setFechaNac(1995);
        e[0].setNotas(n[0]);

        e[1].setFechaNac(1990);
        e[1].setNotas(n[1]);

        e[2].setFechaNac(1985);
        e[2].setNotas(n[2]);

        e[3].setFechaNac(1980);
        e[3].setNotas(n[3]);

        e[4].setFechaNac(1975);
        e[4].setNotas(n[4]);

        d.setEstudiantes(e);

        Estudiante[] expectResult = {e[4], e[3], e[2], e[1], e[0]};
        Estudiante[] actualResult = d.sortNota(d.getEstudiates());

        System.out.println("Test Sort Note Complete");

        Assert.assertEquals(Arrays.toString(expectResult), Arrays.toString(actualResult));

    }

    @Test
    public void verifyTheSortNameMethod() {
        Docente d = new Docente();
        Estudiante[] e = { new Estudiante(), new Estudiante(), new Estudiante() };
        Nota[] n = { new Nota(), new Nota(), new Nota() };
        n[0].setNota1(50);
        n[0].setNota2(50);
        n[0].setNota3(50);
        n[1].setNota1(70);
        n[1].setNota2(70);
        n[1].setNota3(70);
        n[2].setNota1(90);
        n[2].setNota2(90);
        n[2].setNota3(90);
        e[0].setFechaNac(1995);
        e[0].setNotas(n[0]);
        e[0].setNombre("bart");
        e[1].setFechaNac(1990);
        e[1].setNotas(n[1]);
        e[1].setNombre("adolfo");
        e[2].setFechaNac(1985);
        e[2].setNotas(n[2]);
        e[2].setNombre("carlos");
        d.setEstudiantes(e);

        Estudiante[] expectResult = {e[1], e[0], e[2]};
        Estudiante[] actualResult = d.sortName(d.getEstudiates());

        System.out.println("Test Sort Name Complete");

        Assert.assertEquals(Arrays.toString(expectResult), Arrays.toString(actualResult));

    }

}
