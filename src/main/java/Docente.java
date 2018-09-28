/**
 * Created by Adolfo on 27/09/2018.
 */
public class Docente extends Persona {

    private Estudiante[] estudiantes;

    private Estudiante aux;

    public void setEstudiantes(Estudiante[] est){
        this.estudiantes = est;
    }

    public Estudiante[] getEstudiates(){
        return this.estudiantes;
    }

    public Estudiante[] sortNota(Estudiante[] estudiante){
        int tam = estudiante.length;
        for(int i=0; i<tam; i++){
            for(int j=i+1; j<tam;j++){
                int n1 = estudiante[i].getNotas().getTotal();
                int n2 = estudiante[j].getNotas().getTotal();
                if(n1 > n2){
                    aux = estudiante[i];
                    estudiante[i] = estudiante[j];
                    estudiante[j] = aux;
                }

            }
        }
        return estudiante;
    }


    public Estudiante[] sortName(Estudiante[] estudiante){
        int tam = estudiante.length;
        for(int i=0; i<tam; i++){
            for(int j=i+1; j<tam;j++){
                String n1 = estudiante[i].getNombre();
                String n2 = estudiante[j].getNombre();
                if(n1.compareTo(n2)>0){
                    aux = estudiante[i];
                    estudiante[i] = estudiante[j];
                    estudiante[j] = aux;
                }
            }
        }
        return estudiante;
    }


}
