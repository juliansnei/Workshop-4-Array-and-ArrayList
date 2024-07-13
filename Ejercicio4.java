package Ejercicios;
import java.util.Scanner;
public class Ejercicio4 {
	public static void main(String[] arg) {
		Scanner entry = new Scanner(System.in);
		int cantidad;
		double descuento = 0;
		int [] cantidadUnidad = new int[4];
		String [] products = new String[] {"papitas","cocacola","libra de arroz","salchicha"};
		float [] prices = new float[] {300,6000,3200,2500};
		float [] preciosTotales = new float[4];
		float totalFactura = 0;
		System.out.println("¡Bienvenido a la tienda de Julian!");
		System.out.println("Le vamos a mostrar una serie de productos con sus precios unitarios,\n porfavor escribe la cantidad de cada producto que quieras comprar\n (si no quieres llevar algun producto copia el numero cero):\n");
		for(int i = 0; i < products.length; i++) {
			System.out.print("Producto: " + products[i] + " , Precio Unitario: " + prices[i] + "$, ¿Cuanta cantidad quieres llevar?: ");
			cantidad = entry.nextInt();
			cantidadUnidad[i] = cantidad;
			preciosTotales[i] = prices[i] * cantidad;
			totalFactura += preciosTotales[i];
		}
		entry.close();
		System.out.println("\n");
		System.out.println("------FACTURA-----");
		for(int i = 0; i < products.length; i++) {
			System.out.println("Producto: " + products[i] + " , Precio Unitario: " + prices[i] + ", Cantidad de producto que llevas: " + cantidadUnidad[i] +", Precio total: " + preciosTotales[i] + "$\n");
		}
		System.out.println("Total Factura: " + totalFactura + "$\n");
		if(totalFactura >= 1000) {
			descuento = 0.25;
		} else if(totalFactura >= 500) {
			descuento = 0.2;
		} else if(totalFactura >= 300) {
			descuento = 0.15;
		} else if(totalFactura >= 200) {
			descuento = 0.1;
		} else if(totalFactura < 200) {
			descuento = 0;
		}
		System.out.println("Descuento: " + (descuento * 100) + "%\n");
		System.out.print("Total Neto(aplicado el descuento): " + (totalFactura - (totalFactura * descuento)));
	}
}
