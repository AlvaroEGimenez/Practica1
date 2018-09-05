import java.util.ArrayList;
import java.util.List;

public class Curso {
    //ATRIBUTOS
    private String nombre;
    private Integer codigoCurso;
    private Profesor profesorTitular;
    private Profesor profesorAdjunto;
    private Integer cupoMaximo;
    private List<Alumno> listaAlumnos = new ArrayList<>();

    //CONSTRUCTOR

    public Curso(String nombre, Integer codigoCurso, Integer cupoMaximo) {
        this.nombre = nombre;
        this.codigoCurso = codigoCurso;
        this.cupoMaximo = cupoMaximo;
    }


    //GETTERS


    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    //SETTERS
    protected void setProfesorAdjunto(Profesor profesorAdjunto) {
        this.profesorAdjunto = profesorAdjunto;
    }

    protected void setProfesorTitular(Profesor profesorTitular) {
        this.profesorTitular = profesorTitular;
    }

    protected void setCupoMaximo(Integer cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    //METODOS
        public Boolean agregarAlumno(Alumno alumno){
             Boolean hayCupo = cupoMaximo > listaAlumnos.size();
             if(hayCupo){
                listaAlumnos.add(alumno);
                System.out.println("Se inscribio al alumno en el curso " + codigoCurso);
                return true;
            }
            else{
                System.out.println("No hay cupo disponible en el curso "+codigoCurso);
                return false;
            }
        }


    public void eliminarAlumno (Alumno alumno){
        Alumno alumnoEliminar = null;
        for(Alumno recorrerAlumnos : listaAlumnos){
            if(listaAlumnos.equals(alumno)){
                alumnoEliminar = alumno;
                break;
            }
        }
        if(alumnoEliminar != null){
            listaAlumnos.remove(alumnoEliminar);
            System.out.println("Se elimino al Alumno "+alumnoEliminar.getNombre()+" "+alumnoEliminar.getApellido());
        }
        else {
            System.out.println("No se encontro al alumno.");
        }
    }
}
