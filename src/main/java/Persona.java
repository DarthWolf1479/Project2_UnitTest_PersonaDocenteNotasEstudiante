/**
 * Created by Adolfo on 27/09/2018.
 */
public class Persona {

    private String nombre;
    private int fechaNac;

    public void setFechaNac(int i){
        this.fechaNac = i;
    }

    public int getFechaNac(){
        return this.fechaNac;
    }

    public int getEdad(){
        return 2018 - this.fechaNac;
    }

    public void setNombre(String i){
        this.nombre = i;
    }

    public String getNombre(){
        return nombre;
    }

}
