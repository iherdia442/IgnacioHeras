import java.util.*;
public class ClaseIgnacio {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca un n�mero");
		int numero = reader.nextInt();
		if(numero%2==0) {
		System.out.println("El n�mero es par");
		} else {
		System.out.println("El n�mero es impar");
		}
		reader.close();
}
}