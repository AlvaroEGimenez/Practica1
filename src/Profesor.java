public abstract class Profesor {
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private Integer anteguedad = 0;
    private Integer codProfesor;

    //CONSTRUCTOR


    public Profesor(String nombre, String apellido, Integer codProfesor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codProfesor = codProfesor;
    }
}
