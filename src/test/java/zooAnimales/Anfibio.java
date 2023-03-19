package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
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
		listado.add(this);
	}
	public Anfibio(){
		setTotalAnimales(getTotalAnimales()+1);
		listado.add(this);
	}
	
	//metodos get y set
	

	public ArrayList<Anfibio> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Anfibio> animales) {
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
		return listado.size();
	}
	
	public static Anfibio crearRana(String name, int age, String gen) {
		ranas ++;
		return new Anfibio(name, age, "selva", gen, "rojo", true);
	}
	
	public static Anfibio crearSalamandra(String name, int age, String gen) {
		salamandras ++;
		return new Anfibio(name, age, "selva", gen, "negro y amarillo", false);
	}

}
