package u2_4A4;

public class LlamadaProvincial extends Llamada{
	private int Precio;
	private int ZonaHoraria;
	
	public LlamadaProvincial(String Origen, String Destino, int Duracion, int ZonaHoraria) {
		super(Origen, Destino, Duracion);
		this.ZonaHoraria = ZonaHoraria;
		switch(this.ZonaHoraria) {
			case 1:
				this.Precio = 20;
				break;
			case 2:
				this.Precio = 125;
				break;					
			case 3:
				this.Precio = 30;
				break;
		}
	}
	
	public String getNumerolOrigenDeLlamadaProvincial() {
		return super.getNumeroOrigen();
	}
	public String getNumeroDestinoDeLlamadaProvincial() {
		return super.getNumeroDestino();
	}
	public int getDuracionEnSegundosDeLlamadaProvincial() {
		return super.getDuracionEnSegundos();
	}
	public int getContadorDeLlamadaProvincial(){
		return super.getContadorDeLlamada();
	}
	public int getPrecioDeLlamadaProvincial() {
		return Precio;
	}
	public int getZonaHorariaDeLlamadaProvincial() {
		return ZonaHoraria;
	}
}