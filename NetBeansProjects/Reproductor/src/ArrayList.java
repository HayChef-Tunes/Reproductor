
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

class ArrayList {
	private int size;
	private int maxSize;
	private String[] arreglo;
	private final int MAX_SIZE = 777;

	ArrayList () {
		this.size = 0;
		this.maxSize = MAX_SIZE;
		this.arreglo = new String[this.maxSize];
	}

	public void add (String e) {
		if (this.size < this.maxSize) {
			this.arreglo [this.size] = e;
			this.size ++;
		}
		else {
			System.out.println ("Error");
		}
	}

	public int getSize () {
		return this.size;
	}

	public void getLista () {
		for (int a=0; a < this.size; a++) {
			System.out.println( arreglo [a]);
		}
	}
	
	public String getElemento (int indice) throws Exception {

		if (indice >= this.size){
			return this.arreglo [indice];

		}
		if (indice < this.size) {
			return this.arreglo [indice];
		}
            return null;
	}

	public String find (String e) {
		for (int i=0; i < this.size; i++) {
			if (e == arreglo[i]) {
				return "FIND";
			}
		}
		return "";
	}
        
        public void Clear(){
            this.size = 0;
        }

	public void delete (int e) {
		for (int i=0; i <= this.size; i++) {
			if (i == e) {
                                //arreglo[i].				//int c = i;
				//while (c < (this.size-1)){
					//arreglo[c] = arreglo[c+1];
					//c=c+1;
				}
				//this.size = i + c;
			}
		}
	}
//}














