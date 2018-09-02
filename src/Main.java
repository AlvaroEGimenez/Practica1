public class Main {

    public static void main(String[] args) {
	// write your code here
        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();

        Profesor profesorTitular = new ProfesorTitular("Alvaro","Gimenez",01,"Nada");
        Profesor profesorTitular1 = new ProfesorTitular("Alvaro","Gimenez",02,"Nada");
        Profesor profesorAdjunto = new ProfesorAdjunto("Roberto","Gomez",03,10);
        Profesor profesorAdjunto1 = new ProfesorAdjunto("Miguel","Gomez",04,10);

        Curso curso1 = new Curso("Full Stack",20001,3);
        Curso curso2 = new Curso("Android",20002,2);

        curso1.setProfesorTitular(profesorTitular);
        curso1.setProfesorAdjunto(profesorAdjunto);
        curso2.setProfesorAdjunto(profesorAdjunto1);
        curso2.setProfesorTitular(profesorTitular1);

        digitalHouseManager.altaAlumno("Alvaro","Gimenez",0001);
        digitalHouseManager.altaAlumno("Alvaro","Gimenez",0002);
        digitalHouseManager.altaAlumno("Alvaro","Gimenez",0003);
        digitalHouseManager.altaAlumno("Alvaro","Gimenez",0004);

        digitalHouseManager.altaCurso("Full Stack",20001,3);
        digitalHouseManager.altaCurso("Android",20002,2);


        digitalHouseManager.inscribirAlumno(0001,20001);
        digitalHouseManager.inscribirAlumno(0002,20001);
        digitalHouseManager.inscribirAlumno(0003,20001);
        digitalHouseManager.inscribirAlumno(0004,20001);
        digitalHouseManager.inscribirAlumno(0005,20001);



    }
}