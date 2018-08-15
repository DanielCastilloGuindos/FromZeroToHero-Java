package u2_3A1;
import java.util.Scanner;

public class Factoriales {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner Teclado = new Scanner(System.in);
		int Num;
		double resultado = 1;
		System.out.print("Introduce un número: ");
		Num = Teclado.nextInt();
		for(int i = 1; i<=Num; i++){
			resultado *=i;
		};
		System.out.println(Math.round(resultado));
	}
}