package u2_4A5;

public class Cifrador{
	Algoritmo1 alg1 = new Algoritmo1();
	Algoritmo2 alg2 = new Algoritmo2();
	Algoritmo3 alg3 = new Algoritmo3();
	private int Codigo;
	private int NumDeterminado;
	private String Algoritmo;
	private String Orden;

	public String getEjecutar(int Codigo, int NumDeterminado, String Algoritmo, String Orden){
		this.Codigo = Codigo;
		this.NumDeterminado = NumDeterminado;
		this.Algoritmo = Algoritmo;
		this.Orden = Orden;
		if(this.Algoritmo.equalsIgnoreCase("algoritmo1")){
			if(this.Orden.equalsIgnoreCase("cifrar")){
				return "Usando el " + this.Algoritmo + " con los numeros " + this.Codigo + " y " + this.NumDeterminado + " tenemos como resultado: " + alg1.getCifrar(this.Codigo, this.NumDeterminado);
			} else if(this.Orden.equalsIgnoreCase("descifrar")){
				return "Usando el " + this.Algoritmo + " con los numeros " + this.Codigo + " y " + this.NumDeterminado + " tenemos como resultado: " + alg1.getDescifrar(this.Codigo, this.NumDeterminado);
			} else {
				return "Opcion no valida";
			}
		} else if(this.Algoritmo.equalsIgnoreCase("algoritmo2")){
			if(this.Orden.equalsIgnoreCase("cifrar")){
				return "Usando el " + this.Algoritmo + " con los numeros " + this.Codigo + " y " + this.NumDeterminado + " tenemos como resultado: " + alg2.getCifrar(this.Codigo, this.NumDeterminado);
			} else if(this.Orden.equalsIgnoreCase("descifrar")){
				return "Usando el " + this.Algoritmo + " con los numeros " + this.Codigo + " y " + this.NumDeterminado + " tenemos como resultado: " + alg2.getDescifrar(this.Codigo, this.NumDeterminado);
			} else {
				return "Opcion no valida";
			}
		} else if(this.Algoritmo.equalsIgnoreCase("algoritmo3")){
			if(this.Orden.equalsIgnoreCase("cifrar")){
				return "Usando el " + this.Algoritmo + " con los numeros " + this.Codigo + " y " + this.NumDeterminado + " tenemos como resultado: " + alg3.getCifrar(this.Codigo, this.NumDeterminado);
			} else if(this.Orden.equalsIgnoreCase("descifrar")){
				return "Usando el " + this.Algoritmo + " con los numeros " + this.Codigo + " y " + this.NumDeterminado + " tenemos como resultado: " + alg3.getDescifrar(this.Codigo, this.NumDeterminado);
			} else {
				return "Opcion no valida";
			}
		} else {
			return "Opcion no valida";
		}
	}
}