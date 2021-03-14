package posNeg;

import java.util.Scanner;

public class CiclosPosNeg {

	public static void main(String[] args) {
		
		int numero = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
		
		
		System.out.println("Ingresa un número: ");
		
		numero= entrada.nextInt();
		
		if(numero>0) {
			System.out.println("El número "+numero+" es positivo");
		}
		else if(numero<0) {
			System.out.println("El número "+numero+" es negativo");
		}
		else {
			System.out.println("El número que induciste es: "+numero+", por lo tanto termina el proceso");
		}
		

	}while (numero!=0);

}}
