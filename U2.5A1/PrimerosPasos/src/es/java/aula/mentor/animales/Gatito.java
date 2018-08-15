package es.java.aula.mentor.animales;

import es.java.aula.mentor.util.Interfaz;

public class Gatito extends Animal implements Interfaz{
	private boolean Cari�oso;
	
	public Gatito(String Nombre, int Edad, String Raza, boolean Cari�oso){
		super(Nombre, Edad, Raza);
		this.Cari�oso = Cari�oso;
	}
	
	public String getCari�oso() {
		if(this.Cari�oso) {
			return "Este gatito es cari�oso";
		} else {
			return "Este gatito no es cari�oso";
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