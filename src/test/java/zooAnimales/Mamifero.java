package zooAnimales;

public class Mamifero extends Animal {
	private static Mamifero[] listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	//metodos constructores
	
	public Mamifero() {
		setTotalAnimales(getTotalAnimales()+1);
		Mamifero[] nuevosAnimales = new Mamifero[listado.length + 1];
		nuevosAnimales[0] = this;
		for (int i = 1; i < nuevosAnimales.length; i++){
			nuevosAnimales[i] = listado[i-1];
		}
		listado = nuevosAnimales;
		
	}
	public Mamifero(String name, int age, String lugar, String gen, boolean Pelo, int cantidad) {
		setNombre(name);
		setEdad(age);
		setHabitat(lugar);
		setGenero(gen);
		pelaje = Pelo;
		patas = cantidad;
		setTotalAnimales(getTotalAnimales()+1);
		Mamifero[] nuevosAnimales = new Mamifero[listado.length + 1];
		nuevosAnimales[0] = this;
		for (int i = 1; i < nuevosAnimales.length; i++){
			nuevosAnimales[i] = listado[i-1];
		}
		listado = nuevosAnimales;
	}
	
	//metodos get y set
	
	public Mamifero[] getListado() {
		return listado;
	}
	public void setListado(Mamifero[] lista) {
		listado = lista;
	}
	public boolean isPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelo) {
		pelaje = pelo;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int cantidad) {
		patas = cantidad;
	}
	
	//metodos
	
	
	
	public static int cantidadMamiferos() {
		return listado.length;
	}
	
	public Mamifero crearCaballo(String name, int age, String gen){
		caballos ++;
		return new Mamifero(name, age, "pradera", gen, true, 4); 		
	}
	
	public void crearLeon(String name, int age, String gen) {
		leones ++;
		new Mamifero(name, age, "selva", gen, true, 4);
	}

}
