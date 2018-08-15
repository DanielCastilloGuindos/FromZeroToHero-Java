package u2_4A1;

public class Actividad1 {

	public static void main(String[] args) {
		Asignatura Ingles = new Asignatura(1);
		Asignatura BaseDeDatos = new Asignatura(2);
		Asignatura ServiciosEnRed = new Asignatura(3);
		Alumno PaquitoEjemplo = new Alumno(Ingles, BaseDeDatos, ServiciosEnRed);
		Profesor UnProfesor = new Profesor();
		UnProfesor.PonerNotas(PaquitoEjemplo);
		System.out.println(UnProfesor.CalcularMedia(PaquitoEjemplo));
	}
}