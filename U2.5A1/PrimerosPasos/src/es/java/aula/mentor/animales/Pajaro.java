package es.java.aula.mentor.animales;

import es.java.aula.mentor.util.Interfaz;

public class Pajaro extends Animal implements Interfaz{
	private boolean Vuela;
	
	public Pajaro(String Nombre, int Edad, String Raza, boolean Vuela){
		super(Nombre, Edad, Raza);
		this.Vuela = Vuela;
	}

	public String getNombre(){
		return super.getNombre();
	}
	public int getEdad(){
		return super.getEdad();
	}
	public String getRaza(){
		return super.getRaza();
	}
	public String getPaisDeProcedencia(){
		super.setPaisDeProcedencia(Pais_Pajaro[(int)Math.round(Math.random()*2)]);
		return super.getPaisDeProcedencia();
	}
	public String getVuela(){
		if(this.Vuela) {
			return "Este pajaro sabe volar.";
		} else {
			return "Este pajaro no sabe volar.";
		}
	}
}