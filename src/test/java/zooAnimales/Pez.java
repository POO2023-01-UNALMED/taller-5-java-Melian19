package zooAnimales;

public class Pez extends Animal{
	
	private static Pez[] listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	//metodos constructores
	
	public Pez() {
		setTotalAnimales(getTotalAnimales()+1);
		Pez[] nuevosAnimales = new Pez[listado.length + 1];
		nuevosAnimales[0] = this;
		for (int i = 1; i < nuevosAnimales.length; i++){
			nuevosAnimales[i] = listado[i-1];
		}
		listado = nuevosAnimales;
	}
	public Pez(String name, int age, String lugar, String gen, String color, int cantidad) {
		setNombre(name);
		setEdad(age);
		setHabitat(lugar);
		setGenero(gen);
		colorEscamas = color;
		cantidadAletas = cantidad;
		setTotalAnimales(getTotalAnimales()+1);
		Pez[] nuevosAnimales = new Pez[listado.length + 1];
		nuevosAnimales[0] = this;
		for (int i = 1; i < nuevosAnimales.length; i++){
			nuevosAnimales[i] = listado[i-1];
		}
		listado = nuevosAnimales;
	}
	
	//metodos get y set
	
	public Pez[] getListado() {
		return listado;
	}
	public void setListado(Pez[] lista) {
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
		return listado.length;
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

