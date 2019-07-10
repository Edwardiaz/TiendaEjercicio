package tiendaAbstracta;

public abstract class ProductosAbstracta implements TiendaInterfaz {

	private static double c, d, descuento, total;
	private static String area;

//	static boolean bool = true;
	@Override
	public double totalCompra(double precio, int cantidad) {

		setC(precio * cantidad);
		return getC();
	}

	public static double descuento() {

		if (getC() >= 50 && (areaProducto(1) == "Frutas" || areaProducto(2) == "Verduras" || areaProducto(3) == "Carnes")) {

			setDescuento(0.07);

			setD(getC() * getDescuento());

			setTotal(getC() - (getDescuento() * getC()));
			System.out.println("descuento de 7%");

		}

		if (getC() >= 20 && areaProducto(4) =="Granos Basicos") {

			setDescuento(0.05);

			setD(getC() * getDescuento());

			setTotal(getC() - (getC() * getDescuento()));
			System.out.println("descuento de 5%");

		}
		return getD();
	}

	public static String areaProducto(int areaP) {

		switch (areaP) {
		case 1:
			setArea("Frutas");
			break;
		case 2:
			setArea("Verduras");
			break;
		case 3:
			setArea("Carnes");
			break;
		case 4:
			setArea("Lacteos");
			break;
		case 5:
			setArea("Granos Basicos");
			break;
		default:
			setArea("Seleccion erronea");

		}
		return getArea();
	}

	public static double getC() {
		return c;
	}

	public static void setC(double c) {
		ProductosAbstracta.c = c;
	}

	public static double getDescuento() {
		return descuento;
	}

	public static void setDescuento(double descuento) {
		ProductosAbstracta.descuento = descuento;
	}

	public static double getD() {
		return d;
	}

	public static void setD(double d) {
		ProductosAbstracta.d = d;
	}

	public static String getArea() {
		return area;
	}

	public static void setArea(String area) {
		ProductosAbstracta.area = area;
	}

	public static double getTotal() {
		return total;
	}

	public static void setTotal(double total) {
		ProductosAbstracta.total = total;
	}

}
