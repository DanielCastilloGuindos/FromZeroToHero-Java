package u2_4A4;

public class Centralita {
	private LlamadaLocal llamadaLocal;
	private LlamadaProvincial llamadaProvincial;
	private int PrecioFinalDeLlamadaLocal;
	private int PrecioFinalDeLlamadaProvincial;

	public void setRegistrarLlamadaLocal(LlamadaLocal llamadaLocal){
		this.llamadaLocal = llamadaLocal;
		this.PrecioFinalDeLlamadaLocal = llamadaLocal.getDuracionEnSegundosDeLlamadaLocal() * llamadaLocal.getPrecioDeLlamadaLocal();
	}

	public String getDatosLlamadaLocal(){
		return "\nNº de llamada: " + this.llamadaLocal.getContadorDeLlamadaLocal() +
				"\nNumero de origen: " + this.llamadaLocal.getNumerolOrigenDeLlamadaLocal() +
				"\nNumeroDeDestino: " + this.llamadaLocal.getNumeroDestinoDeLlamadaLocal() +
				"\nPrecio de las llamadas locales(En Centimos): " + this.llamadaLocal.getPrecioDeLlamadaLocal() +
				"\nDuracion(En segundos): " + this.llamadaLocal.getDuracionEnSegundosDeLlamadaLocal() +
				"\nPrecio final(En Centimos): " + this.PrecioFinalDeLlamadaLocal;
	}

	public void setRegistrarLlamadaProvincial(LlamadaProvincial llamadaProvincial){
		this.llamadaProvincial = llamadaProvincial;
		this.PrecioFinalDeLlamadaProvincial = llamadaProvincial.getDuracionEnSegundosDeLlamadaProvincial() * llamadaProvincial.getPrecioDeLlamadaProvincial();
	}
	public String getDatosLlamadaProvincial(){
		return "\nNº de llamada: " + this.llamadaProvincial.getContadorDeLlamadaProvincial() +
				"\nNumero de origen: " + this.llamadaProvincial.getNumerolOrigenDeLlamadaProvincial() +
				"\nNumeroDeDestino: " + this.llamadaProvincial.getNumeroDestinoDeLlamadaProvincial() +
				"\nDuracion(En segundos): " + this.llamadaProvincial.getDuracionEnSegundosDeLlamadaProvincial() +
				"\nZona horaria: " + this.llamadaProvincial.getZonaHorariaDeLlamadaProvincial() +
				"\nPrecio de las llamadas provinciales(En Centimos): " + this.llamadaProvincial.getPrecioDeLlamadaProvincial() +
				"\nPrecio final(En Centimos): " + this.PrecioFinalDeLlamadaProvincial;
	}
}