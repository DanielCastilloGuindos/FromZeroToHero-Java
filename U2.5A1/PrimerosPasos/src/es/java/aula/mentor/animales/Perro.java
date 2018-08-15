package es.java.aula.mentor.animales;

import es.java.aula.mentor.util.Interfaz;

public class Perro extends Animal implements Interfaz{
	private boolean TraeElPeriodico;
	
	public Perro(String Nombre, int Edad, String Raza, boolean TraeElPeriodico){
		super(Nombre, Edad, Raza);
		this.TraeElPeriodico = TraeElPeriodico;
	}

	public String getTraeElPeriodico() {
		if(this.TraeElPeriodico) {
			return "Este perro sabe traer el periodico";
		} else {
			return "Este perro no sabe traer el periodico";
		}
	}
	public String getNombre(){
		return "" + super.getNombre();
	}
	public int getEdad(){
		return super.getEdad();
	}
	public String getRaza(){
		return super.getRaza();
	}
	public String getPaisDeProcedencia(){
		super.setPaisDeProcedencia(Pais_Perro[(int)Math.round(Math.random()*2)]);
		return super.getPaisDeProcedencia();
	}
}