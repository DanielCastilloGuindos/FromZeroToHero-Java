package u2_4A3;

public class CuentaCorriente{
	protected Titular titular;
	protected String NumeroDeCuenta;
	protected double Saldo;
	
	public CuentaCorriente(String Nombre, String Apellidos, int Edad, String numerodecuenta,double saldo){
		this.titular = new Titular(Nombre, Apellidos, Edad);
		this.NumeroDeCuenta = numerodecuenta;
		this.Saldo = saldo;
	}
	
	public CuentaCorriente(String Nombre, String Apellidos, int Edad, String numerodecuenta){
		this.titular = new Titular(Nombre, Apellidos, Edad);
		this.NumeroDeCuenta = numerodecuenta;
		this.Saldo = 15.3;
	}

	public String getDameTitular(){
		return titular.getDameTodo();
	}
	public String getDameNumeroDeCuenta(){
		return "Nº: "+NumeroDeCuenta;
	}
	public String getDameSaldo(){
		return Saldo+"€";
	}
	
	public void setDandoSaldo(double saldo){
		this.Saldo = saldo;
	}
	public void setIngresar(double Ingreso){
		this.Saldo += Ingreso;
	}
	public void setReintegro(double Reintegro){
		this.Saldo -= Reintegro;
		this.Saldo = Math.round(Saldo);
	}
	public String getMostrar(){
		return titular.getDameTodo()+"Nº: "+NumeroDeCuenta+" Saldo:"+Saldo;
	}
	public String getComparar(String OtroNumeroDeCuenta){
		int Comparacion = NumeroDeCuenta.compareTo(OtroNumeroDeCuenta);
		if(Comparacion == 0){
			return "Las cuentas son iguales";
		} else {
			return "Las cuentas no son iguales";
		}
	}
}
