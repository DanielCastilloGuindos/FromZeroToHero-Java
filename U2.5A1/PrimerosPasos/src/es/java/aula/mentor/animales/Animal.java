package es.java.aula.mentor.animales;

public class Animal {
	private String Nombre;
	private int Edad;
	private String Raza;
	private String PaisDeProcedencia;

	public Animal(String Nombre, int Edad, String Raza){
		this.Nombre = Nombre;
		this.Edad = Edad;
		this.Raza = Raza;
	}

	public void setPaisDeProcedencia(String PaisDeProcedencia){
		this.PaisDeProcedencia = PaisDeProcedencia;
	}

	public String getNombre(){
		return Nombre;
	}
	public int getEdad(){
		return Edad;
	}
	public String getRaza(){
		return Raza;
	}
	public String getPaisDeProcedencia(){
		return PaisDeProcedencia;
	}
}