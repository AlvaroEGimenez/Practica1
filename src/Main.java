import com.digitalhouse.DHException;
import com.digitalhouse.DigitalException;
import com.digitalhouse.OtherException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();





        digitalHouseManager.altaProfesorTitular("Alvaro","Gimenez",1,"Nada");
        digitalHouseManager.altaProfesorAdjunto("Alberto","Gomez",2,10);

        digitalHouseManager.altaAlumno("Alvaro","Gimenez",0001);
        digitalHouseManager.altaAlumno("Alvaro","Gimenez",0002);
        digitalHouseManager.altaAlumno("Alvaro","Gimenez",0003);
        digitalHouseManager.altaAlumno("Alvaro","Gimenez",0004);

        digitalHouseManager.altaCurso("Full Stack",20001,3);
        digitalHouseManager.altaCurso("Android",20002,2);

        System.out.println("Se incriben 2 alumnos al curso Full Stack");
        digitalHouseManager.inscribirAlumno(0001,20001);
        digitalHouseManager.inscribirAlumno(0002,20001);
        System.out.println();
        System.out.println("Se incriben 2 alumnos al curso Android");
        digitalHouseManager.inscribirAlumno(0003,20002);
        digitalHouseManager.inscribirAlumno(0004,20002);
        System.out.println();
        System.out.println("Se incriben 3 alumnos al curso Android");
        digitalHouseManager.inscribirAlumno(0003,20002);
        digitalHouseManager.inscribirAlumno(0001,20002);
        digitalHouseManager.inscribirAlumno(0002,20002);
        System.out.println();
        System.out.println("Se da de baja un profesor y se intentar dar de baja un profedor con codigo erroneo");
        digitalHouseManager.bajaProfesor(2);
        digitalHouseManager.bajaProfesor(3);
        System.out.println();
        System.out.println("Se da de baja un Curso");
        digitalHouseManager.bajaCurso(20002);
        System.out.println();
        System.out.println("Se intenta incribir un alumno en un curso que no existe (se elimino)");
        digitalHouseManager.inscribirAlumno(0001,2002);


        Alumno alumno = new Alumno("Alvaro","Gimenez",3);
        try {
            DigitalException.inscripcionDH(alumno);
        } catch  (DHException e){
            System.out.println("Venir a colearnig");
        } catch (OtherException e) {
            System.out.println("Hablar con Alumno");
        }

    }
}