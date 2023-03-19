package zooAnimales;

public class Ave extends Animal {
	
	private static Ave[] listado;
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
		setTotalAnimales(getTotalAnimales()+1);
		Ave[] nuevosAnimales = new Ave[listado.length + 1];
		nuevosAnimales[0] = this;
		for (int i = 1; i < nuevosAnimales.length; i++){
			nuevosAnimales[i] = listado[i-1];
		}
		listado = nuevosAnimales;
	}
	public Ave() {
		setTotalAnimales(getTotalAnimales()+1);
		Ave[] nuevosAnimales = new Ave[listado.length + 1];
		nuevosAnimales[0] = this;
		for (int i = 1; i < nuevosAnimales.length; i++){
			nuevosAnimales[i] = listado[i-1];
		}
		listado = nuevosAnimales;
	}
	
	//metodos get y set
	
	public Ave[] getListado() {
		return listado;
	}
	public void setListado(Ave[] lista) {
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
		return listado.length;
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
