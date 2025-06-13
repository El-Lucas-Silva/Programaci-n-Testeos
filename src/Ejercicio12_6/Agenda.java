package Ejercicio12_6;

import java.util.Arrays;
import java.util.Scanner;

public class Agenda {
    Scanner read = new Scanner(System.in);

    private String nombre;
    private Contacto[] contactos;

    public Agenda (String nombre, Contacto[]contactos) {
        this.nombre = nombre;
        this.contactos = contactos;
    }

    void agregarContacto(Contacto contacto) {
        int IDContacto = -1;

        for (int i = 0 ; i<this.contactos.length ; i++) {
            if (this.contactos[i] == null) {
                IDContacto = i;
                break;
            }
            if (i == (this.contactos.length - 1)) {
                System.out.println("Ya no puedes agregar más contactos, tienes demasiados.");
            }
        }
        if (IDContacto >= 0) {

            this.contactos[IDContacto] = contacto;
        }
    }

    void modificarContacto(int indice, Contacto nuevoContacto) {
        if (indice < 0 && indice > this.contactos.length) {
            System.out.println("No se puede modificar este indice");
        } else {
            System.out.println("El contacto "+ this.contactos[indice] +" se modificó");
            this.contactos[indice] = nuevoContacto;
            System.out.println("Nuevo contacto: "+ this.contactos[indice]);

        }
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "nombre='" + nombre + '\'' +
                ", contactos=" + Arrays.toString(contactos) +
                '}';
    }
}
