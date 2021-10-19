package ar.edu.unlam.pb2;

public class OrdenporNovedades extends OrdenporCategoria {
	public int compare(Producto j1, Producto j2) {
		// TODO Auto-generated method stub
		return j1.getNovedad().compareTo(j2.getNovedad());
	}

}
