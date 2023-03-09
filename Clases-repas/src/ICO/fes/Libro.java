package ICO.fes;

public class Libro {
    private int páginas;
    private String titulo;
    private String trama;

    public Libro() {
    }

    public Libro(int páginas, String titulo, String trama) {
        this.páginas = páginas;
        this.titulo = titulo;
        this.trama = trama;
    }

    public int getPáginas() {
        return páginas;
    }

    public void setPáginas(int páginas) {
        this.páginas = páginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTrama() {
        return trama;
    }

    public void setTrama(String trama) {
        this.trama = trama;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "páginas=" + páginas +
                ", titulo='" + titulo + '\'' +
                ", trama='" + trama + '\'' +
                '}';
    }
    public void termipag() {
        if (this.páginas >= 10) {
            System.out.println("El libro ha terminado");
        }
    }
    public void cambiarpag(){
        System.out.println("Cambiaste a la siguiente página");
    }
    public void cerrar(){
        System.out.println("El libro se está cerrando");
    }
}
