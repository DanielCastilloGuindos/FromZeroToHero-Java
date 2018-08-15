package u2_4A2;

public class Garaje{
	private Coche cochecito;
	String Averia; //Privatizandola tambien va pero me salta con que no tiene un setter
	private int CochesAtendidos;
	private boolean GarajeOcupado = false;

	public boolean getAceptarCoche(Coche cochecito, String Averia){
		if(GarajeOcupado == false){
			this.cochecito = cochecito;
			this.Averia = Averia;			
			this.CochesAtendidos++;
			this.GarajeOcupado = true;
			
			if(Averia.equals("Aceite")){
				this.cochecito.setLitrosDeAceite();
			}

			return GarajeOcupado;
		} else {
			return !GarajeOcupado;
		}
	}
	
	public void setDevolverCoche(){
		this.GarajeOcupado = false;
	}
	
	public int getCochesAtendidos() {
		return CochesAtendidos;
	}
	
	public void setAcumulandoAveria(){
		this.cochecito.setAcumularAveria(Math.round(Math.random()*100));
	}
}