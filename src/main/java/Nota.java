/**
 * Created by Adolfo on 27/09/2018.
 */
public class Nota {

    private int nota1;
    private int nota2;
    private int nota3;

    public void setNota1(int i){
        if(i >= 100)
            this.nota1 = 0;
        else
            this.nota1 = i;
    }

    public int getNota1(){
        return nota1;
    }

    public void setNota2(int i){
        if(i >= 100)
            this.nota2 = 0;
        else
            this.nota2 = i;
    }

    public int getNota2(){
        return nota2;
    }

    public void setNota3(int i){
        if(i >= 100)
            this.nota3 = 0;
        else
            this.nota3 = i;
    }

    public int getNota3(){
        return nota3;
    }

    public int getTotal(){
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }

}
