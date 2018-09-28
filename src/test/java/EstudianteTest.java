import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Adolfo on 27/09/2018.
 */
public class EstudianteTest {

    @Test
    public void verifyTheAgeMethod(){
        Estudiante estudiante = new Estudiante();
        estudiante.setFechaNac(1998);
        int expectResult = 20;
        int actualResult = estudiante.getEdad();
        Assert.assertEquals("ERROR! Edad calculada incorrectamente", expectResult, actualResult);
    }

    @Test
    public void verifyApp(){
        Estudiante estudiante = new Estudiante();
        Nota nota = new Nota();
        nota.setNota1(80);
        nota.setNota2(80);
        nota.setNota3(80);
        estudiante.setNotas(nota);


        boolean expectResult = true;
        boolean actualResult = estudiante.isApp();

        Assert.assertEquals("ERROR! El estudiante no aprobo",expectResult,actualResult);

    }

}
