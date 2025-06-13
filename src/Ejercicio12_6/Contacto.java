package Ejercicio12_6;

public class Contacto {
    private String nombre;
    private String numero;
    private String correo;

    public Contacto (String nombre, String numero, String correo) {
        this.nombre = nombre;
        this.numero = numero;
        this.correo = correo;
    }

    public Contacto (String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "nombre='" + nombre + '\'' +
                ", numero='" + numero + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
