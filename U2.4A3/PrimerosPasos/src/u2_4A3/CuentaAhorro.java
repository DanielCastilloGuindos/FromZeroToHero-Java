package u2_4A3;

public class CuentaAhorro extends CuentaCorriente{
	private double Interes;
	
	public CuentaAhorro(String Nombre, String Apellidos, int Edad, String NumeroDeCuenta, double Saldo, double Interes){
		super(Nombre, Apellidos, Edad, NumeroDeCuenta, Saldo);
		this.Interes = Interes;
	}
	
	public CuentaAhorro(String Nombre, String Apellidos, int Edad, String NumeroDeCuenta, double Interes){
		super(Nombre, Apellidos, Edad, NumeroDeCuenta);
		this.Interes = Interes;
	}
	
	public CuentaAhorro(String Nombre, String Apellidos, int Edad, String NumeroDeCuenta){
		super(Nombre, Apellidos, Edad, NumeroDeCuenta);
		this.Interes = 2.5;
	}
	
	public String getDameTitular(){
		return titular.getDameTodo();
	}
	public String getDameNumeroDeCuenta(){
		return "Nº: "+NumeroDeCuenta;
	}
	public String getDameSaldo(){
		return "Saldo: "+super.getDameSaldo();
	}
	public String getDameInteres(){
		return "Interes: "+Interes+"%";
	}
	
	public String getCalcularInteres(){
		double Intereses;
		Intereses = (super.Saldo * this.Interes) + super.Saldo;
		return Intereses+"€";
	}
}
