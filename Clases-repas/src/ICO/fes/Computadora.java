package ICO.fes;

public class Computadora {
    private int memoria;
    private String marca;
    private String sistemaOperativo;

    public Computadora() {
    }

    public Computadora(int memoria, String marca, String sistemaOperativo) {
        this.memoria = memoria;
        this.marca = marca;
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "memoria=" + memoria +
                ", marca='" + marca + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                '}';
    }
    public void encender(){
        System.out.println("Se está encendiendo espere...");
    }
    public void ejecutarprograma(){
        System.out.println("Se está ejecutando un programa");
    }
}


