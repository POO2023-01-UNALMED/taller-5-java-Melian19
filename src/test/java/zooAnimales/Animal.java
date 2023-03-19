package zooAnimales;
import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	//metodos constructores
	
	public Animal() {
		totalAnimales ++;
		nombre = null;
		habitat = null;
		genero = null;
		zona = null;
	}
	public Animal(String name, int age, String lugar, String gen) {
		totalAnimales ++;
		nombre = name;
		edad = age;
		habitat = lugar;
		genero = gen;
		zona = null;
	}
	
	//metodos get
	
	public int getTotalAnimales() {
		return totalAnimales;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public String getHabitat() {
		return habitat;
	}
	public String getGenero() {
		return genero;
	}
	public Zona getZona() {
		return zona;
	}
	
	//metodos set
	
	public void setTotalAnimales(int cantidad) {
		totalAnimales = cantidad;
	}
	public void setNombre(String name) {
		nombre = name;
	}
	public void setEdad(int age) {
		edad = age;
	}
	public void setHabitat(String lugar) {
		habitat = lugar;
	}
	public void setGenero(String gen) {
		genero = gen;
	}
	public void setZona(Zona zone) {
		zona = zone;
	}
	
	//metodos
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public String totalPorTipo() {
		return "Mamiferos: " + Mamifero.cantidadMamiferos() + "\nAves: " + Ave.cantidadAves() 
		+ "\nReptiles: " + Reptil.cantidadReptiles() + "\nPeces: " + Pez.cantidadPeces() + "\nAnfibios: " + 
				Anfibio.cantidadAnfibios();	
	}
	
	public String toString() {
		if (zona != null) {
			return "Mi nombre es "+ nombre + ", tengo una edad de " + edad + ", habito en " + habitat + 
					"y mi genero es " + genero + ", la zona en la que me ubico es" + zona.getNombre() + ", en el " +
					zona.getZoo().getNombre();	
		}else{
			return "Mi nombre es "+ nombre + ", tengo una edad de " + edad + ", habito en " + habitat + 
					"y mi genero es " + genero;
		}
	}
	
}
