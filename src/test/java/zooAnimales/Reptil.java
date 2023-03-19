package zooAnimales;

public class Reptil extends Animal {
	private static Reptil[] listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	//metodos constructores
	
	public Reptil() {
		setTotalAnimales(getTotalAnimales()+1);
		Reptil[] nuevosAnimales = new Reptil[listado.length + 1];
		nuevosAnimales[0] = this;
		for (int i = 1; i < nuevosAnimales.length; i++){
			nuevosAnimales[i] = listado[i-1];
		}
		listado = nuevosAnimales;
	}
	public Reptil(String name, int age, String lugar, String gen, String color, int largo) {
		setNombre(name);
		setEdad(age);
		setHabitat(lugar);
		setGenero(gen);
		colorEscamas = color;
		largoCola = largo;
		setTotalAnimales(getTotalAnimales()+1);
		Reptil[] nuevosAnimales = new Reptil[listado.length + 1];
		nuevosAnimales[0] = this;
		for (int i = 1; i < nuevosAnimales.length; i++){
			nuevosAnimales[i] = listado[i-1];
		}
		listado = nuevosAnimales;
	}
	
	//metodos get y set
	public Reptil[] getListado() {
		return listado;
	}
	public void setListado(Reptil[] lista) {
		listado = lista;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String color) {
		colorEscamas = color;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largo) {
		largoCola = largo;
	}
	
	//metodos
	
	public String movimiento() {
		return "reptar";
	}
	
	public static int cantidadReptiles() {
		return listado.length;
	}
	
	
	public void crearIguana(String name, int age, String gen) {
		iguanas ++;
		new Reptil(name, age,"humedal", gen, "verde", 3);
	}
	
	public void crearSerpiente(String name, int age, String gen) {
		serpientes ++;
		new Reptil(name, age, "jungla", gen, "blanco", 1);
	}

}
