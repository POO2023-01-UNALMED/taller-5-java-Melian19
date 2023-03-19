package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal {
	
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	//metodos constructores
	
	public Ave(String name, int age, String lugar, String gen, String color) {
		setNombre(name);
		setEdad(age);
		setHabitat(lugar);
		setGenero(gen);
		colorPlumas = color;
		listado.add(this);
	}
	public Ave() {
		setTotalAnimales(getTotalAnimales()+1);
		listado.add(this);
	}
	
	//metodos get y set
	
	public ArrayList<Ave> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Ave> lista) {
		listado = lista;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String color) {
		colorPlumas = color;
	}
	
	//metodos
	
	public String movimiento() {
		return "volar";
	}
	
	public static int cantidadAves() {
		return listado.size();
	}
	
	public static Ave crearHalcon(String name, int age, String gen) {
		halcones ++;
		return new Ave(name, age, "montanas", gen, "cafe glorioso");
	}
	
	public static Ave crearAguila(String name, int age, String gen) {
		aguilas ++;
		return new Ave(name, age, "montanas", gen, "blanco y amarillo");
	}
	
}
