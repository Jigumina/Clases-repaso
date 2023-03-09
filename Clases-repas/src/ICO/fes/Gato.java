package ICO.fes;

public class Gato {
    private String nombre;
    private String raza;
    private byte edad;

    public Gato() {
    }

    public Gato(String nombre, String raza, byte edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                '}';
    }
    public void comer(){
        System.out.println("Está comiendo");
    }
    public void vestir (){
        System.out.println("Lo estás vistiendo");
    }
}
