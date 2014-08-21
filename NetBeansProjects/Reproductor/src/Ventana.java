import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class Ventana extends javax.swing.JFrame {
    Reproductor cancion = null;
    
    public Ventana() {
        cancion = new Reproductor();
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
        play_list = new javax.swing.JTextField();
        label_play_list = new javax.swing.JLabel();
        stop = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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

        play_list.setEditable(false);
        play_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_listActionPerformed(evt);
            }
        });

        label_play_list.setFont(new java.awt.Font("Nimbus Sans L", 0, 18)); // NOI18N
        label_play_list.setForeground(new java.awt.Color(1, 1, 1));
        label_play_list.setText("Play List");

        stop.setText("█");
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/10613976_10202981559034008_418052797_n.jpg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animated_music.gif"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label_play_list, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(previous_song)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(play)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stop)
                        .addGap(10, 10, 10)
                        .addComponent(next_song)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add_song, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_song, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addComponent(play_list, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_play_list, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(previous_song)
                            .addComponent(play)
                            .addComponent(stop)
                            .addComponent(next_song)
                            .addComponent(add_song)
                            .addComponent(delete_song))
                        .addGap(24, 24, 24)
                        .addComponent(play_list, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_songActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_songActionPerformed
        JFileChooser dig = new JFileChooser();  //Crea un objeto de dialogo JFileChooser
        int option = dig.showOpenDialog(this);  // Abre la ventana en dialogo
        if (option == JFileChooser.APPROVE_OPTION){
            String file = dig.getSelectedFile().getPath();  //Obtener ruta y nombre al hacer click
            play_list.setText(file); //Muestra nombre del archivo         
        }
    }//GEN-LAST:event_add_songActionPerformed

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        String direccion = play_list.getText();
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
    }//GEN-LAST:event_playActionPerformed

    private void play_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_listActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_play_listActionPerformed

    private void next_songActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_songActionPerformed

    }//GEN-LAST:event_next_songActionPerformed

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        try {
            cancion.Stop();
            contador = 0;
        } catch (Exception ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_stopActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_song;
    private javax.swing.JButton delete_song;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel label_play_list;
    private javax.swing.JButton next_song;
    private javax.swing.JButton play;
    private javax.swing.JTextField play_list;
    private javax.swing.JButton previous_song;
    private javax.swing.JButton stop;
    // End of variables declaration//GEN-END:variables
    public int contador = 0;
}