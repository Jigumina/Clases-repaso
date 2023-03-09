package ICO.fes;

public class Giroscopio {
    private int rango;
    private String rotacion;
    private String eje;

    public Giroscopio() {
    }

    public Giroscopio(int rango, String rotacion, String ejes) {
        this.rango = rango;
        this.rotacion = rotacion;
        this.eje = eje;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    public String getRotacion() {
        return rotacion;
    }

    public void setRotacion(String rotacion) {
        this.rotacion = rotacion;
    }

    public String getEje() {
        return eje;
    }

    public void setEjes(String eje) {
        this.eje = eje;
    }

    @Override
    public String toString() {
        return "Giroscopio{" +
                "rango=" + rango +
                ", rotacion='" + rotacion + '\'' +
                ", eje=" + eje +
                '}';
    }

    public void Scale() {
        System.out.println("Se agranda y achica un objeto en relación con un punto en el centro....");
    }
    public void Displacement (){
        System.out.println("Cambiando la posicion de un objeto...");
    }
    public void rotar() {
    this.rango++;
        if (this.rango > 90) {
            this.rango = 0;

        }






    }

}
