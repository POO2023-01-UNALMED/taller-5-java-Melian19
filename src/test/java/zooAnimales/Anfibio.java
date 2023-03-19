package zooAnimales;

public class Anfibio extends Animal {
	private static Anfibio[] listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	//metodos constructores
	
	public Anfibio(String name, int age, String lugar, String gen, String color, boolean estado){
		setNombre(name);
		setEdad(age);
		setHabitat(lugar);
		setGenero(gen);
		colorPiel = color;
		venenoso = estado;
		setTotalAnimales(getTotalAnimales()+1);
		Anfibio[] nuevosAnimales = new Anfibio[listado.length + 1];
		nuevosAnimales[0] = this;
		for (int i = 1; i < nuevosAnimales.length; i++){
			nuevosAnimales[i] = listado[i-1];
		}
		listado = nuevosAnimales;
	}
	public Anfibio(){
		setTotalAnimales(getTotalAnimales()+1);
		Anfibio[] nuevosAnimales = new Anfibio[listado.length + 1];
		nuevosAnimales[0] = this;
		for (int i = 1; i < nuevosAnimales.length; i++){
			nuevosAnimales[i] = listado[i-1];
		}
		listado = nuevosAnimales;
	}
	
	//metodos get y set
	

	public Anfibio[] getListado() {
		return listado;
	}
	public void setListado(Anfibio[] animales) {
		listado = animales;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String color) {
		colorPiel = color;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean estado) {
		venenoso = estado;
	}
	
	//metodos
	
	public String movimiento() {
		return "saltar";
	}
	
	public static int cantidadAnfibios() {
		return listado.length;
	}
	
	public void crearRana(String name, int age, String gen) {
		ranas ++;
		new Anfibio(name, age, "selva", gen, "rojo", true);
	}
	
	public void crearSalamandra(String name, int age, String gen) {
		salamandras ++;
		new Anfibio(name, age, "selva", gen, "negro y amarillo", false);
	}

}
