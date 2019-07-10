package TiendaMain;

import java.util.Scanner;

import tiendaPackage.TiendaController;

public class MainTienda {

	public static void main(String[] args) {

		TiendaController tc = new TiendaController();
		Scanner sc = new Scanner(System.in);
		double p;
		String n, t;
		int c, a;
		boolean bool = true;

		System.out.println("Bienvenido");
		System.out.println("Ingrese su nombre: ");
		n = sc.nextLine();
		System.out.println("Ingrese producto: ");
		t = sc.nextLine();
		System.out.println("ingrese el precio");
		p = sc.nextDouble();
		System.out.println("Ingrese la cantidad");
		c = sc.nextInt();

		System.out.println("Categoria: " + "\n1. Frutas" + "\n2. Verduras" + "\n3. Carnes" + "\n4. Lacteos"
				+ "\n5. Granos Basicos");
		do {
			try {

				a = Integer.parseInt(sc.nextLine());
				if (a >= 1 && a <= 5) {
					System.out.println("Gracias por su compra!");
					System.out.println("El detalle de venta es: "

							+ "\nElPrecio producto: " + tc.totalCompra(p, c) + "\nEl descuento fue de: "
							+ TiendaController.descuento() + "\nTOTAL: " + TiendaController.getTotal()
							+ "\nCategoria del producto: " + TiendaController.areaProducto(a));
					bool = false;
				}
			} catch (Exception e) {
				System.out.println("Solo numeros entre 1 al 5");
				bool = true;
			}
		} while (bool == true);

	}

}
