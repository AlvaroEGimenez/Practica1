public  class Alumno {
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private Integer codigoAlumno;

    //CONSTRUCTOR


    public Alumno(String nombre, String apellido, Integer codigoAlumno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoAlumno = codigoAlumno;
    }

    //GETTERS

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
