package vehiculos;

public class Camion extends Vehiculo{
	
	private int ejes;

//Getters and setters
	
	public int getEjes() {
		return ejes;
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
//methods
	
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		Vehiculo.CantidadCamiones++;
	}
	

}