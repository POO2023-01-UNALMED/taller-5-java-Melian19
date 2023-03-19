package gestion;

import java.util.ArrayList;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	//metodos constructores
	
	public Zoologico(String name, String lugar) {
		nombre = name;
		ubicacion = lugar;
	}
	public Zoologico() {
		nombre = null;
		ubicacion = null;
	}
	
	//metodos get y set
	
	public String getNombre() {
		return nombre;		
	}
	public void setNombre(String name) {
		nombre = name;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String lugar) {
		ubicacion = lugar;
	}
	public ArrayList<Zona> getZona() {
		return zonas;
	}
	public void setZona(ArrayList<Zona> zone) {
		zonas = zone;
	}
		
	//metodos
	
	public void agregarZonas(Zona nueva){
		zonas.add(nueva);
	}
	
	public int cantidadTotalAnimales() {
		int cantidadAnimales = 0;
		for (int i = 0; i < zonas.size(); i++){
			cantidadAnimales = zonas.get(i).cantidadAnimales();
;		}
		return cantidadAnimales;
		
	}

}
