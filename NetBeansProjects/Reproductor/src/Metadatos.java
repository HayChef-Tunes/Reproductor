import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
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
    public String datos (String ruta) throws Exception{
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
            BufferedImage dest = new BufferedImage(250, 250, BufferedImage.TYPE_INT_RGB);
            
            Graphics2D g = dest.createGraphics();
            AffineTransform at = AffineTransform.getScaleInstance((double)250 / ancho, (double)250 / alto);
            g.drawRenderedImage(imageBuffer, at);
            
            File imagen=new File(ruta+".jpg");
            ImageIO.write(dest,"JPG",imagen);
            ImagenRuta = (ruta+".jpg");
            File direccion = new File(ruta); 
                        
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
    
    public String getArtista(String ruta){
        String artista;
        try {
            
            File sourceFile = new File(ruta);
            MP3File mp3file = new MP3File(sourceFile);
            ID3v1 tag = mp3file.getID3v1Tag();
            artista=tag.getArtist();
            return artista;
        } catch (IOException ex) {
            Logger.getLogger(Metadatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TagException ex) {
            Logger.getLogger(Metadatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public String getTitulo(String ruta){
        String titulo;
        try {
            File sourceFile = new File(ruta);
            MP3File mp3file = new MP3File(sourceFile);
            ID3v1 tag = mp3file.getID3v1Tag();
            titulo=tag.getTitle();
            return titulo;
        } catch (IOException ex) {
            Logger.getLogger(Metadatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TagException ex) {
            Logger.getLogger(Metadatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public String getAlbum(String ruta){
        String album;
        try {
            File sourceFile = new File(ruta);
            MP3File mp3file = new MP3File(sourceFile);
            ID3v1 tag = mp3file.getID3v1Tag();
            album=tag.getAlbum();
            return album;
        } catch (IOException ex) {
            Logger.getLogger(Metadatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TagException ex) {
            Logger.getLogger(Metadatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }       
}
