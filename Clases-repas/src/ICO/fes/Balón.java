package ICO.fes;

import java.awt.*;

public class Balón {
    private String tamaño;
    private String material;
    private Color color;

    public Balón() {
    }

    public Balón(String tamaño, String material, Color color) {
        this.tamaño = tamaño;
        this.material = material;
        this.color = color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Balón{" +
                "tamaño='" + tamaño + '\'' +
                ", material='" + material + '\'' +
                ", color=" + color +
                '}';
    }
    public void rebotanto() {
        System.out.println("El balon esta rebotando");
    }
    public void rodando(){
            System.out.println("El balon esta rodando");

    }
}
