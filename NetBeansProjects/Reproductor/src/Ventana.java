/**
 * Se importan las librerias utilzadas en la clase
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Clase Ventana se crea la interfaz del proyecto
 */
public class Ventana extends javax.swing.JFrame implements Runnable{
          
    /**
     * Constructor de la clase
     * Las variables asignadas a clases se inician aqui para poderlas utilizar en todos los metodos
     */
    public Ventana() {
        cancion = new Reproductor();
        informacion = new Metadatos();
        LISTA = new ArrayList();
        initComponents();
        this.setTitle("HayChef-Tunes");
        getContentPane().setBackground(new java.awt.Color(0,0,0));
        Elementos.setText(String.valueOf(LISTA.getSize()));
        modificar_on.setVisible(false);
    }
    
    /**
     * Código de la interfaz generado por NetBeans
     */
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
        progress_bar = new javax.swing.JSlider();
        reloj = new javax.swing.JLabel();
        Modificar = new javax.swing.JButton();
        VaciarLista = new javax.swing.JButton();
        modificar_on = new javax.swing.JLabel();

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

        progress_bar.setValue(0);
        progress_bar.setEnabled(false);

        reloj.setForeground(new java.awt.Color(254, 254, 254));
        reloj.setText("00:00/00:00");

        Modificar.setText("Modificador");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        VaciarLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconos/limpiar2.png"))); // NOI18N
        VaciarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VaciarListaActionPerformed(evt);
            }
        });

        modificar_on.setBackground(new java.awt.Color(254, 250, 246));
        modificar_on.setForeground(new java.awt.Color(254, 254, 254));
        modificar_on.setText("Modoficador Activado");

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
                            .addComponent(Genero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Modificar, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificar_on))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(ImagenPortada, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(progress_bar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(reloj))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Etiquetatotalcanciones)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Elementos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(VaciarLista)))
                        .addGap(0, 10, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Artista)
                                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modificar_on)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Titulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Album)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Genero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Modificar))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ImagenPortada, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(progress_bar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(reloj)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Etiquetatotalcanciones)
                                .addComponent(Elementos, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(VaciarLista))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Etiquetatotalcanciones.getAccessibleContext().setAccessibleName("Canciones en Reproducción:");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Metodo para agregar una cancion a la Playlist
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
     * Metodo para reproducir la cancion
     * Tiene diferentes modalidades cambiadas a travez de un contador
     * Una reproduce la cancion
     * Dos pone en pausa la cancion
     * Tres reanuda la cancion en el momento en que fue detennida
     * Se extraen los metadatos de la cancion y los agrega a la interfaz
     * @param evt 
     */
    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
    //String direccion = Ruta;
    int i = ListaCanciones.getSelectedIndex();
    String elemento;
            // Reproducir
            if (modelo.getSize()>0){
                if (contador ==0){
                    try {
                        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconos/pause.png")));
                        elemento = LISTA.getElemento(i);
                        System.out.println(elemento);
                        String datos=informacion.datos(elemento);
                        cancionsonando = elemento;
                        Datos.setText(datos);
                        cancion.AbrirFichero(elemento);
                        imagenlabel();
                        cancion.Play();
                        contador=1;
                        segundos = informacion.getSegundos(elemento);
                        progress_bar.setMaximum((int) segundos);
                        siguiente = new Thread (this); // se crea el hilo para la progress bar y pasar de cancion cuando finalice la que se reproduce actualmente
                        siguiente.start();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog (null," Se produjo un error al intentar reproducir el archivo","Error",ERROR_MESSAGE);
                    }
                }
                //Parar
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
                //Reanudar
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
     * Metodo para pasar a la siguiente canción de la Playlist
     * Si no hay siguiente cancion volvera a reproducir la misma
     * Se extraen los metadatos de la cancion y los agrega a la interfaz
     * @param evt 
     */
    @SuppressWarnings("empty-statement")
    private void next_songActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_songActionPerformed
        /**
         * Detiene la canción declara canción null, y crea una nueva instancia.
         */
        try {
                    cancion.Stop();
                    siguiente.stop();
                    cancion = null;
                    cancion = new Reproductor();
                } catch (Exception ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
        String archivo;
        int n = ListaCanciones.getSelectedIndex();
        if (n+1 == LISTA.getSize()){
                /**
                 * Toma el select que tiene el mouse y declara archivo como String
                 * toma el select y le suma 1 para abrir ese archivo.
                 * Se agregan las canciones al recuadro de playlist
                 */
            try {
                    play.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconos/pause.png")));
                    ListaCanciones.setSelectedIndex(0);
                    archivo = LISTA.getElemento(0);
                    String datos=informacion.datos(archivo);
                    Datos.setText(datos);
                    cancion.AbrirFichero(archivo);
                    imagenlabel();
                    cancion.Play();
                    segundos = informacion.getSegundos(archivo);
                    progress_bar.setMaximum((int) segundos);
                    siguiente = new Thread (this); // se crea el hilo para la progress bar y pasar de cancion cuando finalice la que se reproduce actualmente
                    siguiente.start();
                    contador =1;
            } catch (Exception ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        else{    
                /**
                 *Si n mas 1 es mayor al size entonces la lista de reproduccion
                 * inicia de nuevo entonces empieza a reproducir la primera 
                 * canción
                 * Se agregan las canciones al recuadro de playlist
                 */
            try {
                    play.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconos/pause.png")));
                    ListaCanciones.setSelectedIndex(n+1);
                    archivo = LISTA.getElemento(n+1);
                    String datos=informacion.datos(archivo);
                    Datos.setText(datos);
                    cancion.AbrirFichero(archivo);
                    imagenlabel();
                    cancion.Play();
                    segundos = informacion.getSegundos(archivo);
                    progress_bar.setMaximum((int) segundos);
                    siguiente = new Thread (this); // se crea el hilo para la progress bar y pasar de cancion cuando finalice la que se reproduce actualmente
                    siguiente.start();
                    contador =1;
            } catch (Exception ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 

    }//GEN-LAST:event_next_songActionPerformed
  
    /**
     * Funcion que detiene por completo la cancion y el hilo
     * Pone la progress bar en 0 y el reloj tambien
     * @param evt 
     */
    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        try {
            cancion.Stop();
            siguiente.stop();
            progress_bar.setValue(0);
            reloj.setText("00:00/00:00");
            play.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconos/play.png")));
            ImagenPortada.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconos/barras.png")));
            contador = 0;
            Datos.setText("");
        } catch (Exception ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_stopActionPerformed
    /**
     * Metodo para eliminar canción de la playlist
     * @param evt 
     */
    private void delete_songActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_songActionPerformed
        int n = ListaCanciones.getSelectedIndex();
        
        try {
            /**
             * Condicion por si la cancion que se va a eliminar es la que esta 
             * reproduciendo en ese momento
             */
            if (cancionsonando ==  LISTA.getElemento(n)){
                try {
                    /**
                     * Sila ruta cancionsonando es igual a el elemento obtenido
                     * de la lista entonces la musica se detiene y borra el 
                     * que se encuentra sonando en ese momento
                     */
                    cancion.Stop();
                    play.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconos/pause.png")));
                    ImagenPortada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barras.png")));
                } catch (Exception ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (modelo.getSize()>=0){

                    modelo.removeElementAt(n);
                    LISTA.delete(n);
                    //ListaCanciones.setSelectedIndex(n-1);
                    Datos.setText("");
                    Elementos.setText(String.valueOf(LISTA.getSize()));
                }
            }
            else{
                /**
                 * Si la ruta de cancionsonando es distinta a la que esta en 
                 * reproduccion entonces se remueve el elemento sin detener la 
                 * musica 
                 */
                    modelo.removeElementAt(n);
                    LISTA.delete(n);
                    //ListaCanciones.setSelectedIndex(n-1);
                    Datos.setText("");
                    Elementos.setText(String.valueOf(LISTA.getSize()));
            }

            cancion.Stop();
            play.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconos/pause.png")));
            ImagenPortada.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconos/barras.png")));

        } catch (Exception ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_delete_songActionPerformed
        /**
         * Metodo para vaciar donde se encuentra el playlist, metadatos 
         * y el ArrayList que es donde se encuentran las direcciones de las 
         * canciones que se han agregado al reproductor
         * @param evt 
         */
    private void VaciarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VaciarListaActionPerformed
        try {
            // TODO add your handling code here:
            play.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconos/play.png")));
            ImagenPortada.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconos/barras.png")));
            LISTA.Clear();
            cancion.Stop();
            progress_bar.setMaximum(0);
            contador = 0;
            Datos.setText("");
            Elementos.setText("0");
            modelo.removeAllElements();
            siguiente.stop();
        } catch (Exception ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_VaciarListaActionPerformed

    /**
     * Metodo para pasar a la anterior canción de la Playlist
     * Si no hay anterior cancion se volvera a reproducir la misma
     * Se extraen los metadatos de la cancion y los agrega a la interfaz
     * @param evt
     */
    private void previous_songActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previous_songActionPerformed
        // TODO add your handling code here:
        /**
         * Detiene la canción declara canción null, y crea una nueva instancia.
         */
          try {
                cancion.Stop();
                siguiente.stop();
                cancion = null;
                cancion = new Reproductor();
            } catch (Exception ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
          /**
           * Toma el select que tiene el mouse y declara archivo como String
           * toma el select y le resta 1 para abrir ese archivo.
           * 
           */
            int n = ListaCanciones.getSelectedIndex();
            String archivo;
            if (n-1 != -1){
                /**
                 * Toma el select que tiene el mouse y declara archivo como String
                 * toma el select y le resta 1 para abrir ese archivo.
                 * Se agregan las canciones al recuadro de playlist
                 */
                try {
                        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconos/pause.png")));
                        ListaCanciones.setSelectedIndex(n-1);
                        archivo = LISTA.getElemento(n-1);
                        String datos=informacion.datos(archivo);
                        Datos.setText(datos);
                        cancion.AbrirFichero(archivo);
                        imagenlabel();
                        cancion.Play();
                        segundos = informacion.getSegundos(archivo);
                        progress_bar.setMaximum((int) segundos);
                        siguiente = new Thread (this); // se crea el hilo para la progress bar y pasar de cancion cuando finalice la que se reproduce actualmente
                        siguiente.start();
                        contador =1;
                } catch (Exception ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                /**
                 * Toma el select que tiene y si es -1 selecciona y reproduce 
                 * la ultima canción.
                 * Se agregan las canciones al recuadro de playlist
                 */
            try {
                    play.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconos/pause.png")));
                    ListaCanciones.setSelectedIndex(LISTA.getSize()-1);
                    archivo = LISTA.getElemento(LISTA.getSize()-1);
                    String datos=informacion.datos(archivo);
                    Datos.setText(datos);
                    cancion.AbrirFichero(archivo);
                    imagenlabel();
                    cancion.Play();
                    segundos = informacion.getSegundos(archivo);
                    progress_bar.setMaximum((int) segundos);
                    siguiente = new Thread (this); // se crea el hilo para la progress bar y pasar de cancion cuando finalice la que se reproduce actualmente
                    siguiente.start();
                    contador =1;
                } catch (Exception ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
    }//GEN-LAST:event_previous_songActionPerformed
    /**
     * Campo de texto de donde los botones artista,titulo, album y genero
     * sacan la informacion para remplazar por el metadato o para busca en la lista el dato
     * introducido
     * @param evt 
     */
    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        
    }//GEN-LAST:event_NombreActionPerformed
    /**
     * Boton multifuncion de busqueda avanzada por artista y modificacion del metadato artista
     * @param evt 
     */
    private void ArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArtistaActionPerformed
        /**
        * Funcion que busca dentro de la playlist si hay algun mp3 del Artista introducido
        */
        if(modificador==0){
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
        }
        /**
         * Funcion que cambia el metadato de Artista por el introducido
         */
        else{
            try {
                int i = ListaCanciones.getSelectedIndex();
                String elemento;
                String genero;
                String titulo;
                String album;
                String duracion;
                String año;
                String artista;
                String nl = System.getProperty("line.separator");
                elemento = LISTA.getElemento(i);
                genero="Genero: "+informacion.getGenero(elemento);
                album="Album: "+informacion.getAlbum(elemento);
                titulo="Titulo: "+informacion.getTitulo(elemento);
                año="Año: "+informacion.getAño(elemento);
                duracion="Duracion: "+String.valueOf(informacion.getSegundos(elemento));
                artista="Artista: "+Nombre.getText();
                Datos.setText(titulo+nl+album+nl+artista+nl+año+nl+genero+nl+duracion+"s");
                modificador=0;
                modificar_on.setVisible(false);
            } catch (Exception ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }//GEN-LAST:event_ArtistaActionPerformed
    /**
     * Boton multifuncion de busqueda avanzada por titulo y modificacion del metadato titulo
     * @param evt 
     */
    private void TituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TituloActionPerformed
        /**
         * Funcion que busca dentro de la playlist si hay algun mp3 con el titulo introducido
         */
        if(modificador==0){
        modelo2.clear();
        Metadatos direccion = new Metadatos();
        /**
        * Recorre la lista de reproduccion buscando mp3 con el titulo introducido
        */
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
        }
        /**
         * Funcion que cambia el metadato de Titulo por el introducido
         */
        else{
            try {
                int i = ListaCanciones.getSelectedIndex();
                String elemento;
                String genero;
                String titulo;
                String album;
                String duracion;
                String año;
                String artista;
                String nl = System.getProperty("line.separator");
                elemento = LISTA.getElemento(i);
                genero="Genero: "+informacion.getGenero(elemento);
                album="Album: "+informacion.getAlbum(elemento);
                titulo="Titulo: "+Nombre.getText();
                año="Año: "+informacion.getAño(elemento);
                duracion="Duracion: "+String.valueOf(informacion.getSegundos(elemento));
                artista="Artista: "+informacion.getArtista(elemento);
                Datos.setText(titulo+nl+album+nl+artista+nl+año+nl+genero+nl+duracion+"s");
                modificador=0;
                modificar_on.setVisible(false);
            } catch (Exception ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }//GEN-LAST:event_TituloActionPerformed
    /**
     * Boton multifuncion de busqueda avanzada por album y modificacion del metadato album
     * @param evt 
     */
    private void AlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlbumActionPerformed
        /**
         * Funcion que busca dentro de la playlist si hay algun mp3 del album introducido
         */
        if(modificador==0){
        modelo2.clear();
        Metadatos direccion = new Metadatos();
        /**
        * Recorre toda la lista
        */
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
        }
        /**
         * Funcion que cambia el metadato de Album por el introducido
         */
        else{
            try {
                int i = ListaCanciones.getSelectedIndex();
                String elemento;
                String genero;
                String titulo;
                String album;
                String duracion;
                String año;
                String artista;
                String nl = System.getProperty("line.separator");
                elemento = LISTA.getElemento(i);
                genero="Genero: "+informacion.getGenero(elemento);
                album="Album: "+Nombre.getText();
                titulo="Titulo: "+informacion.getTitulo(elemento);
                año="Año: "+informacion.getAño(elemento);
                duracion="Duracion: "+String.valueOf(informacion.getSegundos(elemento));
                artista="Artista: "+informacion.getArtista(elemento);
                Datos.setText(titulo+nl+album+nl+artista+nl+año+nl+genero+nl+duracion+"s");
                modificador=0;
                modificar_on.setVisible(false);
            } catch (Exception ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }//GEN-LAST:event_AlbumActionPerformed
    /**
     * Boton multifuncion de busqueda avanzada por genero y modificacion del metadato genero
     * @param evt 
     */
    private void GeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneroActionPerformed
        /**
         * Funcion que busca dentro de la playlist si hay algun mp3 del genero introducido
         */
        if(modificador==0){
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
        }
        /**
         * Funcion que cambia el metadato de Genero por el introducido
         */
        else{
            try {
                int i = ListaCanciones.getSelectedIndex();
                String elemento;
                String genero;
                String titulo;
                String album;
                String duracion;
                String año;
                String artista;
                String nl = System.getProperty("line.separator");
                elemento = LISTA.getElemento(i);
                genero="Genero: "+Nombre.getText();
                album="Album: "+informacion.getAlbum(elemento);
                titulo="Titulo: "+informacion.getTitulo(elemento);
                año="Año: "+informacion.getAño(elemento);
                duracion="Duracion: "+String.valueOf(informacion.getSegundos(elemento));
                artista="Artista: "+informacion.getArtista(elemento);
                Datos.setText(titulo+nl+album+nl+artista+nl+año+nl+genero+nl+duracion+"s");
                modificador=0;
                modificar_on.setVisible(false);
            } catch (Exception ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }//GEN-LAST:event_GeneroActionPerformed
    /**
     * Funcion que habilita la funcion de modificacion 
     * en los botones de artista, tittulo, album y genero
     * @param evt 
     */
    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        modificador=1;
        modificar_on.setVisible(true);
    }//GEN-LAST:event_ModificarActionPerformed

    /**
     * Main de la clase ventana
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
    private javax.swing.JButton Genero;
    private javax.swing.JLabel HayChefTunes;
    private javax.swing.JLabel ImagenPortada;
    private javax.swing.JList ListaCanciones;
    private DefaultListModel modelo;
    private javax.swing.JButton Modificar;
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton Titulo;
    private javax.swing.JButton VaciarLista;
    private javax.swing.JButton add_song;
    private javax.swing.JButton delete_song;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList listaBuscador;
    private DefaultListModel modelo2;
    private javax.swing.JLabel modificar_on;
    public javax.swing.JButton next_song;
    private javax.swing.JButton play;
    private javax.swing.JButton previous_song;
    private javax.swing.JSlider progress_bar;
    private javax.swing.JLabel reloj;
    private javax.swing.JButton stop;
    // End of variables declaration//GEN-END:variables
    public String Ruta;
    private String cancionsonando = "";
    public String RutaImagen = null;
    public String nombre_txt;
    private static final FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo MP3","mp3");
    public int contador = 0;
    public int modificador = 0;
    public int mins = 0;
    public int segs;
    public int tiempo = 1;
    public long segundos;
    public boolean nexo = true;
    
    /**
     * Se declaran las variables de clases
     */
    Reproductor cancion = null;
    Metadatos informacion = null;
    ArrayList LISTA = null;
    Thread siguiente;
    
    /**
     * Metodo que agarra la ruta de la imagen, si existe, y la muestra en la interfaz
     * Si no esta la ruta significa que el mp3 no tiene imagen y cambia por otra imagen predeterminada
     */
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
    
    /**
     *Esta funcion es identica al boton next, solo que se llama desde otro metodo por eso no recibe el parametro de evt (al hacer clik se activa)
     * Se extraen los metadatos de la cancion y los agrega a la interfaz 
     */
    public void next(){
        try {
                    cancion.Stop();
                    cancion = null;
                    cancion = new Reproductor();
                } catch (Exception ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
        String archivo;
        int n = ListaCanciones.getSelectedIndex();
        if (n+1 == LISTA.getSize()){
            try {
                    play.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconos/pause.png")));
                    ListaCanciones.setSelectedIndex(0);
                    archivo = LISTA.getElemento(0);
                    String datos=informacion.datos(archivo);
                    Datos.setText(datos);
                    cancion.AbrirFichero(archivo);
                    imagenlabel();
                    cancion.Play();
                    segundos = informacion.getSegundos(archivo);
                    progress_bar.setMaximum((int) segundos);
                    siguiente = new Thread (this); // se crea el hilo para la progress bar y pasar de cancion cuando finalice la que se reproduce actualmente
                    siguiente.start();
                    contador =1;
            } catch (Exception ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        else{    
            try {
                    play.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconos/pause.png")));
                    ListaCanciones.setSelectedIndex(n+1);
                    archivo = LISTA.getElemento(n+1);
                    String datos=informacion.datos(archivo);
                    Datos.setText(datos);
                    cancion.AbrirFichero(archivo);
                    imagenlabel();
                    cancion.Play();
                    segundos = informacion.getSegundos(archivo);
                    progress_bar.setMaximum((int) segundos);
                    siguiente = new Thread (this); // se crea el hilo para la progress bar y pasar de cancion cuando finalice la que se reproduce actualmente
                    siguiente.start();
                    contador =1;
            } catch (Exception ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }
    
    /**
     * Este es el metodo que inicia el hilo al darle star a la variable siguiente de la clase Thread
     * Funciona con los segundos de la cancion y una variable que se incrementa en uno por cada segundo
     * Cuando la variable es igual a los segundos totales de la cancion se llama al metodo next para reproducir la siguiente cancion en la PLaylist
     * Ademas el progress bar y el reloj se incrementan en uno por segundo en el Thread
     */
    public void run (){
        try {
            int segundero = 0;
            while(true){
                while(nexo){
                    progress_bar.setValue(segundero);
                    reloj.setText(prog(segundero, (int) segundos));
                    Thread.sleep(1000);
                    segundero++;
                    if (segundero == segundos){
                        mins = 0;
                        segs = 0;
                        tiempo = 1;
                        progress_bar.setValue(0);
                        next();
                        siguiente.destroy();
                    }
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Metodo que retorna los segundos actuales mpas el tiempo total de la cancion
     * @param act segundos actuales
     * @param total total de segundos de la cancion
     * @return String con los segundos actuales y los muestra en un label
     */
    public String prog(int act, int total){
        segs = act;
        if (act == (60 * tiempo)){
            segs = segs -(60 * tiempo++);
            mins ++;
        }
        else{
            segs = segs -(60 * mins);
        }
        if(segs<10){
            return String.valueOf(mins) + ":0" + String.valueOf(segs) + "/" + total(total);
        }
        else {
            return String.valueOf(mins) + ":" + String.valueOf(segs) + "/" + total(total);
        }
    }
    
    /**
     * Metodo que cambia los segundos totales a minutos
     * @param t tiempo en segundos totales de la cancion
     * @return String del tiempo de duracion de la cancion
     */
    public String total(int t){
        int min,s; 
        min = t / 60;  
        s= t -(min * 60);
        String tot = min +":"+ s;
        return tot;
    }
}
