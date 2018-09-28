/**
 * Created by Adolfo on 27/09/2018.
 */
public class Estudiante extends  Persona{

    private Nota notas;

    public void setNotas(Nota n){
        this.notas = n;
    }

    public Nota getNotas(){
        return this.notas;
    }

    public boolean isApp(){
        return getNotas().getTotal() >= 70 ? true : false;
    }

}
