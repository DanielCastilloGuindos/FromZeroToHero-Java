package u2_4A1;

public class Alumno {
	private Asignatura A;
	private Asignatura B;
	private Asignatura C;
	
	public Alumno(Asignatura a, Asignatura b, Asignatura c) {
		this.A = a;
		this.B = b;
		this.C = c;
	}
	public Alumno(int IdentificadorUno, int IdentificadorDos, int IdentificadorTres) {
		this.A = new Asignatura(IdentificadorUno);
		this.B = new Asignatura(IdentificadorDos);
		this.C = new Asignatura(IdentificadorTres);
	}
//Asignatura A
	public Asignatura GetAsignaturaA() {
		return A;
	}
	public int GetIdentificadorA() {
		return A.GetIdentificador();
	}
	public double GetCalificacionA() {
		return A.GetCalificacion();
	}
//Asignatura B
	public Asignatura GetAsignaturaB() {
		return B;
	}
	public int GetIdentificadorB() {
		return B.GetIdentificador();
	}
	public double GetCalificacionB() {
		return B.GetCalificacion();
	}
//Asignatura C
	public Asignatura GetAsignaturaC() {
		return C;
	}
	public int GetIdentificadorC() {
		return C.GetIdentificador();
	}
	public double GetCalificacionC() {
		return C.GetCalificacion();
	}
}