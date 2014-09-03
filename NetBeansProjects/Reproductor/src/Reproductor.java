/**
 * Se importan librerias utilizadas en la clase
 * Libreria BasicPlayer es externa y la encargada de reproducir los mp3
 */
import javazoom.jlgui.basicplayer.BasicPlayer;
import java.io.File;

   /**
    * Clase Reproductor
    */ 
public class Reproductor {

    /**
     *Varible player, el cual es de la clase BasicPlayer
     */
    public BasicPlayer player;
    
    /**
    * Constructor de la clase reproductor
    */
   public Reproductor(){
       player = new BasicPlayer();
   }
   
   /**
    * Metodo que reproduce la canción
    * @throws Exception 
    */
   public void Play() throws Exception {
        player.play();
   }
   
   /**
    * Metodo que abre el archivo
    * @param ruta
    * @throws Exception 
    */
   public void AbrirFichero(String ruta) throws Exception {
       if (ruta != null ){
           player.open(new File(ruta));
       }
   }
   
   /**
    * Pone pausa a la cancion que se reproduce actualmente
    * @throws Exception 
    */
   public void Pausa() throws Exception {
        player.pause();
   }
   
   /**
    * Metodo que reauna la cancion en el mismo punto en donde se pauso
    * @throws Exception 
    */
   public void Continuar() throws Exception {
        player.resume();
   }
   
   /**
    * Metodo que para por completo la canción, y reproducira desde cera la proxima vez que se haga Play
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