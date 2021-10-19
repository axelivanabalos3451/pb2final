package ar.edu.unlam.pb2;

import java.util.Map;

public class Stock {
	/*ATRIBUTOS*/
	private Map<Producto, Integer> stock;
	
	/*CONSTRUCTORES*/
	private Stock(){
	}
	
	/*GETTERS Y SETTERS*/

	/*BUSCA PRODUCTO EN EL STOCK*/
	public Boolean buscaProductoEnStock(Producto producto)throws ProductoInexistenteException{
 
	}
	
	/*ALTA DE PRODUCTO EN EL STOCK*/
	public Boolean agregarProducto(Producto producto)throws ProductYaExisteException{
		
	}
	
	/*BAJA DE PRODUCTO EN STOCK*/
	public Boolean eliminarProducto(Producto producto){

	}
	
	/*LISTADO DE STOCK*/
	public Map<Producto, Integer> obtenerStock(){

	}
	
	/*MUESTRA CANTIDAD DEL PRODUCTO*/
	public Integer obtenerCantidad(Producto producto){

	}
	
	/*ALTA DE STOCK A PRODUCTO*/
	public Boolean agregarStock(Producto producto, Integer cantidad){

	}
	
	
	/*REVIERTE ALTA DE STOCK A PRODUCTO ("EL STOCK NO PUEDE SER NEGATIVO") */
	public Boolean revertirStock(Producto producto, Integer cantidad)throws StockNegativoException{

	}
	
	/*CARRITO (Baja la cantidad de stock)*/
	public Boolean comprarProducto(Producto producto, Integer cantidad){

	}

}
