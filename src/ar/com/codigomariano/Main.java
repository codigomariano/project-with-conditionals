package ar.com.codigomariano;

public class Main {

	public static void main(String[] args) {
		int precio = 100;
		boolean vencido = false;
		String nombre;
		String dd;
		
		if(precio < 200) {
			System.out.println("El producto es demasiado económico");
		} else if (precio >=200 && precio <500 && !vencido) {
			System.out.println("El producto es el adecuado para comprar");
		} else if (precio >= 500 || vencido) {
			System.out.println("No vale la pena comprar este producto");
		} else {
			System.out.println("No se puede determinar si conviene comprar este producto");
		}
	}

}
