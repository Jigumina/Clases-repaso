package ICO.fes;

public class cubo {
    private String ejes;
    private String estado;
    private int movimientos;

    public cubo() {
    }

    public cubo(String ejes, String estado, int movimientos) {
        this.ejes = ejes;
        this.estado = estado;
        this.movimientos = movimientos;
    }

    public String getEjes() {
        return ejes;
    }

    public void setEjes(String ejes) {
        this.ejes = ejes;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(int movimientos) {
        this.movimientos = movimientos;
    }

    @Override
    public String toString() {
        return "cubo{" +
                "ejes='" + ejes + '\'' +
                ", estado='" + estado + '\'' +
                ", movimientos=" + movimientos +
                '}';
    }

    public void girar() {
        if (this.ejes == "Y") {
            System.out.println("Estás girando hacia arriba");
        }
        else {
            System.out.println("Estás girando hacia la derecha");
        }
    }
    public void numMovi(){
        this.movimientos++;
        if (this.movimientos <= 26) {
            System.out.println("Eres un pro");
        }
        else {
            System.out.println("Necesitas más práctica (:");
        }
    }
}
