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

public class Ventana extends javax.swing.JFrame {
    Reproductor cancion = null;
    Metadatos informacion = null;
    public String Ruta;
    private static FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo MP3","mp3");
    
    /**
     * Constructor de la clase
     */
    public Ventana() {
        cancion = new Reproductor();
        informacion = new Metadatos();
        initComponents();
        this.setTitle("HayChef-Tunes");
        getContentPane().setBackground(new java.awt.Color(13,188,16));
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Datos = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        modelo = new DefaultListModel();
        jList1 = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        previous_song.setText("◄◄");

        play.setText("►/‖");
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });

        next_song.setText("►►");
        next_song.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_songActionPerformed(evt);
            }
        });

        add_song.setText(" + ");
        add_song.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_songActionPerformed(evt);
            }
        });

        delete_song.setText("-");
        delete_song.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_songActionPerformed(evt);
            }
        });

        stop.setText("█");
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/10613976_10202981559034008_418052797_n.jpg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animated_music.gif"))); // NOI18N

        Datos.setEditable(false);
        Datos.setBackground(new java.awt.Color(0, 0, 0));
        Datos.setColumns(20);
        Datos.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        Datos.setForeground(new java.awt.Color(255, 255, 255));
        Datos.setRows(5);
        Datos.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(Datos);

        jList1.setModel(modelo);
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(previous_song)
                        .addGap(18, 18, 18)
                        .addComponent(play)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(stop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(next_song)
                        .addGap(18, 18, 18)
                        .addComponent(add_song, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_song, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(previous_song)
                            .addComponent(play)
                            .addComponent(stop)
                            .addComponent(next_song)
                            .addComponent(add_song)
                            .addComponent(delete_song))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

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
            String file = dig.getSelectedFile().getPath();  //Obtener ruta y nombre al hacer click
            //Muestra nombre del archivo 
            String datos=informacion.datos(file);
            if (informacion.getRutaImagen()!=null){
                RutaImagen=informacion.getRutaImagen();
                ImageIcon imagen =new ImageIcon(RutaImagen);
                jLabel2.setIcon(imagen);
                imagen = null;
            }
            else{
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animated_music.gif")));
            }
            Datos.setText(datos);
            Ruta=file;
            modelo.addElement(informacion.Titulo);
            //txtname.setText("");
            //txtname.requestFocus();
            jList1.setSelectedIndex(0);
            
        }
    }//GEN-LAST:event_add_songActionPerformed
/**
 * 
 * @param evt 
 */
    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        String direccion = Ruta;
        try {
            if (modelo.getSize()>0){
                if (contador ==0){
                    try {
                        cancion.AbrirFichero(direccion);
                        cancion.Play();
                        contador=1;
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog (null, "Se produjo un error al intentar reproducir el archivo","Error",ERROR_MESSAGE);
                    }
                }

                else if (contador ==1){
                    try {
                        cancion.Pausa();
                        contador=2;
                    } catch (Exception ex) {
                        Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else {
                    try {
                        cancion.Continuar();
                        contador = 1;
                    } catch (Exception ex) {
                        Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } catch (Exception ex) {
                    JOptionPane.showMessageDialog (null, "Se produjo un error al intentar reproducir el archivo","Error",ERROR_MESSAGE);
                }
    
        
    }//GEN-LAST:event_playActionPerformed

/**
 * 
 * @param evt 
 */
    private void next_songActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_songActionPerformed

    }//GEN-LAST:event_next_songActionPerformed
/**
 * 
 * @param evt 
 */
    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        try {
            cancion.Stop();
            contador = 0;
        } catch (Exception ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_stopActionPerformed

    private void delete_songActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_songActionPerformed
        // TODO add your handling code here:
        if (modelo.getSize()>0){
            int n = jList1.getSelectedIndex();
            modelo.removeElementAt(n);
            jList1.setSelectedIndex(0);
        }
    }//GEN-LAST:event_delete_songActionPerformed
    
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
    private javax.swing.JTextArea Datos;
    private javax.swing.JButton add_song;
    private javax.swing.JButton delete_song;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private DefaultListModel modelo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton next_song;
    private javax.swing.JButton play;
    private javax.swing.JButton previous_song;
    private javax.swing.JButton stop;
    // End of variables declaration//GEN-END:variables
    public String RutaImagen = null;
    public int contador = 0;

    private String String(String Titulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
