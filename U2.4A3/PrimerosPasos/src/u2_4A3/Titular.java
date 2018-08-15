package u2_4A3;

public class Titular {
	private String Nombre;
	private String Apellidos;
	private int Edad;
	
	public Titular(String Nombre, String Apellidos, int Edad){
		this.Nombre = Nombre;
		this.Apellidos = Apellidos;
		this.Edad = Edad;
	}
	
	public String getDameTodo(){
		return "Nombre: "+Nombre+". Apellidos: "+Apellidos+". Edad: "+Edad+".";
	}
}
