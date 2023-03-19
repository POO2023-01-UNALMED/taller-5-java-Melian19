package gestion;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private Zona[] zonas;
	
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
	public Zona[] getZonas() {
		return zonas;
	}
	public void setZonas(Zona[] zone) {
		zonas = zone;
	}
		
	//metodos
	
	public void agregarZonas(Zona nueva){
		Zona[] nuevasZonas = new Zona[zonas.length + 1];
		nuevasZonas[0] = nueva;
		for (int i = 1; i < nuevasZonas.length; i++){
			nuevasZonas[i] = zonas[i-1];
		}
		zonas = nuevasZonas;
	}
	
	public int cantidadTotalAnimales() {
		int cantidadAnimales = 0;
		for (int i = 0; i < zonas.length; i++){
			int animales = zonas[i].cantidadAnimales();
			cantidadAnimales = cantidadAnimales + animales;
		}
		return cantidadAnimales;
		
	}

}
