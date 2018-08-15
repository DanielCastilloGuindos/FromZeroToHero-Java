package u2_4A1;

public class Profesor {
	private double Media;
	
	public void PonerNotas(Alumno alumno) {
		alumno.GetAsignaturaA().SetCalificacion(Math.random()*10);
		alumno.GetAsignaturaB().SetCalificacion(Math.random()*10);
		alumno.GetAsignaturaC().SetCalificacion(Math.random()*10);
	}
	public double CalcularMedia(Alumno alumno) {
		this.Media = (alumno.GetCalificacionA() + alumno.GetCalificacionB()+ alumno.GetCalificacionC())/3;
		return Media;
	}
}