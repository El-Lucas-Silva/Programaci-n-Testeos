public class Main {
    public static void main(String[] args) {

        Mascotas m1 = new Mascotas("Princesa", "Pitbull", 15.5);
        System.out.println(m1.getNombre());
        m1.setNombre("Caramelo");
        System.out.println(m1.getNombre());

    }
}