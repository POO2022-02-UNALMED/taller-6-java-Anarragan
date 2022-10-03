package vehiculos;

public class Vehiculo {
	
	protected String placa;
	protected String nombre;
	protected String traccion;
	protected int puertas;
	protected int velocidadMaxima;
	protected int precio;
	protected int peso;
	protected Fabricante fabricante;
	protected static int CantidadVehiculos=0;
	public static int CantidadAutomoviles=0;
	public static int CantidadCamiones=0;
	public static int CantidadCamionetas=0;
	
//Getters and setters	
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTraccion() {
		return traccion;
	}
	
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	
	public int getPuertas() {
		return puertas;
	}
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public Fabricante getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}
	
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		CantidadVehiculos = cantidadVehiculos;
	}
	
//methods
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso,
			String traccion, Fabricante fabricante) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		
		CantidadVehiculos++;
		fabricante.getPais().vendidos++;
		fabricante.vendidos++;
	}
	
	public static String vehiculosPorTipo(){
		return "Automoviles:"+CantidadAutomoviles+"\n"+"Camionetas:"+CantidadCamionetas+"\n"+"Camion:"+CantidadCamiones;
	}
	
	
	
	

}