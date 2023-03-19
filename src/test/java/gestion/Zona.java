package gestion;

import zooAnimales.Animal;
import java.util.ArrayList;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	
	//metodos constructores
	
	public Zona() {
		nombre = null;
	}
	public Zona(String name, Zoologico newZoo) {
		nombre = name;
		zoo = newZoo;
	}
	
	//metodos set y get
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String name) {
		nombre = name;
	}
	public Zoologico getZoo() {
		return zoo;
	}
	public void setZoo(Zoologico newZoo) {
		zoo = newZoo;
	}
	public ArrayList<Animal> getAnimales() {
		return animales;
	}
	public void setAnimales(ArrayList<Animal> newAnimales) {
		animales = newAnimales;
	}
	
	//metodos
	
	public void agregarAnimales(Animal nuevo) {
		animales.add(nuevo);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}

}
