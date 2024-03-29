import java.util.concurrent.ThreadLocalRandom;
/**
 * Transformacion de Korby la cual representa a Korby transformado en ReyDeDeDe
 * con su forma de pelear personalizada.
 */
public class ReyDeDeDe implements KorbyPoder{

    /**
     * Constructor de la clase de ReyDeDeDe
     */
    public ReyDeDeDe() {
        super();
    }

    /**
     * Este metodo ejecuta ataques personalizados de ReyDeDeDe
     * @return regresa un int con el danio causado al rival
     */
    @Override
    public int ejecutarAtaque() {
        int randomNum = ThreadLocalRandom.current().nextInt(1, 3 + 1);
        if (randomNum == 1) {
            Bitacora.registrarAccionDePelea( "Korby-Dedede hizo un lanzamiento de gordo");
            return 10;
        } else if (randomNum == 2) {
            Bitacora.registrarAccionDePelea("Korby-Dedede se burlo tanto de los otros oponentes que perdieron vida");
            return 12;
        } else {
            Bitacora.registrarAccionDePelea("Korby-Dedede conto un chiste de Eugenio Derbez, " +
                    "eso no le hizo daño a nadie. Pero fue un chiste tan malo que los demas perdieron vida");
            return 15;
        }
    }

    /**
     * Este metodo ejecuta la defensa personalizada de ReyDeDeDe
     * @param fuerza la fuerza recibida del golpe dado por el rival
     * @return el danio total recibido(danio enemigo - fuerza de defenza)
     */
    @Override
    public int ejecutarDefensa( int fuerza) {
        Bitacora.registrarAccionDePelea("Korby-Dedede nunca tomo clases de defensa personal, pero al menos intento meter las manos.");
        int golpeRecibido = fuerza - 3;
        if (golpeRecibido <= 0) {
            golpeRecibido = 8;
        }
        return golpeRecibido;
    }

}
