import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.DefaultListModel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Clase Ventana se crea la interfaz del proyecto
 * @author mell
 */

/*soy max*/
public class Ventana extends javax.swing.JFrame {
    Reproductor cancion = null;
    Metadatos informacion = null;
    ArrayList LISTA = null;
    public String Ruta;
    public int indice = 0;
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

        HayChefTunes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/10613976_10202981559034008_418052797_n.jpg"))); // NOI18N

        ImagenPortada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barras.png"))); // NOI18N

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
                            .addComponent(Album, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(ImagenPortada, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(Etiquetatotalcanciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Elementos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ImagenPortada, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Etiquetatotalcanciones)
                    .addComponent(Elementos, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(Artista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Titulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Album)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                ListaCanciones.setSelectedIndex(indice);
                //indice++;
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
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog (null," Se produjo un error al intentar reproducir el archivo","Error",ERROR_MESSAGE);
                    }
                }

                else if (contador ==1){
                    try {
                        cancion.Pausa();
                        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconos/play.png")));
                        ImagenPortada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barras.png")));
                        contador=2;
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
    private void next_songActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_songActionPerformed
        try {
                cancion.Stop();
                cancion = null;
                cancion = new Reproductor();
            } catch (Exception ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
            int n = ListaCanciones.getSelectedIndex();
            String archivo;
        try {
                ListaCanciones.setSelectedIndex(++indice);
                archivo = LISTA.getElemento(n+1);
                String datos=informacion.datos(archivo);
                Datos.setText(datos);
                cancion.AbrirFichero(archivo);
                imagenlabel();
                cancion.Play();
            
            
        } catch (Exception ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_next_songActionPerformed
/**
 * 
 * @param evt 
 */
    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        try {
            cancion.Stop();
            play.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconos/play.png")));
            ImagenPortada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barras.png")));
            contador = 0;
        } catch (Exception ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_stopActionPerformed

    private void delete_songActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_songActionPerformed
        try {
            cancion.Stop();
            play.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconos/pause.png")));
            ImagenPortada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barras.png")));
        } catch (Exception ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
            if (modelo.getSize()>=0){
                int n = ListaCanciones.getSelectedIndex();
                modelo.removeElementAt(n);
                LISTA.delete(n);
                ListaCanciones.setSelectedIndex(--indice);
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
                cancion = null;
            } catch (Exception ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
            int n = ListaCanciones.getSelectedIndex();
            String archivo;
        try {

                ListaCanciones.setSelectedIndex(--indice);
                archivo = LISTA.getElemento(n-1);
                cancion = new Reproductor();
                String datos=informacion.datos(archivo);
                Datos.setText(datos);
                cancion.AbrirFichero(archivo);
                imagenlabel();
                cancion.Play();
            
        } catch (Exception ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
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
            } 
            catch (Exception ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
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
            } catch (Exception ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
    }//GEN-LAST:event_AlbumActionPerformed
    
    /**
     * Main de la clase Ventana
     * @param args 
     */
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
    private javax.swing.JTextArea Datos;
    private javax.swing.JLabel Elementos;
    private javax.swing.JLabel Etiquetatotalcanciones;
    private javax.swing.JLabel HayChefTunes;
    private javax.swing.JLabel ImagenPortada;
    private javax.swing.JList ListaCanciones;
    private DefaultListModel modelo;
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton Titulo;
    private javax.swing.JButton add_song;
    private javax.swing.JButton delete_song;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList listaBuscador;
    private DefaultListModel modelo2;
    private javax.swing.JButton next_song;
    private javax.swing.JButton play;
    private javax.swing.JButton previous_song;
    private javax.swing.JButton stop;
    // End of variables declaration//GEN-END:variables
    public String RutaImagen = null;
    public int contador = 0;
    public String nombre_txt;

    private String String(String Titulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void imagenlabel(){
        if (informacion.getRutaImagen()!=null){
            RutaImagen=informacion.getRutaImagen();
            ImageIcon imagen =new ImageIcon(RutaImagen);
            ImagenPortada.setIcon(imagen);
            imagen = null;
        }
        else if (informacion.getRutaImagen()==null){
            ImagenPortada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animated_music.gif")));
        }
        else{
            ImagenPortada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barras.png")));
        }
    }
}
