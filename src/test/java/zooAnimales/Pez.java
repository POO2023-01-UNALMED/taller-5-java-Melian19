package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal{
	
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	//metodos constructores
	
	public Pez() {
		this("",0,"","","",0);
	}
	public Pez(String name, int age, String lugar, String gen, String color, int cantidad) {
		setNombre(name);
		setEdad(age);
		setHabitat(lugar);
		setGenero(gen);
		colorEscamas = color;
		cantidadAletas = cantidad;
		listado.add(this);
	}
	
	//metodos get y set
	
	public ArrayList<Pez> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Pez> lista) {
		listado = lista;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String color) {
		colorEscamas = color;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidad) {
		cantidadAletas = cantidad;
	}
	
	//metodos	
	
	public String movimiento() {
		return "nadar";
	}
	
	public static int cantidadPeces() {
		return listado.size();
	}
	
	public static Pez crearSalmon(String name, int age, String gen) {
		salmones ++;
		return new Pez(name,age,"oceano",gen,"rojo",6);
	}
	
	public static Pez crearBacalao(String name, int age, String gen) {
		bacalaos ++;
		return new Pez(name,age,"oceano",gen,"gris",6);
	}

}

