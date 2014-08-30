import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.farng.mp3.AbstractMP3Tag;
import org.farng.mp3.MP3File;
import org.farng.mp3.TagException;
import org.farng.mp3.id3.AbstractID3v2;
import org.farng.mp3.id3.ID3v1;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.exceptions.CannotWriteException;
import org.jaudiotagger.tag.FieldDataInvalidException;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.KeyNotFoundException;
import org.jaudiotagger.tag.Tag;

/**
 * Clase Ventana se crea la interfaz del proyecto
 * @author mell
 */

public class Ventana extends javax.swing.JFrame implements Runnable{
    
    public String Ruta;
    private static FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo MP3","mp3");
    
    /**
     * Constructor de la clase
     */
    public Ventana() {
        cancion = new Reproductor();
        informacion = new Metadatos();
        LISTA = new ArrayList();
        
        initComponents();
        this.setTitle("HayChef-Tunes");
        getContentPane().setBackground(new java.awt.Color(0,0,0));
        Elementos.setText(String.valueOf(LISTA.getSize()));
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        previous_song = new javax.swing.JButton();
        play = new javax.swing.JButton();
        next_song = new javax.swing.JButton();
        add_song = new javax.swing.JButton();
        delete_song = new javax.swing.JButton();
        stop = new javax.swing.JButton();
        HayChefTunes = new javax.swing.JLabel();
        ImagenPortada = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Datos = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        modelo = new DefaultListModel();
        ListaCanciones = new javax.swing.JList();
        Etiquetatotalcanciones = new javax.swing.JLabel();
        Elementos = new javax.swing.JLabel();
        Artista = new javax.swing.JButton();
        Nombre = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaBuscador = new javax.swing.JList();
        Titulo = new javax.swing.JButton();
        Album = new javax.swing.JButton();
        Genero = new javax.swing.JButton();
        DatoNuevo = new javax.swing.JTextField();
        BotonArtista = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        progress_bar = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        previous_song.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconos/ant.png"))); // NOI18N
        previous_song.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previous_songActionPerformed(evt);
            }
        });

        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconos/play.png"))); // NOI18N
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });

        next_song.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconos/sig.png"))); // NOI18N
        next_song.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_songActionPerformed(evt);
            }
        });

        add_song.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconos/list-add.png"))); // NOI18N
        add_song.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_songActionPerformed(evt);
            }
        });

        delete_song.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconos/list-remove.png"))); // NOI18N
        delete_song.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_songActionPerformed(evt);
            }
        });

        stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconos/stop.png"))); // NOI18N
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        HayChefTunes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconos/10613976_10202981559034008_418052797_n.jpg"))); // NOI18N

        ImagenPortada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconos/barras.png"))); // NOI18N

        Datos.setEditable(false);
        Datos.setBackground(new java.awt.Color(0, 0, 0));
        Datos.setColumns(20);
        Datos.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        Datos.setForeground(new java.awt.Color(255, 255, 255));
        Datos.setRows(5);
        jScrollPane2.setViewportView(Datos);

        ListaCanciones.setModel(modelo);
        jScrollPane1.setViewportView(ListaCanciones);

        Etiquetatotalcanciones.setForeground(new java.awt.Color(248, 236, 236));
        Etiquetatotalcanciones.setText("Lista de Reproduccion:");

        Elementos.setForeground(new java.awt.Color(249, 235, 235));

        Artista.setText("Artista");
        Artista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArtistaActionPerformed(evt);
            }
        });

        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        modelo2 = new DefaultListModel();
        listaBuscador = new javax.swing.JList();
        listaBuscador.setModel(modelo2);
        jScrollPane3.setViewportView(listaBuscador);

        Titulo.setText("Titulo");
        Titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TituloActionPerformed(evt);
            }
        });

        Album.setText("Album");
        Album.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlbumActionPerformed(evt);
            }
        });

        Genero.setText("Genero");
        Genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneroActionPerformed(evt);
            }
        });

        BotonArtista.setText("Artista");
        BotonArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonArtistaActionPerformed(evt);
            }
        });

        jButton2.setText("Genero");

        jButton3.setText("Album");

        jButton4.setText("Titulo");

        progress_bar.setValue(0);
        progress_bar.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HayChefTunes, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(previous_song)
                        .addGap(18, 18, 18)
                        .addComponent(play, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(next_song, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(add_song, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete_song, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Nombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Titulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Artista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Album, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Genero, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DatoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BotonArtista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(109, 109, 109))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addContainerGap(122, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Etiquetatotalcanciones)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Elementos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(ImagenPortada, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(progress_bar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(HayChefTunes, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(next_song, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete_song, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(play, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_song, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(previous_song, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(Artista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Titulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Album)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Genero)
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addComponent(ImagenPortada, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progress_bar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Etiquetatotalcanciones, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Elementos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(DatoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonArtista)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addContainerGap())))
        );

        Etiquetatotalcanciones.getAccessibleContext().setAccessibleName("Canciones en Reproducción:");

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * 
 * @param evt 
 */
    private void add_songActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_songActionPerformed
        JFileChooser dig = new JFileChooser();  //Crea un objeto de dialogo JFileChooser
        dig.setFileFilter(filter);
        int option = dig.showOpenDialog(this);  // Abre la ventana en dialogo
        if (option == JFileChooser.APPROVE_OPTION){
            try {
                String file = dig.getSelectedFile().getPath();  //Obtener ruta y nombre al hacer click
                //Muestra nombre del archivo
                String datos=informacion.datos(file);
                Ruta=file;
                modelo.addElement(informacion.Titulo);
                LISTA.add(file);
                Elementos.setText(String.valueOf(LISTA.getSize()));
            } catch (Exception ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_add_songActionPerformed
/**
 * 
 * @param evt 
 */
    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed

    //String direccion = Ruta;
    int i = ListaCanciones.getSelectedIndex();
    String elemento;
    
            if (modelo.getSize()>0){
                if (contador ==0){
                    try {
                        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconos/pause.png")));
                        elemento = LISTA.getElemento(i);
                        String datos=informacion.datos(elemento);
                        Datos.setText(datos);
                        cancion.AbrirFichero(elemento);
                        imagenlabel();
                        cancion.Play();
                        contador=1;
                        segundos = informacion.getSegundos(elemento);
                        progress_bar.setMaximum((int) segundos);
                        siguiente = new Thread (this);
                        siguiente.start();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog (null," Se produjo un error al intentar reproducir el archivo","Error",ERROR_MESSAGE);
                    }
                }

                else if (contador ==1){
                    try {
                        cancion.Pausa();
                        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconos/play.png")));
                        ImagenPortada.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconos/barras.png")));
                        contador=2;
                        siguiente.suspend();
                    } catch (Exception ex) {
                        Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else {
                    try {
                        cancion.Continuar();
                        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconos/pause.png")));
                        imagenlabel();
                        contador = 1;
                        siguiente.resume();
                    } catch (Exception ex) {
                        Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
    }//GEN-LAST:event_playActionPerformed

/**
 * 
 * @param evt 
 */
    @SuppressWarnings("empty-statement")
    private void next_songActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_songActionPerformed
        try {
                    cancion.Stop();
                    siguiente.stop();
                    progress_bar.setValue(0);
                    cancion = null;
                    cancion = new Reproductor();
                } catch (Exception ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
        String archivo;
        int n = ListaCanciones.getSelectedIndex();
        if (n+1 == LISTA.getSize()){
            try {
                    ListaCanciones.setSelectedIndex(0);
                    archivo = LISTA.getElemento(0);
                    
                    String datos=informacion.datos(archivo);
                    Datos.setText(datos);
                    cancion.AbrirFichero(archivo);
                    imagenlabel();
                    cancion.Play();
                    segundos = informacion.getSegundos(archivo);
                    progress_bar.setMaximum((int) segundos);
                    siguiente = new Thread (this);
                    siguiente.start();
            } catch (Exception ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        else{    
            try {
                    ListaCanciones.setSelectedIndex(n+1);
                    archivo = LISTA.getElemento(n+1);
                    String datos=informacion.datos(archivo);
                    Datos.setText(datos);
                    cancion.AbrirFichero(archivo);
                    imagenlabel();
                    cancion.Play();
                    segundos = informacion.getSegundos(archivo);
                    progress_bar.setMaximum((int) segundos);
                    siguiente = new Thread (this);
                    siguiente.start();
            } catch (Exception ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 

    }//GEN-LAST:event_next_songActionPerformed
/**
 * 
 * @param evt 
 */
    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        try {
            cancion.Stop();
            siguiente.stop();
            play.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconos/play.png")));
            ImagenPortada.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconos/barras.png")));
            contador = 0;
            Datos.setText("");
        } catch (Exception ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_stopActionPerformed

    private void delete_songActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_songActionPerformed
        try {
            cancion.Stop();
            play.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconos/pause.png")));
            ImagenPortada.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconos/barras.png")));
        } catch (Exception ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
            if (modelo.getSize()>=0){
                int n = ListaCanciones.getSelectedIndex();
                modelo.removeElementAt(n);
                LISTA.delete(n);
                //ListaCanciones.setSelectedIndex(n-1);
                Datos.setText("");
                Elementos.setText(String.valueOf(LISTA.getSize()));
            }
            //if (modelo.getSize() >= 0){
              // Datos.setText("");            
            //}
    }//GEN-LAST:event_delete_songActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            cancion.Stop();
            Datos.setText("");
            modelo.removeAllElements();
        } catch (Exception ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void previous_songActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previous_songActionPerformed
        // TODO add your handling code here:
          try {
                cancion.Stop();
                siguiente.stop();
                progress_bar.setValue(0);
                cancion = null;
                cancion = new Reproductor();
            } catch (Exception ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
            int n = ListaCanciones.getSelectedIndex();
            String archivo;
            if (n-1 != -1){
                try {
                        ListaCanciones.setSelectedIndex(n-1);
                        archivo = LISTA.getElemento(n-1);
                        String datos=informacion.datos(archivo);
                        Datos.setText(datos);
                        cancion.AbrirFichero(archivo);
                        imagenlabel();
                        cancion.Play();
                        segundos = informacion.getSegundos(archivo);
                        progress_bar.setMaximum((int) segundos);
                        siguiente = new Thread (this);
                        siguiente.start();
                } catch (Exception ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
            try {
                        ListaCanciones.setSelectedIndex(LISTA.getSize()-1);
                        archivo = LISTA.getElemento(LISTA.getSize()-1);
                        String datos=informacion.datos(archivo);
                        Datos.setText(datos);
                        cancion.AbrirFichero(archivo);
                        imagenlabel();
                        cancion.Play();
                        segundos = informacion.getSegundos(archivo);
                        progress_bar.setMaximum((int) segundos);
                        siguiente = new Thread (this);
                        siguiente.start();

                } catch (Exception ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
    }//GEN-LAST:event_previous_songActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        
    }//GEN-LAST:event_NombreActionPerformed

    private void ArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArtistaActionPerformed
        modelo2.clear();
        Metadatos direccion = new Metadatos();
        for(int i=0;i<LISTA.getSize();i++){
            try {
                String ruta = LISTA.getElemento(i);
                String artista = direccion.getArtista(ruta);
                String nombre = direccion.getTitulo(ruta);
                nombre_txt = Nombre.getText();
                if (artista.equals(nombre_txt)){
                    modelo2.addElement(nombre);
                }
            } catch (Exception ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        /**
         * Funcion que busca dentro de la playlist si hay algun mp3 del Artista introducido
         */
    }//GEN-LAST:event_ArtistaActionPerformed

    private void TituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TituloActionPerformed
        modelo2.clear();
        Metadatos direccion = new Metadatos();
        for(int i=0;i<LISTA.getSize();i++){
            try {
                String ruta = LISTA.getElemento(i);
                String nombre = direccion.getTitulo(ruta);
                nombre_txt = Nombre.getText();
                if (nombre.equals(nombre_txt)){
                    modelo2.addElement(nombre);
                }
                /**
                 * Recorre la lista de reproduccion buscando mp3 con el titulo introducido
                 */
            } 
            catch (Exception ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        /**
         * Funcion que busca dentro de la playlist si hay algun mp3 con el titulo introducido
         */
    }//GEN-LAST:event_TituloActionPerformed

    private void AlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlbumActionPerformed
        modelo2.clear();
        Metadatos direccion = new Metadatos();
        for(int i=0;i<LISTA.getSize();i++){
            try {
                String ruta = LISTA.getElemento(i);
                String album = direccion.getAlbum(ruta);
                String nombre = direccion.getTitulo(ruta);
                nombre_txt = Nombre.getText();
                if (album.equals(nombre_txt)){
                    modelo2.addElement(nombre);
                }
                /**
                 * Recorre toda la lista
                 */
            } catch (Exception ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        /**
         * Funcion que busca dentro de la playlist si hay algun mp3 del album introducido
         */
    }//GEN-LAST:event_AlbumActionPerformed

    private void GeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneroActionPerformed
        modelo2.clear();
        Metadatos direccion = new Metadatos();
        for(int i=0;i<LISTA.getSize();i++){
            try {
                String ruta = LISTA.getElemento(i);
                String genero = direccion.getGenero(ruta);
                String nombre = direccion.getTitulo(ruta);
                nombre_txt = Nombre.getText();
                if (genero.equals(nombre_txt)){
                    modelo2.addElement(nombre);
                }
            } catch (Exception ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        /**
         * Funcion que busca dentro de la playlist si hay algun mp3 del genero introducido
         */
    }//GEN-LAST:event_GeneroActionPerformed

    private void BotonArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonArtistaActionPerformed
        int i = ListaCanciones.getSelectedIndex();
        String elemento=null;
        try {
            elemento=LISTA.getElemento(i);
        } catch (Exception ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            File sourceFile = new File(elemento);
            MP3File mp3file = new MP3File(sourceFile);
            AbstractID3v2 tag = mp3file.getID3v2Tag();
            tag.setSongGenre(DatoNuevo.getText());
        } catch (IOException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TagException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotonArtistaActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    
    /**
     * Se declaran las variables
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Album;
    private javax.swing.JButton Artista;
    private javax.swing.JButton BotonArtista;
    private javax.swing.JTextField DatoNuevo;
    private javax.swing.JTextArea Datos;
    private javax.swing.JLabel Elementos;
    private javax.swing.JLabel Etiquetatotalcanciones;
    private javax.swing.JButton Genero;
    private javax.swing.JLabel HayChefTunes;
    private javax.swing.JLabel ImagenPortada;
    private javax.swing.JList ListaCanciones;
    private DefaultListModel modelo;
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton Titulo;
    private javax.swing.JButton add_song;
    private javax.swing.JButton delete_song;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList listaBuscador;
    private DefaultListModel modelo2;
    public javax.swing.JButton next_song;
    private javax.swing.JButton play;
    private javax.swing.JButton previous_song;
    private javax.swing.JSlider progress_bar;
    private javax.swing.JButton stop;
    // End of variables declaration//GEN-END:variables
    public String RutaImagen = null;
    public int contador = 0;
    public String nombre_txt;
    public long segundos;
    public boolean nexo = true;
    Reproductor cancion = null;
    Metadatos informacion = null;
    ArrayList LISTA = null;
    Thread siguiente;
    
    public void imagenlabel(){
        if (informacion.getRutaImagen()!=null){
            RutaImagen=informacion.getRutaImagen();
            ImageIcon imagen =new ImageIcon(RutaImagen);
            ImagenPortada.setIcon(imagen);
            imagen = null;
        }
        else if (informacion.getRutaImagen()==null){
            ImagenPortada.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconos/animated_music.gif")));
        }
        else{
            ImagenPortada.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconos/barras.png")));
        }
    }
    
    public void next(){
        try {
                    cancion.Stop();
                    progress_bar.setValue(0);
                    cancion = null;
                    cancion = new Reproductor();
                } catch (Exception ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
        String archivo;
        int n = ListaCanciones.getSelectedIndex();
        if (n+1 == LISTA.getSize()){
            try {
                    ListaCanciones.setSelectedIndex(0);
                    archivo = LISTA.getElemento(0);
                    
                    String datos=informacion.datos(archivo);
                    Datos.setText(datos);
                    cancion.AbrirFichero(archivo);
                    imagenlabel();
                    segundos = informacion.getSegundos(archivo);
                    progress_bar.setMaximum((int) segundos);
                    cancion.Play();
                    siguiente = new Thread (this);
                    siguiente.start();
            } catch (Exception ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        else{    
            try {
                    ListaCanciones.setSelectedIndex(n+1);
                    archivo = LISTA.getElemento(n+1);
                    String datos=informacion.datos(archivo);
                    Datos.setText(datos);
                    cancion.AbrirFichero(archivo);
                    imagenlabel();
                    cancion.Play();
                    segundos = informacion.getSegundos(archivo);
                    progress_bar.setMaximum((int) segundos);
                    siguiente = new Thread (this);
                    siguiente.start();
            } catch (Exception ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }
    
    public void run (){
        try {
            int segundero = 0;
            while(true){
                while(nexo){
                progress_bar.setValue(segundero);
                Thread.sleep(1000);
                segundero++;
                if (segundero == segundos){
                    progress_bar.setValue(0);
                    next();
                }
            }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
