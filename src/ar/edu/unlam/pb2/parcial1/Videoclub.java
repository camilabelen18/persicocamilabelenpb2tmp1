package ar.edu.unlam.pb2.parcial1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class Videoclub {

	private String nombreVideoclub;
	private List<Producto> listaDeProductos;

	public Videoclub(String nOMBRE_VIDEOCLUB) {
		this.nombreVideoclub = nOMBRE_VIDEOCLUB;
		this.listaDeProductos = new ArrayList<>();
	}

	public void agregarProducto(Producto nuevoProducto) {
		this.listaDeProductos.add(nuevoProducto);
	}

	public Producto buscarProducto(Producto nuevoProducto) {
		
		for (Producto producto : listaDeProductos) {
			if(producto.equals(nuevoProducto)) {
				return producto;
			}
		}
		
		return null;
	}

	public Boolean vender(Producto nuevoProducto, Cliente nuevoCliente) {
		return null;
	}



	
}
