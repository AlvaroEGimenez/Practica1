import com.digitalhouse.Estudioso;

import java.util.ArrayList;
import java.util.List;

public  class Alumno implements Estudioso {
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private Integer codigoAlumno;
    private ArrayList<Curso> cursosInscripto = new ArrayList<>();
    private Boolean estudioso;

    //CONSTRUCTOR


    public Alumno(String nombre, String apellido, Integer codigoAlumno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoAlumno = codigoAlumno;
    }

    //GETTERS


    public Integer getCodigoAlumno() {
        return codigoAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public ArrayList getCursos() {
        return cursosInscripto;
    }
    //METODOS
    public void agregarCurso(Curso cursos) {
        cursosInscripto.add(cursos);
    }


    @Override
    public Boolean esEstudioso() {
        if(cursosInscripto.size() > 2){
         estudioso = true;
        }
        else {
            estudioso = false;
        }
        return estudioso;
    }
}
