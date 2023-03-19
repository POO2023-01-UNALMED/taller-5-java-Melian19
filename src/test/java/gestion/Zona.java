package gestion;

import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private Animal[] animales;
	
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
	public Animal[] getAnimales() {
		return animales;
	}
	public void setAnimales(Animal[] newAnimales) {
		animales = newAnimales;
	}
	
	//metodos
	
	public void agregarAnimales(Animal nuevo) {
		Animal[] nuevosAnimales = new Animal[animales.length + 1];
		nuevosAnimales[0] = nuevo;
		for (int i = 1; i < nuevosAnimales.length; i++){
			nuevosAnimales[i] = animales[i-1];
		}
		animales = nuevosAnimales;
	}
	
	public int cantidadAnimales() {
		int totalAnimales = 0;
		for (int i = 0; i < animales.length; i++) {
			int animalesZona = animales[i].getTotalAnimales();
			totalAnimales = totalAnimales + animalesZona;
		}
		return totalAnimales;
	}

}
