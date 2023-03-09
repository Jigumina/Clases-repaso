package ICO.fes;

import java.awt.*;

public class Lámpara {
    private String marca;
    private String estado;
    private Color color;

    public Lámpara() {
    }

    public Lámpara(String marca, String estado, Color color) {
        this.marca = marca;
        this.estado = estado;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Lámpara{" +
                "marca='" + marca + '\'' +
                ", estado='" + estado + '\'' +
                ", color=" + color +
                '}';
    }

    public void encender() {
        System.out.println("Encendido");
    }
    public void apagar (){
        System.out.println("Apagado");
    }
}
