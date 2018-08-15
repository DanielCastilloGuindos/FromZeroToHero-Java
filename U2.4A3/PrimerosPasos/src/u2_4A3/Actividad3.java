package u2_4A3;

public class Actividad3 {
	public static void main(String[] args) {
		String Nombre1 = "Paquito";
		String Nombre2 = "Michelle";
		String Nombre3 = "Sara";
		String Nombre4 = "Daniel";
		String Nombre5 = "Lorena";
		String Apellidos1 = "Chocolatero";
		String Apellidos2 = "Lennon";
		String Apellidos3 = "Alvarez";
		String Apellidos4 = "Castillo";
		String Apellidos5 = "Hitler";
		int Edad1 = 26;
		int Edad2 = 21;
		int Edad3 = 48;
		int Edad4 = 22;
		int Edad5 = 30;
		String NumeroDeCuenta1 = "656456189";
		String NumeroDeCuenta2 = "465461546";
		String NumeroDeCuenta3 = "956451654";
		String NumeroDeCuenta4 = "891984541";
		String NumeroDeCuenta5 = "148462564";
		double Saldo1 = 1000;
		double Saldo3 = 3560;
		double CambiarSaldoA = 700;
		double Ingreso = 150;
		double Sacar = 100;
		double Interes3 = 21.04;
		double Interes4 = 50.00;
	
	//Cuenta1
		System.out.println("----Cuenta 1----");
		CuentaCorriente Cuenta1 = new CuentaCorriente(Nombre1, Apellidos1, Edad1, NumeroDeCuenta1, Saldo1);
		System.out.println("El titular de la cuenta 1 es: "+Cuenta1.getDameTitular());
		System.out.println("El numero de cuenta de la cuenta 1 es: "+Cuenta1.getDameNumeroDeCuenta());
		System.out.println("El saldo de la cuenta 1 es: "+Cuenta1.getDameSaldo());
		//Cambiamos el saldo
		Cuenta1.setDandoSaldo(CambiarSaldoA);
		//Hacemos que nos saque el valor de saldo que acabamos de cambiar
		System.out.println("Cambiamos saldo de la cuenta 1 es: "+Cuenta1.getDameSaldo()+"(CambiarSaldo)");
		System.out.println("Datos importantes de la cuenta 1: "+Cuenta1.getMostrar()+"(Mostrar)");
		//Comparacion
		System.out.println("Comparando numero de cuenta de cuenta1("+NumeroDeCuenta1+") con numero de cuenta de cuenta2("+NumeroDeCuenta2+").");
		System.out.println(Cuenta1.getComparar(NumeroDeCuenta2));
		
	//Cuenta2
		System.out.println("----Cuenta 2----");
		CuentaCorriente Cuenta2 = new CuentaCorriente(Nombre2, Apellidos2, Edad2, NumeroDeCuenta2);
		System.out.println("El titular de la cuenta 2 es: "+Cuenta2.getDameTitular());
		System.out.println("El numero de cuenta de la cuenta 2 es: "+Cuenta2.getDameNumeroDeCuenta());
		System.out.println("El saldo de la cuenta 2 es: "+Cuenta2.getDameSaldo()+"(Saldo predeterminado)");
		//Hacemos un ingreso
		Cuenta2.setIngresar(Ingreso);
		//Hacemos que nos saque el valor de saldo que acabamos de cambiar
		System.out.println("El saldo de la cuenta 2 es: "+Cuenta2.getDameSaldo()+"(Saldo+ingreso)");
		//Sacamos dinero(Reintegro)
		Cuenta2.setReintegro(Sacar);
		System.out.println("El saldo de la cuenta 2 es: "+Cuenta2.getDameSaldo()+"(Saldo+ingreso-reintegro)");
		//Comparacion
		System.out.println("Comparando numero de cuenta de cuenta2("+NumeroDeCuenta2+") con numero de cuenta de cuenta2("+NumeroDeCuenta2+").");
		System.out.println(Cuenta2.getComparar(NumeroDeCuenta2));
		
		
	//Cuenta3
		System.out.println("----Cuenta 3----");
		CuentaAhorro Cuenta3 = new CuentaAhorro(Nombre3, Apellidos3, Edad3, NumeroDeCuenta3, Saldo3, Interes3);
		System.out.println("El titular de la cuenta 3 es: "+Cuenta3.getDameTitular());
		System.out.println("El numero de cuenta de la cuenta 3 es: "+Cuenta3.getDameNumeroDeCuenta());
		System.out.println("El saldo de la cuenta 3 es: "+Cuenta3.getDameSaldo());
		System.out.println("El saldo de la cuenta 3 es: "+Cuenta3.getDameInteres()+"(Añadido por nosotros)");
		System.out.println("La cuenta 3 tiene un interes de: "+Cuenta3.getCalcularInteres());

	//Cuenta4
		System.out.println("----Cuenta 4----");
		CuentaAhorro Cuenta4 = new CuentaAhorro(Nombre4, Apellidos4, Edad4, NumeroDeCuenta4, Interes4);
		System.out.println("El titular de la cuenta 4 es: "+Cuenta4.getDameTitular());
		System.out.println("El numero de cuenta de la cuenta 4 es: "+Cuenta4.getDameNumeroDeCuenta());
		System.out.println("El saldo de la cuenta 4 es: "+Cuenta4.getDameSaldo());
		System.out.println("El saldo de la cuenta 4 es: "+Cuenta4.getDameInteres()+"(Añadido por nosotros)");
		System.out.println("La cuenta 4 tiene un interes de: "+Cuenta4.getCalcularInteres());
		
	//Cuenta5
		System.out.println("----Cuenta 5----");
		CuentaAhorro Cuenta5 = new CuentaAhorro(Nombre5, Apellidos5, Edad5, NumeroDeCuenta5);
		System.out.println("El titular de la cuenta 5 es: "+Cuenta5.getDameTitular());
		System.out.println("El numero de cuenta de la cuenta 5 es: "+Cuenta5.getDameNumeroDeCuenta());
		System.out.println("El saldo de la cuenta 5 es: "+Cuenta5.getDameSaldo()+"(Predefinido)");
		System.out.println("El saldo de la cuenta 5 es: "+Cuenta5.getDameInteres()+"(Predefinido)");
		System.out.println("La cuenta 5 tiene un interes de: "+Cuenta5.getCalcularInteres());
	}
}