/**
 * Se cargan las librerias necesarias para que todo el código funcione a la perfección
 */
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
import org.farng.mp3.id3.AbstractID3v2;
import org.farng.mp3.id3.ID3v1;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.images.Artwork;

/**
 * Clase de Metadatos encargada de sacar los metadatos de los mp3
 */
public class Metadatos {
    String nl = System.getProperty("line.separator");//variable utilizada para saltos de linea
    /**
     * Variables que se utilizaran para los distintos metadatos
     */
    public String Titulo;
    public String Album;
    public String Artista;
    public String Genero;
    public String Año;
    public String Duración;

    /**
     * Se declaran las variables a utilizar para la caratula del album del mp3 que se reproduce
     */
    public String ImagenRuta = null;
    private Tag etiquetas;
    private Artwork Portada;
    /**
     * Funcion que extrae la imagen, la duracion y otros metadatos de los archivos 
     * @param ruta
     * @return Los metadatos de el archivo
     * @throws java.lang.Exception
     */
    public String datos (String ruta) throws Exception{
        try {
            File sourceFile = new File(ruta);
            MP3File mp3file = new MP3File(sourceFile);
            AbstractID3v2 tag = mp3file.getID3v2Tag();
            int duration = 0;
            /**
             * Se define el archivo del que se extraera el metadato y los tipos de tags
             */
        try {
            AudioFile audioFile;
            audioFile = AudioFileIO.read(new File(ruta));
            duration = audioFile.getAudioHeader().getTrackLength();
            etiquetas=audioFile.getTag();
        } catch (Exception e) {
            e.printStackTrace();
        }
        /**
         * En esta parte del codigo se saca la imagen del mp3, 
         * luego se crea en una BufferedImage, se recorta la imagen 
         * y finalmente la gurdamos en la misma ruta del mp3,
         * por lo tanto se guarda en una variable la ruta de la imagen para despues
         * en la interfaz (Class Ventana) solo abrir la imagen y colocarla en el label
         */
        Portada = etiquetas.getFirstArtwork();
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
        /**
        * Se extraen los distitos metadatos con las funciones get...
        */ 
        Titulo="Titulo: "+tag.getSongTitle();
        Album="Album: "+tag.getAlbumTitle();
        Artista="Artista: "+tag.getLeadArtist();
        Año="Año: "+tag.getYearReleased();
        Genero="Genero: "+tag.getSongGenre();
        Duración="Duración: "+duration+"s";  
        } catch (IOException ex) {
            Logger.getLogger(Metadatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TagException ex) {
            Logger.getLogger(Metadatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Titulo+nl+Album+nl+Artista+nl+Año+nl+Genero+nl+Duración;
    }
    
    /**
     * Metodo para adquirir la ruta de la imagen de la caratura del album del mp3, 
     * la cual esta almacenada en la variable ImagenRuta
     * @return ImagenRuta (ruta de la imagen creada por el metodo datos)
     */
    public String getRutaImagen(){
        return ImagenRuta;
    }
    
    /**
     * Funcion que obtiene el metadato sobre el artista del archivo
     * @param ruta
     * @return El artista del archivo
     */
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
    /**
     * Funcion que extrae por separado el Titulo del audio
     * @param ruta
     * @return Titulo del archivo
     */
    public String getTitulo(String ruta){
        String titulo;
        try {
            File sourceFile = new File(ruta);
            MP3File mp3file = new MP3File(sourceFile);
            ID3v1 tag = mp3file.getID3v1Tag();
            titulo=tag.getSongTitle();
            return titulo;
        } catch (IOException ex) {
            Logger.getLogger(Metadatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TagException ex) {
            Logger.getLogger(Metadatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    /**
     * Funcion que extrae por separado el Genero del audio
     * @param ruta
     * @return Genero del archivo
     */
    public String getGenero(String ruta){
        String genero;
        try {
            File sourceFile = new File(ruta);
            MP3File mp3file = new MP3File(sourceFile);
            AbstractID3v2 tag = mp3file.getID3v2Tag();
            genero=tag.getSongGenre();
            return genero;
        } catch (IOException ex) {
            Logger.getLogger(Metadatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TagException ex) {
            Logger.getLogger(Metadatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    /**
     * Funcion que extrae por separado el Año de creacion del audio
     * @param ruta
     * @return Año de creacion del archivo
     */
    public String getAño(String ruta){
        String Año;
        try {
            File sourceFile = new File(ruta);
            MP3File mp3file = new MP3File(sourceFile);
            AbstractID3v2 tag = mp3file.getID3v2Tag();
            Año=tag.getYearReleased();
            return Año;
        } catch (IOException ex) {
            Logger.getLogger(Metadatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TagException ex) {
            Logger.getLogger(Metadatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * Funcion que obtiene el metadato sobre el Album del archivo
     * @param ruta
     * @return Album del archivo
     */
    public String getAlbum(String ruta){
        String album;
        try {
            File sourceFile = new File(ruta);
            MP3File mp3file = new MP3File(sourceFile);
            ID3v1 tag = mp3file.getID3v1Tag();
            album=tag.getAlbumTitle();
            return album;
        } catch (IOException ex) {
            Logger.getLogger(Metadatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TagException ex) {
            Logger.getLogger(Metadatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    /**
     * Funcion que extrae por separado la duracion del audio 
     * @param ruta
     * @return La duracion en segundos del archivo
     */
    public long getSegundos(String ruta){
        try {
            long duration = 0;
            AudioFile audioFile;
            audioFile = AudioFileIO.read(new File(ruta));
            duration = audioFile.getAudioHeader().getTrackLength();
            return duration;
        } catch (CannotReadException ex) {
            Logger.getLogger(Metadatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Metadatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (org.jaudiotagger.tag.TagException ex) {
            Logger.getLogger(Metadatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ReadOnlyFileException ex) {
            Logger.getLogger(Metadatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidAudioFrameException ex) {
            Logger.getLogger(Metadatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
