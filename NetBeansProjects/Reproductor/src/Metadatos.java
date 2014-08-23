import java.awt.image.BufferedImage;
import java.io.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.farng.mp3.MP3File;
import org.farng.mp3.TagException;
import org.farng.mp3.id3.ID3v1;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.images.Artwork;

/**
 *
 * @author max
 */
public class Metadatos {
    String nl = System.getProperty("line.separator");

    public String Titulo;
    public String Album;
    public String Artista;
    public String Año;
    public String Duración;
    public String ImagenRuta = null;
    private Tag etiquetas;
    private Artwork Portada;
    /**
     *
     * @param ruta
     * @return
     */
    public String datos (String ruta){
        try {
            File sourceFile = new File(ruta);
            MP3File mp3file = new MP3File(sourceFile);
            ID3v1 tag = mp3file.getID3v1Tag();
            int duration = 0;
        try {
            AudioFile audioFile;
            audioFile = AudioFileIO.read(new File(ruta));
            duration = audioFile.getAudioHeader().getTrackLength();
            etiquetas=audioFile.getTag();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Portada=etiquetas.getFirstArtwork();
        if (Portada != null){
            InputStream entradadatos = new ByteArrayInputStream (Portada.getBinaryData());

            BufferedImage imageBuffer = ImageIO.read(entradadatos); 
            int ancho = imageBuffer.getWidth();
            int alto = imageBuffer.getHeight();
            File imagen=new File(ruta+".jpg");
            ImageIO.write(imageBuffer,"jpg",imagen);
            ImagenRuta = (ruta+".jpg");
            
        }    
         else {
            ImagenRuta = null;
        }

        Titulo="Titulo: "+tag.getTitle();
        Album="Album: "+tag.getAlbum();
        Artista="Artista: "+tag.getArtist();
        Año="Año: "+tag.getYear();
        Duración="Duración: "+duration+"s";
        } catch (IOException ex) {
            Logger.getLogger(Metadatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TagException ex) {
            Logger.getLogger(Metadatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Titulo+nl+Album+nl+Artista+nl+Año+nl+Duración;
    }
    
    public String getRutaImagen(){
        return ImagenRuta;
    
    }
    
}
