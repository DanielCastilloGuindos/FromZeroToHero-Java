package u2_4A2;

public class Coche{
	private Motor motor;
	private String Marca;
	private String Modelo;
	private double Precio = 0;

	public Coche(String Marca, String Modelo){
		this.Marca = Marca;
		this.Modelo = Modelo;
		this.motor = new Motor((int)Math.round(Math.random()*150));
	}

	public int getLitrosDeAceite(){
		return motor.getLitrosDeAceite();
	}
	public int getCV(){
		return motor.getCV();
	}
	public void setLitrosDeAceite(){
		this.motor.setLitrosDeAceite(10);
	}
	public String getMarca(){
		return Marca;
	}
	public String getModelo(){
		return Modelo;
	}
	public double getPrecio(){
		return Precio;
	}

	public void setAcumularAveria(double Precio){
		this.Precio += Precio;
	}
}