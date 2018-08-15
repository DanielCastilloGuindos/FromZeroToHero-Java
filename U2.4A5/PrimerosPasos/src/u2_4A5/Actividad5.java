package u2_4A5;

public class Actividad5 {
	public static void main(String[] args) {
		Cifrador cifrador = new Cifrador();
		System.out.println("-- Algoritmo 1 --");
		System.out.println(cifrador.getEjecutar(95, 52, "Algoritmo1", "cifrar"));
		System.out.println(cifrador.getEjecutar(4940, 52, "Algoritmo1", "descifrar"));
		System.out.println("\n-- Algoritmo 2 --");
		System.out.println(cifrador.getEjecutar(95, 52, "Algoritmo2", "cifrar"));
		System.out.println(cifrador.getEjecutar(43, 52, "Algoritmo2", "descifrar"));
		System.out.println("\n-- Algoritmo 3 --");
		System.out.println(cifrador.getEjecutar(95, 52, "Algoritmo3", "cifrar"));
		System.out.println(cifrador.getEjecutar(107, 52, "Algoritmo3", "descifrar"));
	}
}