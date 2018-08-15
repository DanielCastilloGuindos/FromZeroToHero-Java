package u2_4A2;

public class Motor{
	private int LitrosDeAceite;
	private int CV;

	public Motor(int CV){
		this.CV = CV;
		this.LitrosDeAceite = 0;
	}

	public int getLitrosDeAceite(){
		return LitrosDeAceite;
	}
	public int getCV(){
		return CV;
	}

	public void setLitrosDeAceite(int LitrosDeAceite){
		this.LitrosDeAceite += LitrosDeAceite;
	}
}