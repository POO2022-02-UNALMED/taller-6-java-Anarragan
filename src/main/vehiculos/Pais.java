package vehiculos;
import java.util.ArrayList;

public class Pais {
	private String nombre;
	private int canti = 0;
	private static ArrayList<Pais>
	paises=new ArrayList<Pais>();
	
	
	public static Pais paisMasVendedor() {
		Pais mayor = paises.get(0);
		
		for(Pais i:paises) {
				if(i.canti > mayor.canti) {
				mayor = i;
				}
			}
		return mayor;
		
	}
	
	public Pais(String nombre) {
		this.nombre=nombre;	
		canti = 0;
		paises.add(this);
		
	}
		
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void sumarVentas() {
		canti +=1;
	}
	
	public static ArrayList<Pais> getPaises(){
		return paises;
	}
}


