package es.java.aula.mentor;

import es.java.aula.mentor.animales.*;

public class Actividad1 {
	public static void main(String[] args){
		Perro Shiro = new Perro("Shiro", (int)Math.round(Math.random()*18), "Mastin", false);
		Perro Bruno = new Perro("Bruno", (int)Math.round(Math.random()*18), "Labrador", true);
		Gatito Africa = new Gatito("Africa", (int)Math.round(Math.random()*12), "Calico", false);
		Gatito MisTetas = new Gatito("MisTetas", (int)Math.round(Math.random()*12), "Carey", true);
		Pajaro Piolin = new Pajaro("Piolin", (int)Math.round(Math.random()*7), "Canario", true);
		Pajaro Curro = new Pajaro("Curro", (int)Math.round(Math.random()*7), "Periquito", false);
		
		System.out.println("--Perro 1--");
		System.out.println("El nombre del perro es: " + Shiro.getNombre() +
							"\nTiene una edad de: " + Shiro.getEdad() + " años." + 
							"\nDe la raza: " + Shiro.getRaza() +
							"\nViene del pais: " + Shiro.getPaisDeProcedencia() +
							"\n" + Shiro.getTraeElPeriodico());
		System.out.println("\n--Perro 2--");
		System.out.println("El nombre del perro es: " + Bruno.getNombre() +
							"\nTiene una edad de: " + Bruno.getEdad() + " años." + 
							"\nDe la raza: " + Bruno.getRaza() +
							"\nViene del pais: " + Bruno.getPaisDeProcedencia() +
							"\n" + Bruno.getTraeElPeriodico());
		
		System.out.println("\n--Gato 1--");
		System.out.println("El nombre del gatito es: " + Africa.getNombre() +
							"\nTiene una edad de: " + Africa.getEdad() + " años." + 
							"\nDe la raza: " + Africa.getRaza() +
							"\nViene del pais: " + Africa.getPaisDeProcedencia() +
							"\n" + Africa.getCariñoso());
		System.out.println("\n--Gato 2--");
		System.out.println("El nombre del gatito es: " + MisTetas.getNombre() +
							"\nTiene una edad de: " + MisTetas.getEdad() + " años." + 
							"\nDe la raza: " + MisTetas.getRaza() +
							"\nViene del pais: " + MisTetas.getPaisDeProcedencia() +
							"\n" + MisTetas.getCariñoso());
		
		System.out.println("\n--Pajaro 1--");
		System.out.println("El nombre del pajaro es: " + Piolin.getNombre() +
							"\nTiene una edad de: " + Piolin.getEdad() + " años." + 
							"\nDe la raza: " + Piolin.getRaza() +
							"\nViene del pais: " + Piolin.getPaisDeProcedencia() +
							"\n" + Piolin.getVuela());
		System.out.println("\n--Pajaro 2--");
		System.out.println("El nombre del pajaro es: " + Curro.getNombre() +
							"\nTiene una edad de: " + Curro.getEdad() + " años." + 
							"\nDe la raza: " + Curro.getRaza() +
							"\nViene del pais: " + Curro.getPaisDeProcedencia() +
							"\n" + Curro.getVuela());
	}
}