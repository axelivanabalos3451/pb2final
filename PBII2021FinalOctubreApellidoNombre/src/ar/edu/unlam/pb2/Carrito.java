package ar.edu.unlam.pb2;
import java.util.Iterator;
import java.util.Map;

public class Carrito {
	/*ATRIBUTOS*/
	private Map<Producto, Integer> carrito;
	
	/* CONSTRUCTORES*/
	public Carrito()
	{
		
		
	}

	/*AGREGAR PRODUCTOS AL CARRITO*/
	public void agregarProductosAlcarrito(Producto producto, Integer unidades){
		carrito.put(producto, unidades);
		
	}
	
	/*LISTADO DE CARRITO*/
	public Map<Producto, Integer> listadoDeCarrito(){
		
		
		return carrito;
		
	}
	
	/*MUESTRA CANTIDAD DEL PRODUCTO EN EL CARRITO*/
	public Integer obtenerCantidadDeProductoEnCarrito(Producto producto){
		Iterator<Map.Entry<Producto, Integer>> car = carrito.entrySet().iterator();
		while (car.hasNext()) {
			Map.Entry<Producto, Integer> entry = car.next();
			if(entry.getKey()==producto) 
			{
				return  entry.getValue();
			}
			}
		
		return null;
		
	}

	/*ELIMINAR DE PRODUCTO DEL CARRITO*/
	public void eliminarProductosDelCarrito(Producto producto, Integer cantidad){
		
		
		Iterator<Map.Entry<Producto, Integer>> car = carrito.entrySet().iterator();
		while (car.hasNext()) {
			Map.Entry<Producto, Integer> entry = car.next();
			if(entry.getKey()==producto) 
			{
				
				carrito.remove(producto);
	
			}
			}
		
	}
}
