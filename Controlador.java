package Vendedores;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Controlador {
	
	static String rutaArchivo = "C:\\Users\\Juan Esteban\\eclipse-workspace\\Program3\\src\\Vendedores\\Untitled 3";
	static ListaVendedor vendedor = new ListaVendedor();
	
	public static void cargarArchivos() throws FileNotFoundException, IOException{
		BufferedReader bf = new BufferedReader(new FileReader(rutaArchivo));
		bf.lines().forEach((t) -> {
			String[] list = t.split(",");
			if (list.length == 2) {
			vendedor.insertar(new Vendedor(list[0], list[1]));
			}	
		});
	 }
	
	public static void totalSaldo() {
		int total = 0;
		NodoVendedor tmp = vendedor.getHead();
		while(tmp != null) {
			int Valor = Integer.parseInt(tmp.getVendedor().getSaldo().trim());
			int Balance = Integer.parseInt(tmp.getVendedor().getBalance().trim());
			tmp = tmp.getNext();
		}
		System.out.println("saldo:".concat(String.valueOf(total)));
	}
	
	
	

}
