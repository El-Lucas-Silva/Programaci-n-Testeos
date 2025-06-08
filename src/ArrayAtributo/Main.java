package ArrayAtributo;

public class Main {
    public static void main(String[] args) {
        Curso[] informatica = new Curso [2];
        informatica[0] = new Curso();
        informatica[1] = new Curso();

        informatica[0].setNombre("Juan");

        Estudiante est1 = new Estudiante ("Juan", informatica);
    }
}
