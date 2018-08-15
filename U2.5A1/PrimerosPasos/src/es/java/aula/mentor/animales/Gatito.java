package es.java.aula.mentor.animales;

import es.java.aula.mentor.util.Interfaz;

public class Gatito extends Animal implements Interfaz{
	private boolean Cariñoso;
	
	public Gatito(String Nombre, int Edad, String Raza, boolean Cariñoso){
		super(Nombre, Edad, Raza);
		this.Cariñoso = Cariñoso;
	}
	
	public String getCariñoso() {
		if(this.Cariñoso) {
			return "Este gatito es cariñoso";
		} else {
			return "Este gatito no es cariñoso";
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
		super.setPaisDeProcedencia(Pais_Gatito[(int)Math.round(Math.random()*2)]);
		return super.getPaisDeProcedencia();
	}
}