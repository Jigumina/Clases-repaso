package ICO.fes;

public class Pais {
        private String nombre;
        private String moneda;
        private int numHabitantes;

    public Pais() {
    }

    public Pais(String nombre, String moneda, int numHabitantes) {
        this.nombre = nombre;
        this.moneda = moneda;
        this.numHabitantes = numHabitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public int getNumHabitantes() {
        return numHabitantes;
    }

    public void setNumHabitantes(int numHabitantes) {
        this.numHabitantes = numHabitantes;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", moneda='" + moneda + '\'' +
                ", numHabitantes=" + numHabitantes +
                '}';
    }

    public void atacar(){
        System.out.println("Tu pais está atacando a otro..."); }
    public void defender() {
        System.out.println("Tu pais se está defendiendo...");
    }
}

