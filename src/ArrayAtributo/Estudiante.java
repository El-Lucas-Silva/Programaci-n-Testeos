package ArrayAtributo;

public class Estudiante {
    private String nombre;
    private Curso[] cursos;

    public Estudiante (String nombre){
        this.nombre = nombre;
        this.cursos = new Curso[5];
    }

    public Estudiante (String nombre, Curso[]cursos) {
        this.nombre = nombre;
        this.cursos = cursos;
    }
}
