package u2_4A4;

public class LlamadaLocal extends Llamada{
	private int Precio;
	
	public LlamadaLocal(String Origen, String Destino, int Duracion) {
		super(Origen, Destino, Duracion);
		this.Precio = 15;
	}
	
	public String getNumerolOrigenDeLlamadaLocal() {
		return super.getNumeroOrigen();
	}
	public String getNumeroDestinoDeLlamadaLocal() {
		return super.getNumeroDestino();
	}
	public int getDuracionEnSegundosDeLlamadaLocal() {
		return super.getDuracionEnSegundos();
	}
	public int getContadorDeLlamadaLocal(){
		return super.getContadorDeLlamada();
	}
	public int getPrecioDeLlamadaLocal() {
		return Precio;
	}
}