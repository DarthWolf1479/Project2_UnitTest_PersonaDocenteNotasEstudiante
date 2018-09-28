/**
 * Created by Adolfo on 27/09/2018.
 */
import org.junit.Assert;
import org.junit.Test;

public class NotaTest {

    @Test
    public void verifyTheCalcFinalNote(){
        Nota nota = new Nota();
        nota.setNota1(200);
        nota.setNota2(600);
        nota.setNota3(900);

        int expectResult=0;
        int actualResult=nota.getTotal();

        Assert.assertEquals("ERROR ! La nota no es correctamente calcualda",
                expectResult,actualResult);

    }

    @Test
    public void verifyTheCalcFinalNoteWithZero(){
        Nota nota = new Nota();

        int expectResult=0;
        int actualResult=nota.getTotal();

        Assert.assertEquals("ERROR ! La nota no es correctamente calcualda",
                expectResult,actualResult);
    }

    @Test
    public void verifyTheCalcFinalNoteWrongInput(){
        Nota nota = new Nota();
        nota.setNota1(200);
        nota.setNota2(15);
        nota.setNota3(15);

        int expectResult=10;
        int actualResult=nota.getTotal();

        Assert.assertEquals("ERROR ! La nota no es correctamente calcualda",
                expectResult,actualResult);
    }

}
