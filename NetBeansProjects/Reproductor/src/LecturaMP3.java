import java.io.File;
import java.io.IOException;

import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.audio.mp3.MP3AudioHeader;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagException;
import org.jaudiotagger.tag.id3.AbstractID3v2Tag;
import org.jaudiotagger.tag.id3.ID3v1Tag;
import org.jaudiotagger.tag.id3.ID3v24Tag;



import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.jaudiotagger.tag.images.Artwork;

public class LecturaMP3 {

        private File testFile;
        private String _ruta;
        private MP3File f;
        private MP3AudioHeader audioHeader;
        private Tag tag;
        private AbstractID3v2Tag v2Tag;
        private ID3v1Tag v1Tag;
        private ID3v24Tag v24Tag;
       

        public LecturaMP3(String ruta) {
                // TODO Necesario surrondear con try-catch
                _ruta = ruta;
                testFile = new File(_ruta);
                try {
                        System.out.print("La informacion que sale a continuacion ");
                        System.out.println("sera consultada solo si se observa la consola.");
                        f = (MP3File) AudioFileIO.read(testFile);
                        audioHeader = (MP3AudioHeader) f.getAudioHeader();
                } catch (CannotReadException e) {
                        System.out.println("NO ES POSIBLE LEER EL ARCHIVO "+_ruta);
                        e.printStackTrace();
                } catch (IOException e) {
                        System.out.println("EXCEPCION DE ENTRADA/SALIDA");
                        e.printStackTrace();
                } catch (TagException e) {
                        System.out.println("EXCEPCION DE LA ETIQUETA");
                        e.printStackTrace();
                } catch (ReadOnlyFileException e) {
                        System.out.println("EXCEPCION: SOLO POSIBLE LECTURA");
                        e.printStackTrace();
                } catch (InvalidAudioFrameException e) {
                        System.out.println("FRAME DE AUDIO INVALIDO");
                        e.printStackTrace();
                }

                tag = f.getTag();
                                
                v1Tag = f.getID3v1Tag();
                v2Tag = f.getID3v2Tag();
                v24Tag = f.getID3v2TagAsv24();

        }

        public Tag getTag() {
                return tag;
        }

        public void setTag(Tag tag) {
                this.tag = tag;
        }

        public AbstractID3v2Tag getV2tag() {
                return v2Tag;
        }

        public void setV2tag(AbstractID3v2Tag v2tag) {
                this.v2Tag = v2tag;
        }

        public ID3v1Tag getV1Tag() {
                return v1Tag;
        }

        public void setV1Tag(ID3v1Tag tag) {
                v1Tag = tag;
        }

        public ID3v24Tag getV24tag() {
                return v24Tag;
        }

        public void setV24tag(ID3v24Tag v24tag) {
                this.v24Tag = v24tag;
        }

        public File getTestFile() {
                return testFile;
        }

        public void setTestFile(File testFile) {
                this.testFile = testFile;
        }

        public MP3File getF() {
                return f;
        }

        public void setF(MP3File f) {
                this.f = f;
        }

        public MP3AudioHeader getAudioHeader() {
                return audioHeader;
        }

        public void setAudioHeader(MP3AudioHeader audioHeader) {
                this.audioHeader = audioHeader;
        }

        public String get_ruta() {
                return _ruta;
        }

        public void set_ruta(String _ruta) {
                this._ruta = _ruta;
        }

        @Override
        public String toString() {
            String info = "";
            info += "v2Tag-Size: " + v2Tag.getSize()+ "\n";
            info += "v2Tag-List<Artwork>ArtworkList: " + v2Tag.getArtworkList()+ "\n";
            info += "v2Tag-CoverArt: " + v2Tag.getFirst(FieldKey.COVER_ART)+ "\n";
            return info;
                // TODO Obtenemos toda la informacion posible
                // TODO (Aunque nos dejamos mucha por poner en el ejemplo)
                /*info += "Ruta: " + _ruta + "\n";
                
                info += "AudioHeader: " + audioHeader.toString()+ "\n";
                
                info += "AudioHeader-Format: " + audioHeader.getFormat()+ "\n";
                info += "AudioHeader-MPEG-Layer: " + audioHeader.getMpegLayer()+ "\n";
                info += "AudioHeader-MPEG-Version: " + audioHeader.getMpegVersion()+ "\n";
                info += "AudioHeader-Track-Length: " + audioHeader.getTrackLength()+ "\n";
                info += "AudioHeader-Precise-Track-length: " + audioHeader.getPreciseTrackLength()+ "\n";
                info += "AudioHeader-Sample-Rate: " + audioHeader.getSampleRate()+ "\n";
                info += "AudioHeader-Bitrate: " + audioHeader.getBitRate()+ "\n";
                info += "AudioHeader-Channels: " + audioHeader.getChannels()+ "\n";
                info += "AudioHeader-Emphasis: " + audioHeader.getEmphasis()+ "\n";
                info += "AudioHeader-Encoder: " + audioHeader.getEncoder()+ "\n";
                info += "AudioHeader-EncodingType: " + audioHeader.getEncodingType()+"\n";
                info += "AudioHeader-Original: " + audioHeader.isOriginal() + "\n";
                info += "AudioHeader-Copyrighted: " + audioHeader.isCopyrighted() + "\n";
                info += "AudioHeader-Protected: " + audioHeader.isProtected() + "\n";

                info += "v1Tag: " + v1Tag.toString()+ "\n";
                info += "v1Tag-Encoding: " + v1Tag.getEncoding()+ "\n";
                info += "v1Tag-Field Count: " + v1Tag.getFieldCount()+ "\n";
                info += "v1Tag-First Genre: " + v1Tag.getFirstGenre()+ "\n";
                info += "v1Tag-First Artwork: " + v1Tag.getFirstArtwork()+ "\n";
                info += "v1Tag-FirstTitle: " + v1Tag.getFirstTitle() + "\n";
                info += "v1Tag-FirstTrack: " + v1Tag.getFirstTrack() + "\n";
                info += "v1Tag-FirstComment: " + v1Tag.getFirstComment() + "\n";
                info += "v1Tag-FirstYear: " + v1Tag.getFirstYear() + "\n";
                info += "v1Tag-Composer: " + v1Tag.getFirst(FieldKey.COMPOSER) + "\n";
                info += "v1Tag-Artist: " + v1Tag.getFirst(FieldKey.ARTIST) + "\n";
                info += "v1Tag-Album: " + v1Tag.getFirst(FieldKey.ALBUM) + "\n";
                info += "v1Tag-AMAZON ID: " + v1Tag.getFirst(FieldKey.AMAZON_ID) + "\n";
                info += "v1Tag-Genre: " + v1Tag.getFirst(FieldKey.GENRE) + "\n";
                info += "v1Tag-Title: " + v1Tag.getFirst(FieldKey.TITLE) + "\n";
                info += "v1Tag-Identifier: " + v1Tag.getIdentifier()+ "\n";
                info += "v1Tag-Major Version: " + v1Tag.getMajorVersion()+ "\n";
                info += "v1Tag-Release: " + v1Tag.getRelease()+ "\n";
                info += "v1Tag-Revision: " + v1Tag.getRevision()+ "\n";
                info += "v1Tag-List<Tagfield> ALBUM: " + v1Tag.getAlbum()+ "\n";
                info += "v1Tag-List<Tagfield> ARTISTS: " + v1Tag.getArtist()+ "\n";
                info += "v1Tag-List<Tagfield> ARTWORK: " + v1Tag.getArtworkList()+ "\n";
                info += "v1Tag-List<Tagfield> COMMENT: " + v1Tag.getComment()+ "\n";
                info += "v1Tag-List<Tagfield> GENRE: " + v1Tag.getGenre()+ "\n";
                
                
                
                
                info += "v1Tag-List<Tagfield> TITLE: " + v1Tag.getTitle()+ "\n";
                info += "v1Tag-List<Tagfield> TRACK: " + v1Tag.getTrack()+ "\n";
                info += "v1Tag-List<Tagfield> YEAR: " + v1Tag.getYear()+ "\n";
                
                info += "v2Tag: " + v2Tag.toString()+ "\n";
                
                info += "v2Tag-Identifier: " + v2Tag.getIdentifier()+ "\n";
                info += "v2Tag-DuplicateBytes: " + v2Tag.getDuplicateBytes()+ "\n";
                info += "v2Tag-DuplicateFrameID: " + v2Tag.getDuplicateFrameId()+ "\n";
                info += "v2Tag-EmptyFrameBytes: " + v2Tag.getEmptyFrameBytes()+ "\n";
                info += "v2Tag-FieldCount: " + v2Tag.getFieldCount()+ "\n";
                info += "v2Tag-FileReadBytes: " + v2Tag.getFileReadBytes()+ "\n";
//              info += "v2Tag-FrameCount: " + v2Tag.getFrameCount()+ "\n";
//              info += "v2Tag-InvalidFrameBytes: " + v2Tag.getInvalidFrameBytes()+ "\n";
                info += "v2Tag-MajorVersion: " + v2Tag.getMajorVersion()+ "\n";
                info += "v2Tag-Release " + v2Tag.getRelease()+ "\n";
                info += "v2Tag-Revision: " + v2Tag.getRevision()+ "\n";
                
                
                info += "v2Tag-Title: " + v2Tag.getFirst(FieldKey.TITLE)+ "\n";
                info += "v2Tag-Album: " + v2Tag.getFirst(FieldKey.ALBUM)+ "\n";
                info += "v2Tag-AmazonID: " + v2Tag.getFirst(FieldKey.AMAZON_ID)+ "\n";
                info += "v2Tag-BPM: " + v2Tag.getFirst(FieldKey.BPM)+ "\n";
                info += "v2Tag-Comment: " + v2Tag.getFirst(FieldKey.COMMENT)+ "\n";
                info += "v2Tag-Composer: " + v2Tag.getFirst(FieldKey.COMPOSER)+ "\n";
                info += "v2Tag-Genre: " + v2Tag.getFirst(FieldKey.GENRE)+ "\n";
                // TODO Para este, si hay dudas del valor que muestra, consultar en el enumerado de ID2v1Genres
                
                
//              info += "v2Tag-Conductor: " + v2Tag.getFirst(FieldKey.CONDUCTOR)+ "\n";
                // TODO NO TIENE?
                // TODO A VER COMO PROTEGEMOS CON UN KeyNotFoundException QUE LANZAN
                
                info += "v2Tag-Grouping: " + v2Tag.getFirst(FieldKey.GROUPING)+ "\n";
                info += "v2Tag-Is Compilation?: " + v2Tag.getFirst(FieldKey.IS_COMPILATION)+ "\n";
                info += "v2Tag-LANGUAGE: " + v2Tag.getFirst(FieldKey.LANGUAGE)+ "\n";
                info += "v2Tag-Mood: " + v2Tag.getFirst(FieldKey.MOOD)+ "\n";
//              info += "v2Tag-Remixer: " + v2Tag.getFirst(FieldKey.REMIXER)+ "\n";
                // TODO NO TIENE?
                info += "v2Tag-Track: " + v2Tag.getFirst(FieldKey.TRACK)+ "\n";
                info += "v2Tag-URL-LyricsSite: " + v2Tag.getFirst(FieldKey.URL_LYRICS_SITE)+ "\n";
                info += "v2Tag-OFFICIAL ARTIST SITE: " + v2Tag.getFirst(FieldKey.URL_OFFICIAL_ARTIST_SITE)+ "\n";
                info += "v2Tag-OFFICIAL RELEASE SITE: " + v2Tag.getFirst(FieldKey.URL_OFFICIAL_RELEASE_SITE)+ "\n";
                info += "v2Tag-WIKIPEDIA ARTIST: " + v2Tag.getFirst(FieldKey.URL_WIKIPEDIA_ARTIST_SITE)+ "\n";
            */    
                
        }
        public Object arreglobyte(){
            List<Artwork> artworkList = v2Tag.getArtworkList();
            return artworkList;
        }
        
        
        
        public static void main (String [] arg){
            //LecturaMP3 cancion1 = new LecturaMP3 ("/home/mell/Música/ACDC-Highway to Hell.mp3");
            LecturaMP3 cancion2 = new LecturaMP3 ("/home/mell/Música/F.c.p.r.e.m.i.x. - The fall of troy.mp3");
            //System.out.println(cancion1.toString());
            //System.out.println("FIIIIIIIIIIIIN");
            System.out.println(cancion2.toString());
            System.out.println(cancion2.arreglobyte()); // viene: PictureData="42148 bytes"; 
        }

}
