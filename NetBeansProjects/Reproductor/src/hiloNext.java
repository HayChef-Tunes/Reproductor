import java.util.logging.Level;
import java.util.logging.Logger;

public class hiloNext extends Thread{
    
    public long segundos;
    Ventana ventana = null;
    
    public hiloNext (long segundos){
        this.segundos = segundos;
    }
    
    public void run (){
        try {
            System.out.println(segundos);
            Thread.sleep(segundos * 1000);
            System.out.println("NEXT   ************************");
            ventana = new Ventana();
            ventana.next();
        } catch (InterruptedException ex) {
            Logger.getLogger(hiloNext.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }


}