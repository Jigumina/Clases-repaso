import ICO.fes.*;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Pais pais1 = new Pais("Japon", "Yenes", 125000000);
        System.out.println(pais1);
        pais1.atacar();

        Giroscopio giro = new Giroscopio(80, "derecha", "y");
        System.out.println(giro);
        giro.Scale();

        Computadora compu = new Computadora(125, "Apple", "windows");
        System.out.println(compu);
        compu.ejecutarprograma();

        cubo cubrub = new cubo("X", "Resuelto", 24);
        System.out.println(cubrub);
        cubrub.numMovi();

        Libro lib1 = new Libro(8, "goku","Guerras" );
        System.out.println(lib1);
        lib1.cambiarpag();

        Balón bal1 = new Balón("Grande", "plástico", Color.WHITE);
        System.out.println(bal1);
        bal1.rodando();

        Lámpara lamp = new Lámpara("Uline", "Encender", Color.YELLOW);
        System.out.println(lamp);
        lamp.encender();

        Gato cat = new Gato("Ramirez", "Naranja", (byte) 2);
        System.out.println(cat);
        cat.vestir();



    }
}