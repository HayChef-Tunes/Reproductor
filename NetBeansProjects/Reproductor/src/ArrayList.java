import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

class ArrayList {
    /**
     * Declaracion de variables a utilizar
     * @author kevin clasede ArrayList
     */
	private int size;
        
	private int maxSize;
	private String[] arreglo;
	private final int MAX_SIZE = 777;

        /**
         * Se declara el valor de las variables que hacen falta 
         */
	public ArrayList () {
            
		this.size = 0;
		this.maxSize = MAX_SIZE;
		this.arreglo = new String[this.maxSize];
	}

        /**
         * Agregar elementos al arreglo con la condición sea menor al maximo la lista 
         * sino que tire error
         */
	public void add (String e) {

		if (this.size < this.maxSize) {
			this.arreglo [this.size] = e;
			this.size ++;
		}
		else {
			System.out.println ("Error");
		}
	}
        /**
         * Retorna el tamaño de la lista por medio del size
         * @return 
         */
	public int getSize () {
		return this.size;
	}
        
	/**
         * Obtener un elemento a travez de un indice mientras que el indice
         * se mantenga en la condicion que sea mayor o igual a 0 y indice sea 
         * menor o igual a size
         * 
         * 
         * @param indice
         * @return
         * @throws Exception 
         */
	public String getElemento (int indice) throws Exception {
                        
		if ((indice >= 0 ) && (indice <= this.size)){
                    return this.arreglo [indice];
                } else {
                }
                if (indice == 0) {
			JOptionPane.showMessageDialog (null," Es la ultima canción","Error",ERROR_MESSAGE);
            }
                return null;
        }
        
        /**
         * Busca un la direccion en el arreglo, recibe un string.
         * Recorre todo el arreglo con el for en el i, y lo compara con e.
         * @param e
         * @return 
         */
	public String find (String e) {
		for (int i=0; i < this.size; i++) {
			if (e == arreglo[i]) {
				return "FIND";
			}
		}
		return "";
	}
        /**
         * Limpia el arreglo
         */
        public void Clear(){
            this.size = 0;
        }
        
        /**
         * Borra un elemento de el arreglo, recibe un indice y en esa posicion lo 
         * compara un for y el indice que ingreso.
         * @param e 
         */
	public void delete (int e) {
		for (int i=0; i <= this.size; i++) {
			if (arreglo[i] == arreglo[e]) {
                                arreglo[e] = arreglo[++i];
                                --this.size;
                                
				}
				
			}
		}
	}















