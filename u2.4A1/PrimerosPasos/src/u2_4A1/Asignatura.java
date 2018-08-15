package u2_4A1;

public class Asignatura {
	private int Identificador;
	private double Calificacion;
	
	public Asignatura(int Ident) {
		this.Identificador = Ident;
	}
	
	public int GetIdentificador() {
		return Identificador;
	}
	public double GetCalificacion() {
		return Calificacion;
	}
	
	public void SetCalificacion(double Calificacion) {
		this.Calificacion = Calificacion;
	}
}
