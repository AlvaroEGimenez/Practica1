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
        Integer baja = null;
        for (Curso cursoARecorrer : listaCursos) {
            if (cursoARecorrer.getCodigoCurso().equals(codigoCurso)) {
                baja = listaCursos.hashCode();
                break;
            }
        }
        if (baja != null) {
            listaCursos.remove(baja);
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
        Integer bajaProfesor = null;
        for (Profesor profesorARecorrer : listaProfesores) {
            if (profesorARecorrer.getCodProfesor().equals(codigoProfesor)) {
                bajaProfesor = profesorARecorrer.hashCode();
                break;
            }
        }
        if (bajaProfesor != null) {
            listaProfesores.remove(bajaProfesor);
            System.out.println("Se elimino al profesor COD:" + codigoProfesor);
        } else {
            System.out.println("El codigo de Profesor no existe!");
        }
    }

    public void altaAlumno(String nombre, String apellido, Integer codigoAlumno) {
        Alumno nuevoAlumno = new Alumno(nombre, apellido, codigoAlumno);
        listaAlumnos.add(nuevoAlumno);
    }

    public void inscribirAlumno(Integer codigoAlumno, Integer codigoCurso) {
        for (Alumno alumnoBuscar : listaAlumnos) {
            if (alumnoBuscar.getCodigoAlumno().equals(codigoAlumno)) {
                for (Curso cursoBuscar : listaCursos){
                    if (cursoBuscar.getCodigoCurso().equals(codigoCurso)){
                        cursoBuscar.agregarAlumno(alumnoBuscar);
                        Inscripcion inscripcion = new Inscripcion(alumnoBuscar, cursoBuscar);
                        listaIncripciones.add(inscripcion);
                        break;
                    }
                }
            }
        }
    }

    public void asignarProfesores(Integer codigoCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto) {
        for (Profesor profesorTitularBuscar : listaProfesores) {
            if (profesorTitularBuscar.getCodProfesor().equals(codigoProfesorTitular)) {
                for (Curso cursoBuscar : listaCursos) {
                    if (cursoBuscar.getCodigoCurso().equals(codigoCurso)) {
                        cursoBuscar.setProfesorTitular(profesorTitularBuscar);
                        System.out.println("Se asigno profesor titular al Curso!");
                        break;
                    }
                }

            }
        }
        for (Profesor profesorAdjunto : listaProfesores) {
            if (profesorAdjunto.getCodProfesor().equals(codigoProfesorTitular)) {
                for (Curso cursoBuscar : listaCursos) {
                    if (cursoBuscar.getCodigoCurso().equals(codigoCurso)) {
                        cursoBuscar.setProfesorTitular(profesorAdjunto);
                        System.out.println("Se asigno profesor titular al Curso!");
                        break;
                    }
                }

            }
        }
    }
}
