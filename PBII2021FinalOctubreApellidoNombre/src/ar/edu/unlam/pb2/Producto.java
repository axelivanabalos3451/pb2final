package ar.edu.unlam.pb2;

public class Producto implements Comparable<Producto>{
	/*ATRIBUTOS*/
	private Integer id;
	private String nombreProducto;
	private String descripcion;
	private Color color;
	private Talle talle;
	private Float precio;
	private Categoria categoria;
	private Boolean novedad;
	
	
	/*CONSTRUCTORES*/
	public Producto(int id, String nombreProducto, String descripccion, Color color, Talle talle, float precio, Categoria categoria, Boolean novedad) 
	{
		
		
	}

	/*GETTERS Y SETTERS*/
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Talle getTalle() {
		return talle;
	}
	public void setTalle(Talle talle) {
		this.talle = talle;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Boolean getNovedad() {
		return novedad;
	}
	public void setNovedad(Boolean novedad) {
		this.novedad = novedad;
	}


	
	
	
	
	/*EQUALS Y HASHCODE*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Producto other = (Producto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	} 
		
	/*COMPARE TO*/
	
	public int compareTo(Producto p) 
	{
		
		return this.id.compareTo(p.getId());
	}
	
	
}
