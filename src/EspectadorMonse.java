import java.io.FileNotFoundException;

/**
 * Espectador concreto.
 */
public class EspectadorMonse extends Espectador implements Observador {

    /**
     * Constructor de la clase EspectadorMonse.
     * @param peleador favorito.
     */
    public EspectadorMonse(Peleador favorito) {
        super(favorito);
        nombre = "Monse";
        bitacora = "Bitacora de " + nombre + " \nPeleador favorito = " + favorito.obtenerNombre() + "\n";
    }

    /**
     * Metodo en el que si ya hay un ganador en la pelea genera un archivo de texto
     * con la bitacora completa.
     * Si aun no hay ganador agrega la ultima notificacion de combate a la bitacora.
     */
    @Override
    public void actualizar() {
        Peleador ganador = Bitacora.obtenerGanador();
        if (ganador != null) {
            String ganadorNombre = ganador.obtenerNombre();
            String peleadorFavoritoNombre = peleadorFavorito.obtenerNombre();
            if (ganadorNombre.equals(peleadorFavoritoNombre)) {
                bitacora += "Felicidades! ganó tu peleador favorito: " + peleadorFavoritoNombre;
            } else {
                bitacora += "Mala suerte, tu peleador favorito: " + peleadorFavoritoNombre + " perdio, el ganador es: "
                        + ganadorNombre;
            }
            try {
                escribirBitacoraEnArchivo();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            bitacora += "## " + Bitacora.obtenerUltimaModificacion() + " ##\n";
        }
    }

}
