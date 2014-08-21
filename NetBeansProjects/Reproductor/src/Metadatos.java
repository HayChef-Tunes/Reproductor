import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.farng.mp3.MP3File;
import org.farng.mp3.TagException;
import org.farng.mp3.id3.ID3v1;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;

public class Metadatos {
    String nl = System.getProperty("line.separator");
    public String Datos;
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
            } catch (Exception e) {
                e.printStackTrace();
            }
            Datos=("Album: "+tag.getAlbum()+nl+"Titulo: "+tag.getTitle()+nl+
                    "Artista: "+tag.getArtist()+nl+"Ano: "+tag.getYear()+nl+
                    "Duracion: "+duration+"s");
                } catch (IOException ex) {
                Logger.getLogger(Metadatos.class.getName()).log(Level.SEVERE, null, ex);
                } catch (TagException ex) {
            Logger.getLogger(Metadatos.class.getName()).log(Level.SEVERE, null, ex);
        }
            return Datos;
    }
    
    public static void main(String[] args) throws IOException, TagException {
	}
}
