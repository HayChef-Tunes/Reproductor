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
			throw new Exception();

		}
		else {
			return this.arreglo [indice];
		}
	}

	public String find (String e) {
		for (int i=0; i < this.size; i++) {
			if (e == arreglo[i]) {
				return "FIND";
			}
		}
		return "";
	}

	public void delete (String e) {
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














