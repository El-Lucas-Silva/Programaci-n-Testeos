package Ejercicio12_6;

import ArrayAtributo.Curso;
import ArrayAtributo.Estudiante;

public class Main {
    public static void main(String[] args) {
        Contacto[] contactosJuan = new Contacto [10];
        contactosJuan[0] = new Contacto("Pepe", "098743821");
        contactosJuan[1] = new Contacto("Pablo", "099756345");

        Agenda a1 = new Agenda ("Juan", contactosJuan);

        Contacto pruebaAdd = new Contacto("Ingresar Texto", "098343987");
        Contacto pruebaMod = new Contacto("Fernando", "092383873");

        System.out.println(a1);
        a1.agregarContacto(pruebaAdd);
        System.out.println(a1);
        a1.modificarContacto(0, pruebaMod);
        System.out.println(a1);
    }
}
