import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.io.File;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagOptionSingleton;
import org.jaudiotagger.tag.id3.ID3v23Tag;
import org.jaudiotagger.tag.images.Artwork;
import org.jaudiotagger.tag.images.ArtworkFactory;


    public class image {

        public static void main(String args[])
        {
            TimeFrame frame = new TimeFrame();
        }
    }

    class TimeFrame extends JFrame
    {
        java.net.URL imgUrl = TimeFrame.class.getResource("/10613976_10202981559034008_418052797_n.jpg");
        ImageIcon icon = new ImageIcon(imgUrl);
        JLabel label = new JLabel(icon);
        
        public TimeFrame(){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("My Frame");
            setSize(500,400);
            add(label,BorderLayout.CENTER);
            setVisible(true);}
            
        /*public void  ejem (){
            Mp3File song = new Mp3File("/home/mell/Música/F.c.p.r.e.m.i.x. - The fall of troy.mp3");
            if (song.hasId3v2Tag()){
                 ID3v2 id3v2tag = song.getId3v2Tag();
                 byte[] imageData = id3v2tag.getAlbumImage();
                 //converting the bytes to an image
                 BufferedImage img = ImageIO.read(new ByteArrayInputStream(imageData));
            }
        }*/
        
       /*public void ejem(String ruta){ 
            try{
                testFile = new File(ruta);
                TagOptionSingleton.getInstance().setAndroid(true);
                AudioFile f =AudioFileIO.read(file_path_to_mp3);
                f.setTag(new ID3v23Tag());
                Tag tag=f.getTag();
                Artwork cover=ArtworkFactory.createArtworkFromFile(cover_file);
                tag.setField(cover);
                f.commit();
            }catch (Exception e){
                e.printStackTrace();
            }
        

       }*/
    }