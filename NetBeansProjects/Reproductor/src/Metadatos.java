import java.io.File;
import java.io.IOException;
import org.farng.mp3.MP3File;
import org.farng.mp3.TagException;
import org.farng.mp3.id3.ID3v1;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;


public class Metadatos {
    public static void main(String[] args) throws IOException, TagException {
		File sourceFile = new File("/home/max/Descargas/Bad Day.mp3");
		MP3File mp3file = new MP3File(sourceFile);
		ID3v1 tag = mp3file.getID3v1Tag();
                
                int duration = 0;
                try {
                AudioFile audioFile;
                audioFile = AudioFileIO.read(new File("/home/max/Descargas/Bad Day.mp3"));
                duration = audioFile.getAudioHeader().getTrackLength();
                } catch (Exception e) {
                e.printStackTrace();
                }
                
		System.out.println("Album: "+tag.getAlbum());
		System.out.println("Album Title: "+tag.getAlbumTitle());
		System.out.println("Title: "+tag.getTitle());
                System.out.println("Artist: "+tag.getArtist());
		System.out.println("Year: "+tag.getYear());
                System.out.println("Duracion: "+duration);
	}
}
