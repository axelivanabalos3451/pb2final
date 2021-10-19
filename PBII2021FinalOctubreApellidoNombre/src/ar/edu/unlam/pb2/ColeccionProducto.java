package ar.edu.unlam.pb2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;




public class ColeccionProducto {
	/*ATRIBUTOS*/
	private Set<Producto> productos= new TreeSet<Producto>();

	/*CONSTRUCTORES*/
	public ColeccionProducto(){}
	
	/*BUSCAR PRODUCTO*/
	public Boolean buscaProducto(Producto producto) throws ProductoInexistenteException{
		
		Iterator<Producto> it= productos.iterator();
		while(it.hasNext())
		{
		if(producto.getId().equals(it.next().getId()))
		{
			return true;
			
		}else 
		{
			
			throw new ProductoInexistenteException();
		}
		}
		
		
		return null;
	}
	
	/*GUARDAR PRODUCTO EXISTENTE*/
	public void guardaProductoExistente(Producto producto){
		Iterator<Producto> it= productos.iterator();
		while(it.hasNext())
		{
		if(producto.getId().equals(it.next().getId()))
		{
			productos.add(producto);
			
		}

	}}
	
	/*ALTA DE PRODUCTO*/
	public Boolean altaProducto(Producto producto)throws ProductYaExisteException{

		Iterator<Producto> it= productos.iterator();
		while(it.hasNext())
		{
		if(producto.getId().equals(it.next().getId()))
		{
			
			throw new ProductYaExisteException();
			
			
		}else 
		{productos.add(producto);
			return true;
			
		}
		
		
		
		}
		
		
		return null;

     } 
	
	/*LISTADO DE PRODUCTOS*/
	public Set<Producto> verProductos(){
		return productos;

	}
	
	/*BAJA DE PRODUCTO*/
	public Boolean bajaProducto(Producto producto)throws ProductoInexistenteException{
		Iterator<Producto> it= productos.iterator();
		while(it.hasNext())
		{
		if(producto.getId().equals(it.next().getId()))
		{
			productos.add(producto);
			return true;
		}
		else 
		{
			throw new ProductoInexistenteException();
			
		}
		
		}
		
		return null;

    }

	/*MODIFICACION DE PRODUCTO*/
	public void modificacionProducto(Producto producto){

		Iterator<Producto> it= productos.iterator();
		while(it.hasNext())
		{
		if(producto.getId().equals(it.next().getId()))
		{
			productos.remove(it.next());
			productos.add(producto);
			
		}
    }}
	
	/*LISTADO DE PRODUCTOS POR CATEGORIA*/
	public Set<Producto> verProductosPorCategoria(Producto producto, String categoria){
		
		 ColeccionProducto col= new  ColeccionProducto();
		OrdenporCategoria ordenPorCategoria = new OrdenporCategoria();
		return col.Orden((Comparator) ordenPorCategoria);
		
		

	}
	
	
	private TreeSet<Producto> Orden(Comparator criterioDeOrdenacion) {
		
		TreeSet<Producto> productoOrdenado = new TreeSet<>(criterioDeOrdenacion);
		productoOrdenado.addAll(productos);
		return productoOrdenado;

	}
	
	/*LISTADO DE NOVEDADES*/
	public Set<Producto> verProductosNovedades(Producto producto){
		
		 ColeccionProducto col= new  ColeccionProducto();
			OrdenporCategoria ordenPorNovedades = new OrdenporNovedades();
			return col.Orden((Comparator) ordenPorNovedades);
			
			

	

	}
	
	/*GETTERS Y SETERS*/


	/*EQUALS Y HASHCODE*/
}
