package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal {
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	//metodos constructores
	
	public Reptil() {
		this("",0,"","","",0);
	}
	public Reptil(String name, int age, String lugar, String gen, String color, int largo) {
		setNombre(name);
		setEdad(age);
		setHabitat(lugar);
		setGenero(gen);
		colorEscamas = color;
		largoCola = largo;
		listado.add(this);
	}
	
	//metodos get y set
	public ArrayList<Reptil> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Reptil> lista) {
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
		return listado.size();
	}
	
	
	public static Reptil crearIguana(String name, int age, String gen) {
		iguanas ++;
		return new Reptil(name, age,"humedal", gen, "verde", 3);
	}
	
	public static Reptil crearSerpiente(String name, int age, String gen) {
		serpientes ++;
		return new Reptil(name, age, "jungla", gen, "blanco", 1);
	}

}
