package vehiculos;
import java.util.ArrayList;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	public int vendidos=0;
	public static ArrayList<Fabricante> listado = new ArrayList<Fabricante>();
	
//Getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public int getVendidos() {
		return vendidos;
	}
	public void setVendidos(int vendidos) {
		this.vendidos = vendidos;
	}
	
//methods
	
	public Fabricante(String nombre, Pais pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.vendidos = 0;
		listado.add(this);
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante vendedor = null;
		int vendidos=0;
		for (Fabricante fabricante: listado) {
			if(fabricante.vendidos>vendidos) {
				vendidos = fabricante.vendidos;
				vendedor = fabricante;
			}
		}
		return vendedor;
	}
	
}