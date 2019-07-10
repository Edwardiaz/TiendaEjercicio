package tiendaAbstracta;

public interface TiendaInterfaz {
	
	static String nombreCliete="";
	static String producto="";
//	static double precio=0;
//	static int cantidad=0;
	static int areaProducto=0;
	static double descuento=0;
	static double total=0;
	
	public double totalCompra(double precio, int cantidad);
	
	public static double descuento() {
		return descuento;
	}
	
	public static int areaProducto() {
		return areaProducto;
	}
	
}
