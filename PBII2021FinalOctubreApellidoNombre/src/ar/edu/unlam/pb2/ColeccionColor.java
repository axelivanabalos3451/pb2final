package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColeccionColor {
	/*ATRIBUTOS*/
	private List<Color> colores = new ArrayList<Color>();
	
	/*CONSTRUCTORES*/
	public ColeccionColor(){}
	
	/*ALTA COLORES*/
	public void altaColor(Color color){

		colores.add(color);
	}
	
	/*LISTAR COLORES*/
	public List<Color> listaColor(){
		return colores;

	}
	
	/*ELIMINAR COLOR*/
	public List<Color> bajaColor(Color color){
		Iterator<Color> it= colores.iterator();
		while(it.hasNext())
		{
			if (color.getColor().equals(it.next())) {}
		colores.remove(color);
		return colores;

	}
		return null;
	}
	/*GETTERS Y SETERS*/

	public List<Color> getColores() {
		return colores;
	}

	public void setColores(List<Color> colores) {
		this.colores = colores;
	}


	
	


	/*EQUALS Y HASHCODE*/
	
		@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colores == null) ? 0 : colores.hashCode());
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
		ColeccionColor other = (ColeccionColor) obj;
		if (colores == null) {
			if (other.colores != null)
				return false;
		} else if (!colores.equals(other.colores))
			return false;
		return true;
	}
	

}
