package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	//metodos constructores
	
	public Mamifero() {
		this("",0,"","",false,0);		
	}
	public Mamifero(String name, int age, String lugar, String gen, boolean Pelo, int cantidad) {
		setNombre(name);
		setEdad(age);
		setHabitat(lugar);
		setGenero(gen);
		pelaje = Pelo;
		patas = cantidad;
		listado.add(this);
	}
	
	//metodos get y set
	
	public ArrayList<Mamifero> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Mamifero> lista) {
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
		return listado.size();
	}
	
	public static Mamifero crearCaballo(String name, int age, String gen){
		caballos ++;
		return new Mamifero(name, age, "pradera", gen, true, 4); 		
	}
	
	public static Mamifero crearLeon(String name, int age, String gen) {
		leones ++;
		return new Mamifero(name, age, "selva", gen, true, 4);
	}

}
