class ArrayList {

	private int size;
	private int maxSize;
	private Metadatos[] arreglo;
	private final int MAX_SIZE = 777;

	private ArrayList () {
		this.size = 0;
		this.maxSize = MAX_SIZE;
		this.arreglo = new Metadatos[this.maxSize];
	}

	public void add (Metadatos e) {
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
	
	public Metadatos getElemento (int indice) throws Exception {
		if (indice >= this.size){
			throw new Exception();

		}
		else {
			return this.arreglo [indice];
		}
	}

	public String find (Metadatos e) {
		for (int i=0; i < this.size; i++) {
			if (e == arreglo[i]) {
				return "FIND";
			}
		}
		return "";
	}

	public void delete (Metadatos e) {
		for (int i=0; i < this.size; i++) {
			if (e == arreglo[i]) {
				int c =i;
				while (c < (this.size-2)){
					arreglo[c] = arreglo[c+1];
					c=c+1;
				}
				this.size = i + c;
			}
		}
	}
}














