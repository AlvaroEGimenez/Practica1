public class ProfesorAdjunto extends Profesor {
    //ATRIBUTOS
    private Integer horasConsulta;

    public ProfesorAdjunto(String nombre, String apellido, Integer codProfesor, Integer horasConsulta) {
        super(nombre, apellido, codProfesor);
        this.horasConsulta = horasConsulta;
    }
}
