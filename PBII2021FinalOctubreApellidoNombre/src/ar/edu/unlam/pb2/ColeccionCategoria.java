package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColeccionCategoria {
	/*ATRIBUTOS*/
	private List<Categoria> categorias=new ArrayList<Categoria>();;
	
	/*CONSTRUCTORES*/
	public ColeccionCategoria()
	{
		
	}
	
	/*GETTERS Y SETERS*/

	
	/*ALTA CATEGORIAS*/
	public void altaCategoria(Categoria categoria){
		categorias.add(categoria);
		

	}
	
	/*LISTAR CATEGORIAS*/
	public List<Categoria> listaCategoria(){
		return categorias;

	}
	
	/*ELIMINAR CATEGORIA*/
	public List<Categoria> bajaCategoria(Categoria categoria){
		Iterator<Categoria> it= categorias.iterator();
		while(it.hasNext())
		{
			if (categoria.getCategoria().equals(it.next())) 
			{
				categorias.remove(categoria);
				
				return categorias;
			}
						
		}
		return null;
		

	}

	/*EQUALS Y HASHCODE*/
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categorias == null) ? 0 : categorias.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ColeccionCategoria other = (ColeccionCategoria) obj;
		if (categorias == null) {
			if (other.categorias != null)
				return false;
		} else if (!categorias.equals(other.categorias))
			return false;
		return true;
	}
	
	
	

}
