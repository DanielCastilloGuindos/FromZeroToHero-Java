package u2_4A2;

public class Actividad2{
	public static void main(String[] args) {
		Garaje GarajesPaquito = new Garaje();
		Coche Coche1 = new Coche("MiMarca","MiModelo");
		Coche Coche2 = new Coche("OtraMarca","OtroModelo");

		System.out.println("Metemos un coche1, ¿Nos deja? -> " + GarajesPaquito.getAceptarCoche(Coche1, "Aceite"));
		System.out.println("Metemos otro coche2, ¿Nos deja? -> " + GarajesPaquito.getAceptarCoche(Coche2, "Un fallo de "));
		GarajesPaquito.setDevolverCoche();
		System.out.println("Devolvemos el coche1 que estaba dentro");
		GarajesPaquito.setAcumulandoAveria();
		System.out.println("Metemos un coche2, ¿Nos deja? -> " + GarajesPaquito.getAceptarCoche(Coche2, "Cv"));
		GarajesPaquito.setDevolverCoche();
		System.out.println("Devolvemos el coche2 que estaba dentro");
		GarajesPaquito.setAcumulandoAveria();
		System.out.println("Metemos un coche1, ¿Nos deja? -> " + GarajesPaquito.getAceptarCoche(Coche1, "Aceite"));
		System.out.println("Metemos otro coche2, ¿Nos deja? -> " + GarajesPaquito.getAceptarCoche(Coche2, "Aceite"));
		GarajesPaquito.setDevolverCoche();
		System.out.println("Devolvemos el coche1 que estaba dentro");
		GarajesPaquito.setAcumulandoAveria();
		System.out.println("Metemos un coche2, ¿Nos deja? -> " + GarajesPaquito.getAceptarCoche(Coche2, "Aceite"));
		GarajesPaquito.setDevolverCoche();
		System.out.println("Devolvemos el coche2 que estaba dentro");
		GarajesPaquito.setAcumulandoAveria();

		System.out.println("--DATOS COCHE1--");
		System.out.println("Marca: " + Coche1.getMarca());
		System.out.println("Modelo: " + Coche1.getModelo());
		System.out.println("CV: " + Coche1.getCV());
		System.out.println("Litros de Aceite: " + Coche1.getLitrosDeAceite());
		System.out.println("Su precio total fue de: " + Coche1.getPrecio());
		System.out.println("--DATOS COCHE2--");
		System.out.println("Marca: " + Coche2.getMarca());
		System.out.println("Modelo: " + Coche2.getModelo());
		System.out.println("CV: " + Coche2.getCV());
		System.out.println("Litros de Aceite: " + Coche2.getLitrosDeAceite());
		System.out.println("Su precio total fue de: " + Coche2.getPrecio());
		
		System.out.println("Coches atendidos: " + GarajesPaquito.getCochesAtendidos());
	}
}