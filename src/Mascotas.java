public class Mascotas {
    //Atributos
    private String nombre;

    private String raza;

    private double peso;

    //private String animal; _Crear cosos que el usuario no deba ingresar EJ_

    //Constructor

    public Mascotas (String nombre, String raza, double peso){
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        //this.animal = "Perro" _Crear cosos que el usuario no deba ingresar EJ_
    }
    //Aceder (getter) - Función
    public String getNombre(){
        return this.nombre;
    }

    public String getRaza(){
        return this.raza;
    }

    public double getPeso(){
        return this.peso;
    }

    //Modificar (setter) - Procedimiento
    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public void setRaza (String raza){
        this.nombre = raza;
    }

    public void setPeso (String peso){
        this.nombre = peso;
    }
}