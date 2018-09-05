import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    //ATRIBUTOS
    private List<Alumno> listaAlumnos = new ArrayList<>();
    private List<Profesor> listaProfesores = new ArrayList<>();
    private List<Inscripcion> listaIncripciones = new ArrayList<>();
    private List<Curso> listaCursos = new ArrayList<>();



    //METODOS
    public void altaCurso(String nombre, Integer codigoCurso, Integer cupoMaximoAlumnos) {
        Curso nuevoCurso = new Curso(nombre, codigoCurso,cupoMaximoAlumnos );
        listaCursos.add(nuevoCurso);
    }

    public void bajaCurso(Integer codigoCurso) {
        Curso cursoBuscar = null;
        for (Curso cursoARecorrer : listaCursos) {
            if (cursoARecorrer.getCodigoCurso().equals(codigoCurso)) {
                cursoBuscar = cursoARecorrer;
                break;
            }
        }
        if (cursoBuscar != null) {
            listaCursos.remove(cursoBuscar);
            System.out.println("Se elimino el curso " + codigoCurso);
        } else {
            System.out.println("El codigo de curso no existe!");
        }
    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantidadDeHoras) {
        Profesor nuevoAdjunto = new ProfesorAdjunto(nombre, apellido, codigoProfesor, cantidadDeHoras);
        listaProfesores.add(nuevoAdjunto);
    }

    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad) {
        Profesor nuevoTitular = new ProfesorTitular(nombre, apellido, codigoProfesor, especialidad);
        listaProfesores.add(nuevoTitular);
    }

    public void bajaProfesor(Integer codigoProfesor) {
        Profesor profesorBaja = null;
        for (Profesor profesorARecorrer : listaProfesores) {
            if (profesorARecorrer.getCodProfesor().equals(codigoProfesor)) {
                profesorBaja = profesorARecorrer;
                break;
            }
        }
        if (profesorBaja != null) {
            listaProfesores.remove(profesorBaja);
            System.out.println("Se elimino al profesor COD: " + codigoProfesor);
        } else {
            System.out.println("El codigo de Profesor no existe!");
        }
    }

    public void altaAlumno(String nombre, String apellido, Integer codigoAlumno) {
        Alumno nuevoAlumno = new Alumno(nombre, apellido, codigoAlumno);
        listaAlumnos.add(nuevoAlumno);
    }

    public void inscribirAlumno(Integer codigoAlumno, Integer codigoCurso) {
        Alumno alumnoBuscar = null;
        for (Alumno alumnoRecorrer : listaAlumnos) {
            if (alumnoRecorrer.getCodigoAlumno().equals(codigoAlumno)) {
                alumnoBuscar = alumnoRecorrer;
                break;
            }
        }
        Curso cursoBuscar = null;
        for (Curso cursoRecorrer : listaCursos){
            if (cursoRecorrer.getCodigoCurso().equals(codigoCurso)){
                cursoBuscar = cursoRecorrer;
                break;
            }
        }
        if (cursoBuscar == null){
            System.out.println("El codigo de curso no es valido!");
        }
        else {
            if (alumnoBuscar != null){
                if(cursoBuscar.agregarAlumno(alumnoBuscar)){
                    Inscripcion nuevaInscripcion = new Inscripcion(alumnoBuscar,cursoBuscar);
                    alumnoBuscar.agregarCurso(cursoBuscar);
                }
        }
            else {
                System.out.println("No se encontro el alumno");
            }
        }

    }

    public void asignarProfesores(Integer codigoCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto) {
        Profesor profesorTitularAsignar = null;
        for (Profesor profesorTitularBuscar : listaProfesores) {
            if (profesorTitularBuscar.getCodProfesor().equals(codigoProfesorTitular)) {
                profesorTitularAsignar = profesorTitularBuscar;
                break;
            }
        }
        Profesor profesorAdjuntoAsignar = null;
        for (Profesor profesorAdjunto : listaProfesores) {
            if (profesorAdjunto.getCodProfesor().equals(codigoProfesorTitular)) {
                profesorAdjuntoAsignar = profesorAdjuntoAsignar;
                break;
            }
        }
        if (profesorTitularAsignar != null){
            for (Curso cursoBuscar : listaCursos){
                if(cursoBuscar.getCodigoCurso().equals(codigoCurso)){
                    cursoBuscar.setProfesorTitular(profesorTitularAsignar);
                    break;
                }
            }
        }
        else {
            System.out.println("El codigo del Profesor Titular no es correcto!");
        }

        if (profesorAdjuntoAsignar != null){
            for (Curso cursoBuscar : listaCursos){
                if(cursoBuscar.getCodigoCurso().equals(codigoCurso)){
                    cursoBuscar.setProfesorTitular(profesorAdjuntoAsignar);
                    break;
                }
            }
        }
        else {
            System.out.println("El codigo del Profesor Adjunto no es correcto!");
        }
    }
}
