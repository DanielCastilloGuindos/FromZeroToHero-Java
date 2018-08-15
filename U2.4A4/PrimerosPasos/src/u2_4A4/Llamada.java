package u2_4A4;

public class Llamada {
	private String NumeroDeOrigen;
	private String NumeroDeDestino;
	private int DuracionEnSegundos;
	private static int ContadorDeLlamadas;
	private int ContadorDeLlamada;
	
	public Llamada(String NumeroOrigen, String NumeroDestino, int DuracionEnSegundos) {
		this.NumeroDeOrigen = NumeroOrigen;
		this.NumeroDeDestino = NumeroDestino;
		this.DuracionEnSegundos = DuracionEnSegundos;
		ContadorDeLlamadas++;
		this.ContadorDeLlamada = ContadorDeLlamadas;
	}
	
	public String getNumeroOrigen() {
		return NumeroDeOrigen;
	}
	public String getNumeroDestino() {
		return NumeroDeDestino;
	}
	public int getDuracionEnSegundos() {
		return DuracionEnSegundos;
	}
	public int getContadorDeLlamada(){
		return ContadorDeLlamada;
	}
	
	public static int getContadorDeLlamadas(){
		return ContadorDeLlamadas;
	}
}