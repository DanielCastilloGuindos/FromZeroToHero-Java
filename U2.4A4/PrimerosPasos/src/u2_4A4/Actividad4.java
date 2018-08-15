package u2_4A4;

public class Actividad4 {
	public static void main(String[] args) {
		Centralita Telefonica = new Centralita();
		LlamadaLocal PrimeraLlamadaLocal = new LlamadaLocal("984121541","919894911",(int)Math.round(Math.random()*999));
		LlamadaLocal SegundaLlamadaLocal = new LlamadaLocal("749213654","698451665",(int)Math.round(Math.random()*999));
		LlamadaLocal TerceraLlamadaLocal = new LlamadaLocal("674684635","918498746",(int)Math.round(Math.random()*999));
		LlamadaProvincial PrimeraLlamadaProvincial = new LlamadaProvincial("911564895","746516156",(int)Math.round(Math.random()*999),1);
		LlamadaProvincial SegundaLlamadaProvincial = new LlamadaProvincial("684121541","919894911",(int)Math.round(Math.random()*999),2);
		LlamadaProvincial TerceraLlamadaProvincial = new LlamadaProvincial("741561265","556465411",(int)Math.round(Math.random()*999),3);

		Telefonica.setRegistrarLlamadaLocal(PrimeraLlamadaLocal);
		System.out.println(Telefonica.getDatosLlamadaLocal());
		Telefonica.setRegistrarLlamadaLocal(SegundaLlamadaLocal);
		System.out.println(Telefonica.getDatosLlamadaLocal());
		Telefonica.setRegistrarLlamadaLocal(TerceraLlamadaLocal);
		System.out.println(Telefonica.getDatosLlamadaLocal());

		Telefonica.setRegistrarLlamadaProvincial(PrimeraLlamadaProvincial);
		System.out.println(Telefonica.getDatosLlamadaProvincial());
		Telefonica.setRegistrarLlamadaProvincial(SegundaLlamadaProvincial);
		System.out.println(Telefonica.getDatosLlamadaProvincial());
		Telefonica.setRegistrarLlamadaProvincial(TerceraLlamadaProvincial);
		System.out.println(Telefonica.getDatosLlamadaProvincial());

		System.out.println("\nHa habido un total de " + Llamada.getContadorDeLlamadas() + " llamadas.");
	}
}
