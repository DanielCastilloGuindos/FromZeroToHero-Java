package u2_4A5;

public class Algoritmo1 implements Algoritmo{
	public int getCifrar(int Codigo, int NumDeterminado){
		return Codigo*NumDeterminado;
	}
	public int getDescifrar(int Codigo, int NumDeterminado){
		return Codigo/NumDeterminado;
	}
}