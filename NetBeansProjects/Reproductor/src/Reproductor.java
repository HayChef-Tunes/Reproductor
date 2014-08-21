import javazoom.jlgui.basicplayer.BasicPlayer;
import java.io.File;
   /**
    * Clase Reproductor
    * @author mell
    */ 
public class Reproductor {
public BasicPlayer player;
    /**
     * Constructor de la clase reproductor
     */
public Reproductor(){
player = new BasicPlayer();
}
/**
 * 
 * @throws Exception 
 */
public void Play() throws Exception {
player.play();
}
/**
 * 
 * @param ruta
 * @throws Exception 
 */
public void AbrirFichero(String ruta) throws Exception {
player.open(new File(ruta));
}
/**
 * 
 * @throws Exception 
 */
public void Pausa() throws Exception {
player.pause();
}
/**
 * 
 * @throws Exception 
 */
public void Continuar() throws Exception {
player.resume();
}
/**
 * 
 * @throws Exception 
 */
public void Stop() throws Exception {
player.stop();
}
    /**
     * Main de la clase reproductor
     * @param args 
     */
   public static void main(String args[]){}
    }